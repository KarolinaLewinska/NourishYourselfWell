package nourishyourselfwell.backend;

import java.util.Date;

public class Activity {
    private Date activityDate;

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
