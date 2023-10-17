package com.example.nestedrecyclerviews.demos;

public class Model_ChildData {

    private String txttitle;
    private int img;

    public Model_ChildData(String title, int image) {
        this.txttitle = title;
        img = image;
    }

    public String getTxttitle() {
        return txttitle;
    }

    public void setTxttitle(String title) {
        this.txttitle = title;
    }

    public int getImage() {
        return img;
    }

    public void setImage(int image) {
        img = image;
    }

}
