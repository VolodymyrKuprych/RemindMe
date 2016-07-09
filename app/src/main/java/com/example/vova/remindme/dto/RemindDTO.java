package com.example.vova.remindme.dto;

/**
 * Created by vova on 09/07/2016.
 */
public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
