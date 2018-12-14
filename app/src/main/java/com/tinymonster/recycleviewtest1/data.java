package com.tinymonster.recycleviewtest1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TinyMonster on 14/12/2018.
 */


public class data {

    private String msg;

    public data(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public static List<data> getDataList(){
        List<data> dataList=new ArrayList<>();
        for(int i=0;i<100;i++){
            dataList.add(new data("数据"+i));
        }
        return dataList;
    }
}

