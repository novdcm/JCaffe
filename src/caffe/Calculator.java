package caffe;

import java.util.ArrayList;

public class Calculator implements Calculator_IF {


    @Override
    public boolean loadPrice(double value) {
        return false;
    }

    @Override
    public boolean loadPayment(String value) {
        return false;
    }

    @Override
    public boolean isTransactionPossible() {
        return false;
    }

    @Override
    public ArrayList<String> calculateExchange() {
        return null;
    }
}
