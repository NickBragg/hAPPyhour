package Utils;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.patrick.happyhour.R;

import java.util.ArrayList;

import Models.Bar;

/**
 * Created by Patrick on 11/23/2014.
 */
public class ListViewAdapter extends ArrayAdapter {

    private Context context;
    private int layoutResourceId;
    private ArrayList data = new ArrayList();

    public ListViewAdapter(Context context, int layoutResourceId, ArrayList data) {
        super(context, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new ViewHolder();

            holder.barName = (TextView) row.findViewById(R.id.textViewBarName);
            holder.barAddress = (TextView) row.findViewById(R.id.textViewBarAddress);
            holder.barRating = (TextView) row.findViewById(R.id.textViewRating);


            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }
        Bar barItem = (Bar) data.get(position);
        holder.barName.setText(barItem.getName());
        holder.barAddress.setText(barItem.getAddress());
        holder.barRating.setText(barItem.getRating());

        return row;
    }

    static class ViewHolder {
        TextView barName;
        TextView barAddress;
        TextView barRating;
    }


}
