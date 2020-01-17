package caffe;

import java.util.ArrayList;

public interface Calculator_IF {
    public boolean loadPrice(double value);
    public boolean loadPayment(String value);
    public boolean isTransactionPossible();
    public ArrayList<String> calculateExchange();
}
