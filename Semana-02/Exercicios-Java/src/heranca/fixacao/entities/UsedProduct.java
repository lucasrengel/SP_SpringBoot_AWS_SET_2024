package heranca.fixacao.entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return this.getName() + " (used) $" + this.getPrice() + " (Manufacture date: " + this.getManufactureDate() + ")";
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
