package challenges.BillsBurger;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.price = price;
        this.name = name.toUpperCase();
    }

    public String getName() {
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getBasedPrice() {
        return price;
    }
    public double getAdjustedPrice(){
        return switch (size){
            case "SMALL" -> getBasedPrice() - 0.5;
            case "LARGE" -> getBasedPrice() +1;
            default -> getBasedPrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }
    public static void printItem(String name,double price ){
        System.out.printf("%20s:%6.2f%n ", name, price);
    }
}
