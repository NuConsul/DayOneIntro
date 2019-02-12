package examples.aaronhoskins.com.dayoneintro;

import android.support.annotation.NonNull;

public class Bird extends Animal {
    private int beakLength;
    private int wingSpan;

    public Bird(boolean hasLimbs, String outerCovering, String dietType, int beakLength, int wingSpan) {
        super(hasLimbs, outerCovering, dietType);
        this.beakLength = beakLength;
        this.wingSpan = wingSpan;
    }


    public int getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(int beakLength) {
        this.beakLength = beakLength;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + " WingSpan = " + wingSpan + " beakLength = " + beakLength;
    }
}
