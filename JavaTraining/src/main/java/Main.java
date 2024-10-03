import challenges.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee employee = new SalariedEmployee("Volha", "27/11/1989", "27/12/2020", 45000);
        System.out.println(employee);
        System.out.println(employee.collectPay());
    }
}