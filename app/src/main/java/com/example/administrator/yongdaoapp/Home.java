package com.example.administrator.yongdaoapp;

import android.widget.ImageView;

/**
 * Created by Administrator on 2018/3/24 0024.
 */

public class Home {
    private String authorName;
    private int imageid;
    private String context;
    private int avatarid;

    public Home(String authorName, int imageid, String context, int avatarid) {
        this.authorName = authorName;
        this.imageid = imageid;
        this.context = context;
        this.avatarid = avatarid;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getContext() {
        return context;
    }

    public int getImageid() {
        return imageid;
    }

    public int getAvatarid() {
        return avatarid;
    }
}
