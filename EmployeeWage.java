import java.sql.SQLOutput;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    public static void main(String[] args) {
        System.out.println("Start to the Employee Wages");

        int dailyWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println("Employee Present");
            dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
        } else{
            System.out.println("Employee Absent");
        }
        System.out.println("Daily Wage => "+dailyWage);
    }
}

