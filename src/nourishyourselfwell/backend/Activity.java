package nourishyourselfwell.backend;

import java.util.Date;

public class Activity {
    private Date activityDate;
    private int calories;
    private String activityType;

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Activity(String activityType) {
        this.activityType = activityType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Activity(int calories) {
        this.calories = calories;
    }

    public Activity(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }
}
