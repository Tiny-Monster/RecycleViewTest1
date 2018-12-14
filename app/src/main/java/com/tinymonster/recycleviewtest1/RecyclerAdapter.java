package com.tinymonster.recycleviewtest1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TinyMonster on 14/12/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private static final String TAG= "RecyclerAdapter";
    public Context context;

    public List<data> dataList=new ArrayList<>();

    public data mData;

    private TextClickListener clickListener;
    public RecyclerAdapter(Context context,List<data> dataList){
        this.context=context;
        this.dataList=dataList;
    }

    /**
     * 创建viewholder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(context).inflate(R.layout.recycleview_item,parent,false);
        Log.e(TAG,"onCreateViewHolder");
        return new ViewHolder(item);
    }

    /**
     * 绑定数据
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            mData=dataList.get(position);
            ((ViewHolder) holder).msg.setText(mData.getMsg());
            if(clickListener!=null){
                ((ViewHolder) holder).msg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        clickListener.OnClick(((ViewHolder) holder).msg,position);
                    }
                });
            }
            Log.e(TAG,"onBindViewHolder:"+mData.getMsg());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void setClickListener(TextClickListener clickListener){
        this.clickListener=clickListener;
    }
}
