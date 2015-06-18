package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

/**
 * GKislin
 * 11.01.2015.
 */
public class UserMeal extends NamedEntity{
    private final LocalDateTime dateTime;
    private final int calories;
    private final Integer userId;

    public UserMeal(Integer id, User user, LocalDateTime dateTime, String description, int calories) {
        super(id,description);
        this.dateTime = dateTime;
        this.calories = calories;
        this.userId=user.getId();
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "UserMeal{" +
                "dateTime=" + dateTime +
                ", description="+name+
                ", calories=" + calories +
                '}';
    }
}
