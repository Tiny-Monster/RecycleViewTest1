package com.tinymonster.recycleviewtest1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TinyMonster on 14/12/2018.
 */

public class MyAdapter extends ArrayAdapter<data>{
    private List<data> myDataList = new ArrayList<>();
    public MyAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        data myData = myDataList.get(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.msg=(TextView)view.findViewById(R.id.msg);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(ViewHolder) view.getTag();
        }
        viewHolder.msg.setText(myData.getMsg());
        return view;
    }
    class ViewHolder{
        TextView msg;
    }
}
