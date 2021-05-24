public class Employee_Wage {

    public static final int Emp_RatePerHrs = 20;
    public static final int workingDays = 20;

    public static void main(String[] args) {

        int emphrs = 0;
        int empwage = 0;
        int totalempwage = 0;
        int day = 0;

        for (int p = 0; p < 20; p++) {
            day++;
            int CheckEmp = (int) Math.floor(Math.random() * 10 % 3);

            switch (CheckEmp) {
                case 1:
                    System.out.println("Employee is present full-time----Day is : " + day);
                    emphrs = 8;
                    break;
                case 2:
                    System.out.println("Employee is present part-time----Day is : " + day);
                    emphrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent----Day is : " + day);
                    emphrs = 0;
                    break;
            }
            empwage = emphrs * Emp_RatePerHrs;
            totalempwage += empwage;
            System.out.println("Employee Wage is : " + empwage);
        }
        System.out.println("Total Employee Wage is : " + totalempwage);
    }
}