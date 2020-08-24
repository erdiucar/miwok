package com.example.android.miwok;

import android.graphics.Color;

public class Word {
    private static final int N0_IMAGE_PROVIDED = -1;
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = N0_IMAGE_PROVIDED;
    private Color color;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != N0_IMAGE_PROVIDED;
    }
}
