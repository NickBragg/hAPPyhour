package Utils;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.patrick.happyhour.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import Models.Bar;

/**
 * Created by Patrick on 11/23/2014.
 */
public class ListViewAdapter extends ArrayAdapter<Bar> {

    private Context context;
    private int layoutResourceId;
    private List<Bar> mBars;

    public ListViewAdapter(Context context, int layoutResourceId, List<Bar> data) {
        super(context, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.mBars = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.listview_bar_item, parent, false);

        }
        final Bar bar = mBars.get(position);

        TextView textViewName = (TextView)row.findViewById(R.id.textViewBarName);
        textViewName.setText(bar.getName());

        TextView textViewAddress = (TextView)row.findViewById(R.id.textViewBarAddress);
        textViewAddress.setText(bar.getAddress());

        TextView textViewRating = (TextView)row.findViewById(R.id.textViewRating);
        textViewRating.setText(bar.getRating());

        return row;
    }

    static class ViewHolder {
        TextView barName;
        TextView barAddress;
        TextView barRating;
    }


}
