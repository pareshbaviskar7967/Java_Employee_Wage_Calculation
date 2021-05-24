public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Hello....Welcome to the Employee Wage Computation Problems");

        int CheckEmp = (int) Math.floor(Math.random() * 10 % 2);
        if (CheckEmp == 0)
            System.out.println("Employee is not present");
        else
            System.out.println("Employee is present");
    }
}