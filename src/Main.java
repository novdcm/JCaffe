import caffe.Machine;

public class Main {

    public static void main(String[] args) {
        Machine coffeMachine = new Machine();

        for (int i = 0; i < 5; i++) {
            coffeMachine.pickFromMenu();
            coffeMachine.insertPayment();
            coffeMachine.exchange();
        }
    }
}
