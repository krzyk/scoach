package com.kirela.android.scoach;

public class Exercise {

    private final int[] warmUps;
    private final int weight;
    private final int[] reps;
    private final int nameId;

    public Exercise(final int[] warmUps, final int weight, final int[] reps,
        final int nameId) {
        this.warmUps = warmUps;
        this.weight = weight;
        this.reps = reps;
        this.nameId = nameId;
    }

    public int[] getWarmUps() {
        return warmUps;
    }

    public int getWeight() {
        return weight;
    }

    public int[] getReps() {
        return reps;
    }

    public int getNameId() {
        return nameId;
    }
}
