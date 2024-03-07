package design.CofeeVendingMachine;

public class CoffeeVendingMachine {
    private Inventory inventory;
    private PaymentProcess paymentProcess;

    public CoffeeVendingMachine(Inventory inventory, PaymentProcess paymentProcess) {
        this.inventory = inventory;
        this.paymentProcess = paymentProcess;
    }

    //
    public CofeeType makeCoffee(CofeeType cofeeType) {
        // check availability
        // dispense the coffee
        // Handle Payment

        return cofeeType;
    }
}
