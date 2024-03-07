package design.CofeeVendingMachine;

public class Ingredient {
    private String ingredientType;
    private Integer quantity;

    public Ingredient(String ingredientType, Integer quantity) {
        this.ingredientType = ingredientType;
        this.quantity = quantity;
    }

    public String getIngredientType() {
        return ingredientType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
