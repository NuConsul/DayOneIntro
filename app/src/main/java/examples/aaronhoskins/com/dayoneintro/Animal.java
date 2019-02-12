package examples.aaronhoskins.com.dayoneintro;

import android.support.annotation.NonNull;

public class Animal {
    private boolean hasLimbs;
    private String outerCovering;
    private String dietType;

    public Animal() {
    }

    public Animal(boolean hasLimbs, String outerCovering, String dietType) {
        this.hasLimbs = hasLimbs;
        this.outerCovering = outerCovering;
        this.dietType = dietType;
    }

    public boolean isHasLimbs() {
        return hasLimbs;
    }

    public void setHasLimbs(boolean hasLimbs) {
        this.hasLimbs = hasLimbs;
    }

    public String getOuterCovering() {
        return outerCovering;
    }

    public void setOuterCovering(String outerCovering) {
        this.outerCovering = outerCovering;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    @NonNull
    @Override
    public String toString() {
        return "Diet = " + dietType
                + " | outerCovering =  "
                + outerCovering
                + " | Limbs = " + (hasLimbs ? "YES" : "NO");
    }
}
