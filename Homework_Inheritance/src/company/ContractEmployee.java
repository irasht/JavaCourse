package company;

public class ContractEmployee extends Employee implements Company {
    private String federalTaxIdmember;
    private final int FIXED_MONTHLY_PAYMENT;

    public ContractEmployee(String federalTaxIdmember, int FIXED_MONTHLY_PAYMENT) {
        super();
        this.federalTaxIdmember = federalTaxIdmember;
        this.FIXED_MONTHLY_PAYMENT = FIXED_MONTHLY_PAYMENT;
    }

    @Override
    public int calculatePay() {
        return FIXED_MONTHLY_PAYMENT;
    }
}