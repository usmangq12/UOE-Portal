package com.example.ueportal.Models;

public class NotificationModel {
   private int Id;
   private String Title;
   private String Description;
   private String StartDate;

    public NotificationModel() {
    }

    public NotificationModel(int id, String title, String description, String startDate) {
        Id = id;
        Title = title;
        Description = description;
        StartDate = startDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }
}
