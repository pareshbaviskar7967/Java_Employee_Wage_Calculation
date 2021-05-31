import java.util.function.Function;

public class Employee_Wage {

    public final String companyName;
    public final int Emp_RatePerHrs;
    public final int workingDays;
    public final int workingHrs;

    public Employee_Wage(String companyName, int Emp_RatePerHrs, int workingDays, int workingHrs) {
        this.companyName = companyName;
        this.Emp_RatePerHrs = Emp_RatePerHrs;
        this.workingDays = workingDays;
        this.workingHrs = workingHrs;
    }

    public int Function_EmpWage() {
        int emphrs = 0;
        int totalemphrs = 0;
        int totalworkingday = 0;
        int totalempwage = 0;
        int day = 0;

        while (totalemphrs <= 100 || totalworkingday < 20) {

            day++;
            totalworkingday++;
            int CheckEmp = (int) Math.floor(Math.random() * 10 % 3);

            switch (CheckEmp) {
                case 1:
                    emphrs = 8;
                    System.out.println("Employee is full-time present----Days is : " + totalworkingday
                            + " & Employee Hrs is : " + emphrs);
                    break;
                case 2:
                    emphrs = 4;
                    System.out.println("Employee is part-time present----Days is : " + totalworkingday
                            + " & Employee Hrs is : " + emphrs);
                    break;
                default:
                    System.out.println("Employee is absent----Day is : " + day);
                    emphrs = 0;
                    break;
            }
            totalemphrs += emphrs;
        }
        totalempwage = totalemphrs * Emp_RatePerHrs;
        return totalempwage;
    }

    public static void main(String[] args) {
        Employee_Wage JioMart = new Employee_Wage("JioMart", 20, 28, 100);
        Employee_Wage DMart = new Employee_Wage("DMart", 20, 30, 105);
        Employee_Wage AbcMart = new Employee_Wage("AbcMart", 20, 31, 98);
        System.out.println("\nTotal Employee Wage for : " + JioMart.companyName + " And Wage is : "
                + JioMart.Function_EmpWage() + "\n");
        System.out.println("\nTotal Employee Wage for : " + DMart.companyName + " And Wage is : "
                + DMart.Function_EmpWage() + "\n");
        System.out.println(
                "\nTotal Employee Wage for : " + AbcMart.companyName + " And Wage is : " + AbcMart.Function_EmpWage());
    }
}