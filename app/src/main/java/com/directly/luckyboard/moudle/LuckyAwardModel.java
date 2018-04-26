package com.directly.luckyboard.moudle;

import android.graphics.Bitmap;

/**
 * @author Xiao-Long Zhou
 * @date 2018/04/25
 */
public class LuckyAwardModel implements Cloneable {

    private String name;
    private Bitmap bitmap;
    private float rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
