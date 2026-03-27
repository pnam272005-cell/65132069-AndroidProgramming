package com.phuongnam.baith9_recyclerview;

public class LandScape {
    private String landImageName;
    private String landCaption;

    public LandScape(String landImageName, String landCaption) {
        this.landImageName = landImageName;
        this.landCaption = landCaption;
    }

    public String getLandImageName() {
        return landImageName;
    }

    public void setLandImageName(String landImageName) {
        this.landImageName = landImageName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}