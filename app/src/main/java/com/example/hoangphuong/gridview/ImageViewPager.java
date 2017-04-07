package com.example.hoangphuong.gridview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 4/7/2017.
 */

public class ImageViewPager extends Activity{
    public Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");
        ArrayList<Model> dataList = new ArrayList<>();
        for (int i = 0; i < mThumbIds.length; i++){
            Model model = new Model(i, "Title " + (i+1), "Name " + (i+1), mThumbIds[i]);
            dataList.add(model);
        }
       // ImageAdapter imageAdapter = new ImageAdapter(this,dataList );

        List<ImageView> imageViews = new ArrayList<>();
        for (int i = 0; i <dataList.size() ; i++) {
            ImageView image = new ImageView(this);
            image.setImageResource(mThumbIds[i]);
            image.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageViews.add(image);

        }

        ImagePagerAdapter imagePager = new ImagePagerAdapter(imageViews);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(imagePager);
        viewPager.setCurrentItem(position);
    }
}
