package com.example.alllist;

public class model {

  private   String title,overview;
  private int maudio;
  private static int no_image=-1;
    private int gImageview=no_image;


    public model(int gImageview, String title, String overview) {
        this.gImageview = gImageview;
        this.title = title;
        this.overview = overview;
    }

    public model(String title, String overview, int maudio) {
        this.title = title;
        this.overview = overview;
        this.maudio = maudio;
    }

    public int getgImageview() {
        return gImageview;
    }

    public void setgImageview(int gImageview) {
        this.gImageview = gImageview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
    public boolean hasImage()
    {
        return gImageview != no_image;

    }

}
