package challenges.BillsBurger;

public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;
    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasedPrice() +
                ((extra1 == null ) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 :extra3.getAdjustedPrice());
    }
    public double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "HAM","BACON","SALAMI" -> 1.5;
            default -> 0.0;
        };
    }
    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));

    }
}
