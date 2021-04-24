package nourishyourselfwell.backend;

import java.util.Date;

public class Meal {
//    private int Id;
    private Date mealDate;

//    private String mealType;
    public Meal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    private String mealName;
//    private String mealHour;
    private int calories;

    public Meal(Date mealDate) {
        this.mealDate = mealDate;
    }

    public Meal(int calories) {
       
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Date getMealDate() {
        return mealDate;
    }

    public void setMealDate(Date mealDate) {
        this.mealDate = mealDate;
    }
    
}
