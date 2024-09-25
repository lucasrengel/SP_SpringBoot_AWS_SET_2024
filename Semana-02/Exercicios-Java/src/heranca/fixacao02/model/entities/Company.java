package heranca.fixacao02.model.entities;

public class Company extends Tax {

    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if(numberOfEmployees < 15){
            return getAnualIncome() * 0.16;
        }else{
            return getAnualIncome() * 0.14;
        }
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

}
