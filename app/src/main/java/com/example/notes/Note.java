package com.example.notes;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "note")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private int dayOfWeek;
    private String priority;

    public Note(int id, String title, String description, int dayOfWeek, String priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.priority = priority;
    }


    @Ignore
    public Note(String title, String description, int dayOfWeek, String priority) {
        this.title = title;
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public String getPriority() {
        return priority;
    }

    public static String getDayAsString(int position) {
        switch (position) {
            case 0:
                return "Понедельник";
            case 1:
                return "Вторник";
            case 2:
                return "Среда";
            case 3:
                return "Четверг";
            case 4:
                return "Пятница";
            case 5:
                return "Суббота";
            default:
                return "Воскресенье";
        }
    }
}
