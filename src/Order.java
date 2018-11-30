public class Order {
    private int orderID;
    private int unitsSold;
    private double price;
    private String product; //normally this would also be an object
    private static int lastOrderID = 1001;

    public Order(double price, int unitsSold, String product) {
        setOrderID(lastOrderID++);
        setPrice(price);
        setProduct(product);
        setUnitsSold(unitsSold);
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public static int getLastOrderID() {
        return lastOrderID;
    }

    public static void setLastOrderID(int lastOrderID) {
        Order.lastOrderID = lastOrderID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
