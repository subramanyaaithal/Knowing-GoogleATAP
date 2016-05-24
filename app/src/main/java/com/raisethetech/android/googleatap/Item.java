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
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("PROJECT ARA", "Use only the official materials.", R.drawable.ara ));
        items.add(new Item("PROJECT TANGO", "Use only the official materials.", R.drawable.tango));
        items.add(new Item("PROJECT JACQUARD", "Project Jacquard makes it possible to weave touch and gesture interactivity into any textile using standard, industrial looms.\n" +
                "Everyday objects such as clothes and furniture can be transformed into interactive surfaces. This is possible thanks to new conductive yarns, created in collaboration with our industrial partners.\n" +
                "Jacquard yarn structures combine thin, metallic alloys with natural and synthetic yarns like cotton, polyester, or silk, making the yarn strong enough to be woven on any industrial loom.\n" +
                "Jacquard yarns are indistinguishable from the traditional yarns that are used to produce fabrics today.", R.drawable.ara));
        items.add(new Item("PROJECT VAULT", "Use only the official materials.", R.drawable.tango));
        items.add(new Item("PROJECT SOLI", "Soli is a new sensing technology that uses miniature radar to detect touchless gesture interactions.\n\nSoli is a purpose-built interaction sensor that uses radar for motion tracking of the human hand.\n\n" +
                "The sensor tracks sub-millimeter motion at high speeds with great accuracy.\nGoogle is creating a ubiquitous gesture interaction language that will allow people to control devices with a simple, universal set of gestures.", R.drawable.ara));
        items.add(new Item("SPOTLIGHT STORIES", "Use only the official materials.", R.drawable.ara));

        return items;

    }

}
