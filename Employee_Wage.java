public class Employee_Wage {

    public static final int Emp_RatePerHrs = 20;
    public static final int workingDays = 20;

    public static void main(String[] args) {

        int emphrs = 0;
        int totalempwage = 0;
        int totalemphrs = 0;
        int totalworkingday = 0;
        int day = 0;

        while (totalemphrs <= 100 && totalworkingday < 20) {

            day++;
            totalworkingday++;
            int CheckEmp = (int) Math.floor(Math.random() * 10 % 3);

            switch (CheckEmp) {
                case 1:
                    System.out.println("Employee is full-time present----Days is : " + totalworkingday
                            + " & Employee Hrs is : " + emphrs);
                    emphrs = 8;
                    break;
                case 2:
                    System.out.println("Employee is part-time present----Days is : " + totalworkingday
                            + " & Employee Hrs is : " + emphrs);
                    emphrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent----Day is : " + day);
                    emphrs = 0;
                    break;
            }
            totalemphrs += emphrs;
        }
        totalempwage = totalemphrs * Emp_RatePerHrs;
        System.out.println("The Max working Hrs : " + totalemphrs);
        System.out.println("The Max working Days : " + totalworkingday);
        System.out.println("Total Employee Wage is : " + totalempwage);
    }
}