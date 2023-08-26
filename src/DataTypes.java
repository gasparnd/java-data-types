public class DataTypes {
    public static void main(String[] args) {
        // NUMERIC DATA TYPES
        int n = 1234567899; // max 9 digits
        long nL = 1234567899423423423L ;  // long with L keyboard
        double nD = 123.454; // double
        float nF = 123.454F; // float with F keyboard


        var salary = 1000; // Int
        // pension 30% of salary
        var pension = salary * 0.03;  // double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var fullName = "Gaspar Dolcemascolo";
        System.out.println("EMPLOYEE: " + fullName + ", SALARY: " + totalSalary);
    }
}
