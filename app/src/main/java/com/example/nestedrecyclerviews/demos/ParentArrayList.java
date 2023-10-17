package com.example.nestedrecyclerviews.demos;

import java.util.ArrayList;
import java.util.List;

public class ParentArrayList {

    List<Model_Header> listparents = new ArrayList<>();

    public List<Model_Header> ParentDatas(){

        listparents.add(new Model_Header("Nature", getNature()));
        listparents.add(new Model_Header("Flower", getFlower()));
        listparents.add(new Model_Header("Blur", getBlur()));

        return listparents;
    }

    private List<Model_ChildData> getNature() {
        List<Model_ChildData> naturelist = new ArrayList<>();
        naturelist.add(new Model_ChildData("Image 1", R.drawable.wallpaper_1));
        naturelist.add(new Model_ChildData("Image 2", R.drawable.wallpaper_2));
        naturelist.add(new Model_ChildData("Image 3", R.drawable.wallpaper_3));
        naturelist.add(new Model_ChildData("Image 4", R.drawable.wallpaper_4));
        naturelist.add(new Model_ChildData("Image 5", R.drawable.wallpaper_5));
        return naturelist;
    }

    private List<Model_ChildData> getFlower() {
        List<Model_ChildData> flowerlist = new ArrayList<>();
        flowerlist.add(new Model_ChildData("Image 1", R.drawable.nature_1));
        flowerlist.add(new Model_ChildData("Image 2", R.drawable.nature_2));
        flowerlist.add(new Model_ChildData("Image 3", R.drawable.nature_3));
        flowerlist.add(new Model_ChildData("Image 4", R.drawable.nature_4));
        flowerlist.add(new Model_ChildData("Image 5", R.drawable.nature_5));
        return flowerlist;
    }

    private List<Model_ChildData> getBlur() {
        List<Model_ChildData> blurlist = new ArrayList<>();
        blurlist.add(new Model_ChildData("Image 1", R.drawable.blur_1));
        blurlist.add(new Model_ChildData("Image 2", R.drawable.blur_2));
        blurlist.add(new Model_ChildData("Image 3", R.drawable.blur_3));
        blurlist.add(new Model_ChildData("Image 4", R.drawable.blur_4));
        blurlist.add(new Model_ChildData("Image 5", R.drawable.blur_5));
        return blurlist;
    }

}
