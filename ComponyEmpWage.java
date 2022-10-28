

public class ComponyEmpWage {

    public final String COMPONY_NAME;
    public final int TOTAL_WORKING_HOURS;
    public final int WORKING_DAYS_PER_MONTH;
    public final int WAGE_PER_HOUR;
    public int total_wage;

    public ComponyEmpWage(String COMPONY_NAME, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOURS) {
        this.COMPONY_NAME = COMPONY_NAME;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
        this.TOTAL_WORKING_HOURS = TOTAL_WORKING_HOURS;
    }
    public void setTotal_wage(int total_wage){
        this.total_wage = total_wage;
    }

    @Override
    public String toString() {
        return "ComponyEmpWage{" +
                "COMPONY_NAME='" + COMPONY_NAME + '\'' +
                ", total_wage=" + total_wage +
                '}';
    }
}
