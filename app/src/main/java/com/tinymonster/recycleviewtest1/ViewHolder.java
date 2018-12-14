package com.tinymonster.recycleviewtest1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by TinyMonster on 14/12/2018.
 */

public class ViewHolder extends RecyclerView.ViewHolder{
    TextView msg;//保持textView的引用，作为缓存

    public ViewHolder(View itemView) {
        super(itemView);
        msg=(TextView)itemView.findViewById(R.id.msg);
    }
}
