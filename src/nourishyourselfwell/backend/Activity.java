package nourishyourselfwell.backend;

import java.util.Date;

public class Activity {
    private Date activityDate;
    private String activityType;
    private int calories;
    
    public Activity(Date activityDate) {
        this.activityDate = activityDate;
    }
    
     public Activity(String activityType) {
        this.activityType = activityType;
    }
     
     public Activity(int calories) {
        this.calories = calories;
    }
     
    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }
    
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
