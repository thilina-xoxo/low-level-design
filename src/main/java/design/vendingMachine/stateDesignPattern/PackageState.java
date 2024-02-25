package design.vendingMachine.stateDesignPattern;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
