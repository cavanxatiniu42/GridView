package com.example.hoangphuong.gridview;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hoang Phuong on 4/6/2017.
 */

public class Model {
    private int id;
    private String title;
    private String name;
    private int imgId;

    public Model(int id, String title, String name, int imgId) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.imgId = imgId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
