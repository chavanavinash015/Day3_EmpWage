public class EmployeeWage {

    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;


    private final String COMPONY_NAME;
   private final int TOTAL_WORKING_HOURS;
   private final int WORKING_DAYS_PER_MONTH;
   private final int WAGE_PER_HOUR;
   private int total_wage;


    public EmployeeWage(String COMPONY_NAME, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOURS) {
        this.COMPONY_NAME = COMPONY_NAME;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
        this.TOTAL_WORKING_HOURS = TOTAL_WORKING_HOURS;
    }

    public int computeEmployeeWage(){
        int day = 1;
        int totalworkinghours = 0;
        int totalwage = 0;
        while(day <= WORKING_DAYS_PER_MONTH && totalworkinghours <= TOTAL_WORKING_HOURS) {
            int dailyWage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    totalworkinghours = totalworkinghours + FULL_TIME_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalworkinghours = totalworkinghours + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee Absent");
            }
            totalwage = totalwage + dailyWage;
            System.out.println("Daily Wage => "+day+ " => " + dailyWage);
            day++;
        }
        System.out.println("Total Wage => "+totalwage);
        System.out.println("Total Working Hours => "+totalworkinghours);
        return totalwage;
    }
    @Override
    public String toString() {
        return "EmployeeWage{" +
                "COMPONY_NAME='" + COMPONY_NAME + '\'' +
                ", total_wage=" + total_wage +
                '}';
    }
    public static void main(String[] args) {
        System.out.println("Start to the Employee Wages");
         EmployeeWage samsung = new EmployeeWage("Samsung",20,1,10);
         EmployeeWage lenovo = new EmployeeWage("Lenove",15,2,10);
         samsung.computeEmployeeWage();
        System.out.println(samsung);
        lenovo.computeEmployeeWage();
        System.out.println(lenovo);

        }
}




