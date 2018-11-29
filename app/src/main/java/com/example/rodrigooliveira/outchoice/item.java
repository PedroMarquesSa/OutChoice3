package com.example.rodrigooliveira.outchoice;

public class item {

    int background;
    String title;

    public item(int background, String title) {
        this.background = background;
        this.title = title;
    }

    public int getBackground() {
        return background;
    }

    public String getTitle() {
        return title;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

