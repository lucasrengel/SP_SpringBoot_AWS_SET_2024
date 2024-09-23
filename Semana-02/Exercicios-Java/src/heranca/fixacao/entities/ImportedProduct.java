package heranca.fixacao.entities;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " (Customs Fee: " + this.customsFee + ")";
    }

    public double totalPrice(){
        return super.getPrice() + customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
}
