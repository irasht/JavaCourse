package company;

public class SalariedEmployee extends Employee implements Company {
    private String socialSecurityNumber;
    private int time;
    private int rate;

    public SalariedEmployee(String socialSecurityNumber, int time, int rate) {
        super();
        this.socialSecurityNumber = socialSecurityNumber;
        this.time = time;
        this.rate = rate;
    }

    @Override
    public int calculatePay() {
        return rate * time;
    }
}