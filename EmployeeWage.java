import java.util.LinkedList;

public class EmployeeWage implements IComputeEmpWage {

   public static final int IS_FULL_TIME = 2;
   public static final int IS_PART_TIME = 1;
   private LinkedList<ComponyEmpWage> ComponyWageList;

    public EmployeeWage() {
       ComponyWageList = new LinkedList<>();
    }

    public void addComponyEmpWage(String COMPONY_NAME, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOUR) {
       ComponyEmpWage componyEmpWage = new ComponyEmpWage(COMPONY_NAME, WAGE_PER_HOUR, WORKING_DAYS_PER_MONTH, TOTAL_WORKING_HOUR);
        ComponyWageList.add(componyEmpWage);
    }



    public void computeEmployeeWage() {
       for (int i = 0; i < ComponyWageList.size(); i++) {
          ComponyEmpWage componyEmpWage = ComponyWageList.get(i);
          componyEmpWage.setTotal_wage(this.computeEmployeeWage(componyEmpWage));
           System.out.println(componyEmpWage);
       }
   }
   private int computeEmployeeWage(ComponyEmpWage componyEmpWage){
        int day = 1;
        int totalworkinghours = 0;
        int totalwage = 0;
        while(totalworkinghours <= componyEmpWage.WORKING_DAYS_PER_MONTH && totalworkinghours < componyEmpWage.WORKING_DAYS_PER_MONTH) {
            totalworkinghours++;
            int dailyWage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee Full Time");
                  dailyWage = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee Part Time");
                    dailyWage = 4;
                    break;
                default:
                    System.out.println("Employee Absent");
            }
            // total employee wage foe employee
               totalwage = totalwage + dailyWage;
            System.out.println("Daily Wage => "+day+ " => " + dailyWage);
            day++;
        }
        System.out.println("Total Wage => "+totalwage);
        return totalwage * componyEmpWage.WAGE_PER_HOUR;
    }

    public static void main(String[] args) {
        System.out.println("Start to the Employee Wages");
        IComputeEmpWage wageCalculate = new EmployeeWage();
        wageCalculate.addComponyEmpWage("Samsung",10,2,10);
        wageCalculate.addComponyEmpWage("Lenovo",15,4,10);
        wageCalculate.addComponyEmpWage("Mahindra",15,8,15);
        wageCalculate.computeEmployeeWage();
        }
}




