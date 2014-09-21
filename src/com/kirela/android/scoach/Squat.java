package com.kirela.android.scoach;

public class Squat extends Exercise {

    private static int NAME_ID = R.string.squat;

    public static Squat create(final int weight) {
        int[] warmUps = new int[4];
        int[] reps = new int[5];
        warmUps[0] = 20;
        warmUps[1] = (int)(0.4*weight);
        warmUps[2] = (int)(0.6*weight);
        warmUps[3] = (int)(0.7*weight);
        reps[0] = 2;
        reps[1] = 1;
        reps[2] = 1;
        reps[3] = 1;
        reps[4] = 3;
        return new Squat(warmUps, weight, reps, Squat.NAME_ID);
    }

    private Squat(final int[] ups, final int weight, final int[] reps, final int id) {
        super(ups, weight, reps, id);
    }

}
