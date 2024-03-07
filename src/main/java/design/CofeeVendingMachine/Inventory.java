package design.CofeeVendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String,Ingredient> itemsInventory;

    public Inventory() {
        this.itemsInventory = new HashMap<>();
    }

    private boolean checkAvailability(String ingredient, int amount) {
        Ingredient availableIngridient  = itemsInventory.get(ingredient);
        return availableIngridient != null && availableIngridient.getQuantity() >= amount;
    }

    private void updateInventory(String ingredient, int amount) {
        int remainingItems = itemsInventory.get(ingredient).getQuantity() - amount;
        Ingredient ingredientInInventory = itemsInventory.get(ingredient);
        ingredientInInventory.setQuantity(remainingItems);
        itemsInventory.put(ingredient,ingredientInInventory);
    }

    public void useInventory(String ingredient, int amount) {
        if (checkAvailability(ingredient, amount)) {
            updateInventory(ingredient,amount);
        }
    }


}
