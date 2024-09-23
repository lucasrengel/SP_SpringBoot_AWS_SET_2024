package enums.fixacao.model.entities;

public class OrderItem {

    private Product product;
    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public double subTotal(){
        return this.quantity * this.price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName()).append(", $").append(product.getPrice()).append(", Quantity: ").append(quantity).append(", Subtotal: $").append(subTotal()).append("\n");
        return sb.toString();
    }
}
