package company;

public class Runner {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("SSN987", 140, 25);
        employees[0].setName("Vasja Ivanov");
        employees[0].setId(3465);
        employees[1] = new ContractEmployee("FTId20", 2000);
        employees[1].setName("Olja Krit");
        employees[1].setId(5635);
        employees[2] = new ContractEmployee("FTId25", 2500);
        employees[2].setName("Ivan Bilyk");
        employees[2].setId(2575);
        employees[3] = new SalariedEmployee("SSN123", 160, 19);
        employees[3].setName("Anna Stepova");
        employees[3].setId(7275);

        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (((Company) employees[i]).calculatePay() < (((Company) employees[j]).calculatePay())) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString() + ((Company) employees[i]).calculatePay());
        }
    }
}