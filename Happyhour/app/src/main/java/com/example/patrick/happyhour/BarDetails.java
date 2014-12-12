package com.example.patrick.happyhour;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;

import com.example.patrick.happyhour.Constants;
import com.example.patrick.happyhour.GlobalState;



public class BarDetailsFragment extends Fragment {
    private GlobalState mGlobalState;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bar_details, container, false);
        mGlobalState = GlobalState.getInstance();
        return rootView;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle extras = getActivity().getIntent().getExtras();
        if(extras != null && mGlobalState != null) {
            position = extras.getInt(Constants.POSITION);
            Bar bar = mGlobalState.getBarList().get(position);

            TextView barName = (TextView) getActivity().findViewById(R.id.textViewDetailBarName);
            barName.setText(bar.getName());

            MapView imageMap = (MapView) getActivity().findViewById(R.id.MapView);
            MapView.setMapView(map.getMap());

            TextView barAddress = (TextView) getActivity().findViewById(R.id.textViewDetailBarAddress);
            barAddress.setText(bar.getAddress());

            TextView barSpecials = (TextView) getActivity().findViewById(R.id.textViewDetailBarSpecials);
            barSpecials.setText(bar.getSpecials());
        }
    }




    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_bar_details, container, false);
            return rootView;
        }
    }
}
