package com.example.nestedrecyclerviews.demos;

import java.util.List;

public class Model_Header {

    private String headertxt;
    private List<Model_ChildData> model_childDataList;


    public Model_Header(String texts, List<Model_ChildData> childData) {
        this.headertxt = texts;
        this.model_childDataList = childData;
    }

    public String getHeader() {
        return headertxt;
    }

    public void setHeader(String genre) {
        this.headertxt = genre;
    }

    public List<Model_ChildData> getParentLists() {
        return model_childDataList;
    }

    public void setParentLists(List<Model_ChildData> dataList) {
        this.model_childDataList = dataList;
    }

}
