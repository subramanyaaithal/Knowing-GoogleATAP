package com.raisethetech.android.googleatap;

/**
 * Created by Utkarsh on 23-05-16.
 */


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ramotion.foldingcell.FoldingCell;

import java.util.HashSet;
import java.util.List;

/**
 * Simple example of ListAdapter for using with Folding Cell
 * Adapter holds indexes of unfolded elements for correct work with default reusable views behavior
 */
public class FoldingCellListAdapter extends ArrayAdapter<Item> {

    private HashSet<Integer> unfoldedIndexes = new HashSet<>();

    public FoldingCellListAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }

    Integer[] imageId = {
            R.drawable.ara,
            R.drawable.tango,
            R.drawable.jacquard,
            R.drawable.tango,
            R.drawable.soli,
            R.drawable.tango,

    };

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get item for selected view
        Item item = getItem(position);
        // if cell is exists - reuse it, if not - create the new one from resource
        FoldingCell cell = (FoldingCell) convertView;
        ViewHolder viewHolder;
        if (cell == null) {
            viewHolder = new ViewHolder();
            LayoutInflater vi = LayoutInflater.from(getContext());
            cell = (FoldingCell) vi.inflate(R.layout.cell, parent, false);
            // binding view parts to view holder



            viewHolder.title = (TextView) cell.findViewById(R.id.title);
            viewHolder.image = (ImageView) cell.findViewById(R.id.title_image);
            viewHolder.description = (TextView) cell.findViewById(R.id.description);
            viewHolder.contentTitle = (TextView) cell.findViewById(R.id.content_title);
            cell.setTag(viewHolder);

        } else {
            // for existing cell set valid valid state(without animation)
            if (unfoldedIndexes.contains(position)) {
                cell.unfold(true);
            } else {
                cell.fold(true);
            }
            viewHolder = (ViewHolder) cell.getTag();
        }

        // bind data from selected element to view through view holder
        viewHolder.title.setText(item.getTitle());
        viewHolder.image.setImageResource(imageId[position]);
        viewHolder.description.setText(item.getDescription());
        viewHolder.contentTitle.setText(item.getTitle());


        return cell;
    }

    // simple methods for register cell state changes
    public void registerToggle(int position) {
        if (unfoldedIndexes.contains(position))
            registerFold(position);
        else
            registerUnfold(position);
    }

    public void registerFold(int position) {
        unfoldedIndexes.remove(position);
    }

    public void registerUnfold(int position) {
        unfoldedIndexes.add(position);
    }

    // View lookup cache
    private static class ViewHolder {
        TextView title;
        ImageView image;
        TextView description;
        TextView contentTitle;

    }
}
