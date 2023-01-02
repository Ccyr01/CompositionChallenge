public class SmartKitchen {
    private CoffeeMaker coffee;
    private DishWasher dishWasher;
    private Refrigerator fridge;

    public SmartKitchen() {
        coffee = new CoffeeMaker();
        dishWasher = new DishWasher();
        fridge = new Refrigerator();
    }

    public SmartKitchen(CoffeeMaker coffee, DishWasher dishWasher, Refrigerator fridge) {
        this.coffee = coffee;
        this.dishWasher = dishWasher;
        this.fridge = fridge;
    }
    public void doKitchenWork(){

        coffee.brewCoffee();
        dishWasher.doDishes();
        fridge.orderFood();
    }
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        coffee.setHasWorkToDo(coffeeFlag);
        fridge.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);

    }

    public CoffeeMaker getCoffee() {
        return coffee;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }
}
