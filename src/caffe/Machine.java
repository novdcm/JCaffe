package caffe;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Machine {

    private Calculator calc;
    private Double[] menu;

    public Machine(){
        this.menu = new Double[10];
        menu[0] = 2d;
        menu[1] = 2.22;
        menu[2] = 0.02;
        menu[3] = 1.49;
        menu[4] = 1.99;
        menu[5] = 0.99;
        menu[6] = 3.33;
        menu[7] = 1.01;
        menu[8] = 0.11;
        menu[9] = 0.77;
    }
    

    public void pickFromMenu() {
        this.calc.loadPrice(new Random().nextInt(10));
    }

    public void insertPayment() {
        Scanner sc = new Scanner(System.in);
        String tmp_input;
        do {
            System.out.print("\nPlease insert your payment: ");
             tmp_input = sc.nextLine();           //Nezabudnut skontrolovat vstup pred konverziou na Double
        } while (!calc.loadPayment(tmp_input));
    }

    public void exchange() {
        if (!calc.isTransactionPossible()){
            System.out.println("Something went wrong!");
            return;
        }
        System.out.println("Your exchange:");
        for (String swap : calc.calculateExchange()) {
            System.out.print(swap+", ");
        }
        System.out.println("transaction complete.\n");
    }
}
