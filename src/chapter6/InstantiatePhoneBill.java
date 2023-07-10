package chapter6;

public class InstantiatePhoneBill {

    public static void main(String[] args) {
        PhoneBillCalculatorRedo phoneBill = new PhoneBillCalculatorRedo(10,55.50,9,12);
        phoneBill.printItemizedBills();
    }
}
