package com.zackmatthews.re_zoom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zachmathews on 7/10/15.
 */
public class ApplicantAdapter extends ArrayAdapter {

   private LayoutInflater inflater;
   private ArrayList al = new ArrayList<String>();
   private Context context;

    public ApplicantAdapter(Context context, int resource) {
        super(context, resource);

        this.context = context;


    }

    @Override
    public void add(Object object) {
        al.add(object);
    }

    @Override
    public void remove(Object object) {
        al.remove(object);
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null){
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(convertView == null){
            convertView = inflater.inflate(R.layout.applicant_card, parent, false);

        }

        TextView field1 = (TextView)convertView.findViewById(R.id.helloworld);

        field1.setText(al.get(position).toString());

        return convertView;
    }


    @Override
    public Object getItem(int position) {


        return al.get(position);
    }
}
