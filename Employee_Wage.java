public class Employee_Wage {

    public static final int Emp_RatePerHrs = 20;

    public static void main(String[] args) {

        int emphrs = 0;
        int empwage = 0;
        int CheckEmp = (int) Math.floor(Math.random() * 10 % 3);

        switch (CheckEmp) {
            case 1:
                System.out.println("Employee is present full-time");
                emphrs = 8;
                break;
            case 2:
                System.out.println("Employee is present part-time");
                emphrs = 4;
                break;
            default:
                System.out.println("Employee is absent");
                emphrs = 0;
                break;
        }

        empwage = emphrs * Emp_RatePerHrs;
        System.out.println("Employee Wage is : " + empwage);
    }
}