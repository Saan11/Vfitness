package com.udemymorteza.myapplication;

public class MovieModel {
    private String headingtitle, subheadingtitle;
  //  int img;
    public MovieModel() {
    }
    public MovieModel(String headingtitle,  String subheadingtitle) {
        this.headingtitle = headingtitle;
        //this.img = img;
        this.subheadingtitle = subheadingtitle;
    }

    public String getHeadingtitle() {
        return headingtitle;
    }

    public void setHeadingtitle(String headingtitle) {
        this.headingtitle = headingtitle;
    }


  /*  public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }*/

    public String getSubheadingtitle() {
        return subheadingtitle;
    }

    public void setSubheadingtitle(String subheadingtitle) {
        this.subheadingtitle = subheadingtitle;
    }
}
