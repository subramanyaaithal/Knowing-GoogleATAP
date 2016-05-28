package com.raisethetech.android.googleatap;

import java.util.ArrayList;

/**
 * Simple POJO model for example
 */
public class Item {

    private String title;
    private String description;
    private Integer imageID;


    public Item() {
    }

    public Item(String title, String description, Integer imageID) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * @return List of elements prepared for tests
     */


}
