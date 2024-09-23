package heranca.fixacao02.model.entities;

public abstract class Tax {
    private String name;
    private double anualIncome;

    public Tax() {
    }

    public Tax(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract double tax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
