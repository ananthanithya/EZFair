package edu.gatech.rts.ezfair.item;

/**
 * Created by Priyanka on 11/2/2014.
 */

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import edu.gatech.rts.ezfair.R;

public class OtherEntryAdapter extends ArrayAdapter<OtherEntryItem> {

    private Context context;
    private ArrayList<OtherEntryItem> items;
    private LayoutInflater vi;
    //private SparseBooleanArray mSelectedItemsIds;

    public OtherEntryAdapter(Context cont,ArrayList<OtherEntryItem> itms) {
        super(cont,0, itms);
        //mSelectedItemsIds = new SparseBooleanArray();
        this.context = cont;
        this.items = itms;
        vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        final OtherEntryItem i = items.get(position);
        if (i != null) {
            if(i.isSection()){
//                SectionItem si = (SectionItem)i;
//                v = vi.inflate(R.layout.list_item_section, null);
//
//                v.setOnClickListener(null);
//                v.setOnLongClickListener(null);
//                v.setLongClickable(false);
//
//                final TextView sectionView = (TextView) v.findViewById(R.id.list_item_section_text);
//                sectionView.setText(si.getTitle());
            }else{
                OtherEntryItem ei = i;
                v = vi.inflate(R.layout.list_item_entry, null);
                final TextView title = (TextView)v.findViewById(R.id.list_item_entry_title);
                final TextView current_token = (TextView)v.findViewById(R.id.list_item_current_token);


                if (title != null)
                    title.setText(ei.company_name);
                if(current_token != null)
                    current_token.setText(ei.count_ahead);

            }
        }
        return v;
    }

    //public void toggleSelection(int position) {
    //selectView(position, !mSelectedItemsIds.get(position));
    //}

}