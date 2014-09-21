package com.kirela.android.scoach;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Fragment fragment = getFragmentManager().findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new WorkoutFragment();
            getFragmentManager()
                .beginTransaction()
                .add(R.layout.main, fragment)
                .commit();
        }

    }
}
