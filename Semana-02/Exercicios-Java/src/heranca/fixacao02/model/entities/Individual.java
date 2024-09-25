package heranca.fixacao02.model.entities;

public class Individual extends Tax {

    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if(getAnualIncome() >= 20000){
            if(getHealthExpenditures() > 0){
                return (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
            }else{
                return getAnualIncome() * 0.25;
            }
        }else{
            if(getHealthExpenditures() > 0){
                return (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
            }else{
                return getAnualIncome() * 0.15;
            }
        }
    }
}
