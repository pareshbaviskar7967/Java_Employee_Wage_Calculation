public class Employee_Wage {
    public static void main(String[] args) {

        int Emp_RatePerHrs = 20;
        int emphrs = 0;
        int empwage = 0;
        int CheckEmp = (int) Math.floor(Math.random() * 10 % 3);

        if (CheckEmp == 1) {
            System.out.println("Employee is present full-time");
            emphrs = 8;
        } else if (CheckEmp == 2) {
            System.out.println("Employee is present part-time");
            emphrs = 4;
        } else {
            System.out.println("Employee is absent");
            emphrs = 0;
        }

        empwage = emphrs * Emp_RatePerHrs;
        System.out.println("Employee Wage is : " + empwage);
    }
}