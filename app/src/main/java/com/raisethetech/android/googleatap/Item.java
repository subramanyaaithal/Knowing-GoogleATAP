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
        items.add(new Item("PROJECT ARA", "\t\t\t\t\tGoogle's attempt to build a smartphone that lets you swap out its parts like Lego blocks \njust by popping them on and off. Slide in a couple of speaker modules if you're throwing a party, insert an additional battery if you'll be out on the town or even slot in exotic modules like glucometers (for diabetics) or sensors to measure air quality. While we've recently seen LG attempt to build a modular smartphone with the G5, these Ara snap-on concepts are the kind of features you'd never find on a normal phone built for mass-market adoption.", R.drawable.ara ));
        items.add(new Item("PROJECT TANGO", "\t\t\t\t\tProject Tango is a platform that uses computer vision to give devices the ability to understand their position relative to the world around them. It's just like how you use your eyes to find your way to a room, to know where in the room you are, and know where the floor, the walls, and objects around you are.", R.drawable.tango));
        items.add(new Item("PROJECT JACQUARD", "\t\t\t\t\tProject Jacquard makes it possible to weave touch and gesture interactivity into any textile using standard, industrial looms.\n" +
                "Everyday objects such as clothes and furniture can be transformed into interactive surfaces. This is possible thanks to new conductive yarns, created in collaboration with our industrial partners.\n" +
                "Jacquard yarn structures combine thin, metallic alloys with natural and synthetic yarns like cotton, polyester, or silk, making the yarn strong enough to be woven on any industrial loom.\n" +
                "Jacquard yarns are indistinguishable from the traditional yarns that are used to produce fabrics today.", R.drawable.ara));
        items.add(new Item("PROJECT VAULT", "\t\t\t\t\tProject Vault is a secure computer contained entirely on a micro SD sized device. Google’s ATAP said the micro SD format made sense because there’s already advanced security features on your phone, contained in the SIM card, which protects the things important to carriers. Vault is designed to be an equivalent, but designed to project a user’s important content.\n" +
                "\n" +
                "They went with the micro SD form factor so that they could have more data throughput to project video, and they wanted storage (Vault has 4GB of data storage on board) and they wanted modularity, so you could take it wherever you wanted.", R.drawable.tango));
        items.add(new Item("PROJECT SOLI", "\t\t\t\t\tSoli is a new sensing technology that uses miniature radar to detect touchless gesture interactions.\n\nSoli is a purpose-built interaction sensor that uses radar for motion tracking of the human hand.\n\n" +
                "The sensor tracks sub-millimeter motion at high speeds with great accuracy.\nGoogle is creating a ubiquitous gesture interaction language that will allow people to control devices with a simple, universal set of gestures.", R.drawable.ara));
        items.add(new Item("SPOTLIGHT STORIES", "\t\t\t\t\tGoogle Spotlight Stories, a mobile app featuring immersive, 360-degree animated films originally developed by Motorola ahead of its 2011 Google acquisition, has now made its way to iOS devices. The app had been available on Android phones since fall 2013, when Google first introduced the new mobile storytelling format to consumers.\n" +
                "\n" +
                "Basically, the app can take advantage of the device’s sensors like its gyroscope and accelerometer in order to offer an immersive viewing experience. However, it doesn’t let end users create these sorts of movies for themselves.", R.drawable.ara));
        items.add(new Item("PROJECT ABACUS", "\t\t\t\t\tProject Abacus is a multi-modal system, designed to combine all of the individual security methods that only sort of work to create something that works an order of magnitude better than things like face unlock or voice detection. The end result is a constant system that generates a trust score based on your usage, including how you type words and what apps you load on top of things like voice and face detection. In the demonstration on stage, Project Abacus was able to clearly tell the difference between two users, which means the security measure could eventually do things like lock down all of the apps in real time when someone who isn't you picks up the phone.", R.drawable.ara));

        return items;

    }

}
