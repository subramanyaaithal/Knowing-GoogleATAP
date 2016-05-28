package com.raisethetech.android.googleatap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.ramotion.foldingcell.FoldingCell;

import java.util.ArrayList;

/**
 * Example of using Folding Cell with ListView and ListAdapter
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get our list view
        ListView theListView = (ListView) findViewById(R.id.mainListView);

        // prepare elements to display
        ArrayList<Item> items = getTestingList();

        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)
        final FoldingCellListAdapter adapter = new FoldingCellListAdapter(this, items);

        // set elements to adapter
        theListView.setAdapter(adapter);

        // set on click event listener to list view
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                // toggle clicked cell state
                ((FoldingCell) view).toggle(false);
                // register in adapter that state for selected cell is toggled
                adapter.registerToggle(pos);
            }
        });




    }

    public ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("PROJECT ARA", "Google's attempt to build a smartphone that lets you swap out its parts like Lego blocks just by popping them on and off. Slide in a couple of speaker modules if you're throwing a party, insert an additional battery if you'll be out on the town or even slot in exotic modules like glucometers (for diabetics) or sensors to measure air quality. While we've recently seen LG attempt to build a modular smartphone with the G5, these Ara snap-on concepts are the kind of features you'd never find on a normal phone built for mass-market adoption.", R.drawable.ara ));
        items.add(new Item("PROJECT TANGO", "Project Tango is a platform that uses computer vision to give devices the ability to understand their position relative to the world around them. It's just like how you use your eyes to find your way to a room, to know where in the room you are, and know where the floor, the walls, and objects around you are.", R.drawable.tango));
        items.add(new Item("PROJECT JACQUARD", "Project Jacquard makes it possible to weave touch and gesture interactivity into any textile using standard, industrial looms.\n" +
                "Everyday objects such as clothes and furniture can be transformed into interactive surfaces. This is possible thanks to new conductive yarns, created in collaboration with our industrial partners.\n" +
                "Jacquard yarn structures combine thin, metallic alloys with natural and synthetic yarns like cotton, polyester, or silk, making the yarn strong enough to be woven on any industrial loom.\n" +
                "Jacquard yarns are indistinguishable from the traditional yarns that are used to produce fabrics today.", R.drawable.ara));
        items.add(new Item("PROJECT VAULT", "Project Vault is a secure computer contained entirely on a micro SD sized device. Google’s ATAP said the micro SD format made sense because there’s already advanced security features on your phone, contained in the SIM card, which protects the things important to carriers. Vault is designed to be an equivalent, but designed to project a user’s important content.\n" +
                "\n" +
                "They went with the micro SD form factor so that they could have more data throughput to project video, and they wanted storage (Vault has 4GB of data storage on board) and they wanted modularity, so you could take it wherever you wanted.", R.drawable.tango));
        items.add(new Item("PROJECT SOLI", "Soli is a new sensing technology that uses miniature radar to detect touchless gesture interactions.\n\nSoli is a purpose-built interaction sensor that uses radar for motion tracking of the human hand.\n\n" +
                "The sensor tracks sub-millimeter motion at high speeds with great accuracy.\nGoogle is creating a ubiquitous gesture interaction language that will allow people to control devices with a simple, universal set of gestures.", R.drawable.ara));
        items.add(new Item("SPOTLIGHT STORIES", "Google Spotlight Stories, a mobile app featuring immersive, 360-degree animated films originally developed by Motorola ahead of its 2011 Google acquisition, has now made its way to iOS devices. The app had been available on Android phones since fall 2013, when Google first introduced the new mobile storytelling format to consumers.\n" +
                "\n" +
                "Basically, the app can take advantage of the device’s sensors like its gyroscope and accelerometer in order to offer an immersive viewing experience. However, it doesn’t let end users create these sorts of movies for themselves.", R.drawable.ara));
        items.add(new Item("PROJECT ABACUS", "Project Abacus is a multi-modal system, designed to combine all of the individual security methods that only sort of work to create something that works an order of magnitude better than things like face unlock or voice detection. The end result is a constant system that generates a trust score based on your usage, including how you type words and what apps you load on top of things like voice and face detection. In the demonstration on stage, Project Abacus was able to clearly tell the difference between two users, which means the security measure could eventually do things like lock down all of the apps in real time when someone who isn't you picks up the phone.", R.drawable.ara));

        return items;

    }
}
