//import java.util.function.Function;

class CompanyWage {

    public final String companyName;
    public final int Emp_RatePerHrs;
    public final int workingDays;
    public final int workingHrs;
    public int totalempwage;

    public CompanyWage(String companyName, int Emp_RatePerHrs, int workingDays, int workingHrs) {
        this.companyName = companyName;
        this.Emp_RatePerHrs = Emp_RatePerHrs;
        this.workingDays = workingDays;
        this.workingHrs = workingHrs;
    }

    public void setTotalEmpWage(int totalempwage) {
        this.totalempwage = totalempwage;
    }

    @Override
    public String toString() {
        return "\nTotal Employee Wage for : " + companyName + " And Wage is : " + totalempwage + "\n";
    }
}

public class Employee_Wage {
    private int no_company = 0;
    private CompanyWage[] companyarray;

    public Employee_Wage() {
        companyarray = new CompanyWage[5];
    }

    public void addcompanywage(String companyName, int Emp_RatePerHrs, int workingDays, int workingHrs) {
        companyarray[no_company] = new CompanyWage(companyName, Emp_RatePerHrs, workingDays, workingHrs);
        no_company++;
    }

    private void Function_EmpWage() {
        for (int i = 0; i < no_company; i++) {
            companyarray[i].setTotalEmpWage(this.Function_EmpWage(companyarray[i]));
            System.out.println(companyarray[i]);
        }
    }

    public int Function_EmpWage(CompanyWage companyWage) {
        int emphrs = 0;
        int totalemphrs = 0;
        int totalworkingday = 0;
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
        return totalemphrs * companyWage.Emp_RatePerHrs;
    }

    public static void main(String[] args) {
        Employee_Wage empwage = new Employee_Wage();
        empwage.addcompanywage("JioMart", 20, 28, 100);
        empwage.addcompanywage("DMart", 20, 30, 105);
        empwage.addcompanywage("AbcMart", 20, 31, 98);
        empwage.Function_EmpWage();
    }
}