public class Employee_Wage {
    public static void main(String[] args) {

        int Emp_RatePerHrs = 20;
        int emphrs = 0;
        int empwage = 0;
        int CheckEmp = (int) Math.floor(Math.random() * 10 % 2);

        if (CheckEmp == 1) {
            emphrs = 8;
        } else {
            emphrs = 0;
        }

        empwage = emphrs * Emp_RatePerHrs;
        System.out.println("Employee Wage is : " + empwage);
    }
}