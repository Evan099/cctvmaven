package com.cctv.bean;

public class News {


    private int nid;
    private String title;
    private String context;
    private String coverbg;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCoverbg() {
        return coverbg;
    }

    public void setCoverbg(String coverbg) {
        this.coverbg = coverbg;
    }


    @Override
    public String toString() {
        return "News{" +
                "nid=" + nid +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", coverbg='" + coverbg + '\'' +
                '}';
    }
}
