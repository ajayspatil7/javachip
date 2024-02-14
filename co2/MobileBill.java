package co2;

public class MobileBill {
    private final double localRates;
    private final double isdRates;
    private final double internetPackage;


    // Default constructor
    public MobileBill() {
        this.localRates = 0.10;
        this.isdRates = 1.00;
        this.internetPackage = 500.00;
    }


    // Argument constructor
    public MobileBill(double local, double isd, double internet){
        this.localRates = local;
        this.isdRates = isd;
        this.internetPackage = internet;
    }

    // Calculating total bill
    public double totalBill(int localCalls, int isdCalls){
        double localCallCosts = localCalls * localRates;
        double isdCallsCosts = isdCalls * isdRates;
        double internetCost = isdCalls * internetPackage;

        return localCallCosts + isdCallsCosts + internetCost;
    }

    public static void main(String[] args) {
        MobileBill bill = new MobileBill();
        MobileBill argBill = new MobileBill(0.50, 7.00, 700.0);

        int localCalls = 50;
        int isdCalls = 10;

        double defaultBill = bill.totalBill(localCalls, isdCalls);
        System.out.println("Total Bill using Default Constructor : RS -> "+ defaultBill);

        double customBill = argBill.totalBill(localCalls, isdCalls);
        System.out.println("Total Bill using Argument Constructor : RS -> "+ customBill);

    }



}
