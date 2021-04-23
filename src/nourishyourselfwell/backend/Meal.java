package nourishyourselfwell.backend;

import java.util.Date;

public class Meal {
    private Date mealDate;

    public Meal(Date mealDate) {
        this.mealDate = mealDate;
    }

    public Date getMealDate() {
        return mealDate;
    }

    public void setMealDate(Date mealDate) {
        this.mealDate = mealDate;
    }
    
}
