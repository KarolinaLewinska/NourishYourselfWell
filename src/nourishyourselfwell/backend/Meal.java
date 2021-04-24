package nourishyourselfwell.backend;

import java.util.Date;

public class Meal {
    
    private Date mealDate;
    private String mealName;
    private int calories;
    
    public Meal(Date mealDate) {
        this.mealDate = mealDate;
    }
    
    public Meal(String mealName) {
        this.mealName = mealName;
    }
    
    public Meal(int calories) {
        this.calories = calories;
    }
    
    public Date getMealDate() {
        return mealDate;
    }

    public void setMealDate(Date mealDate) {
        this.mealDate = mealDate;
    }
    
    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
   
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }   
}
