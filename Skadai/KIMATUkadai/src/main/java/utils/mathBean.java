package utils;

public class mathBean {
    private int hourlyRate;

    private int weeklyHours;
    private int weeksPerYear;

    private int annual_workweeks;

    @Override
    public String toString() {
        return "mathBean{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", weeksPerYear=" + weeksPerYear +
                ", annual_workweeks=" + annual_workweeks +
                '}';
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public int getWeeksPerYear() {
        return weeksPerYear;
    }

    public void setWeeksPerYear(int weeksPerYear) {
        this.weeksPerYear = weeksPerYear;
    }

    public int getAnnual_workweeks() {
        return annual_workweeks;
    }

    public void setAnnual_workweeks(int annual_workweeks) {
        this.annual_workweeks = annual_workweeks;
    }

    public mathBean(int hourlyRate, int weeklyHours, int weeksPerYear, int annual_workweeks) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.weeksPerYear = weeksPerYear;
        this.annual_workweeks = annual_workweeks;
    }
}
