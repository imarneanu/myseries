package com.imarneanu.myseries.utils;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by imarneanu on 11/4/16.
 */
public class Utils {
    /**
     * Clears activity's backstack
     *
     * @param appCompatActivity The activity which will have no fragments in backstack
     */
    public static void clearFullBackStack(AppCompatActivity appCompatActivity) {
        FragmentManager fragmentManager = appCompatActivity.getSupportFragmentManager();

        if (fragmentManager.getBackStackEntryCount() > 0) {
            // clear the fragment back stack
            FragmentManager.BackStackEntry first = fragmentManager.getBackStackEntryAt(0);
            fragmentManager.popBackStackImmediate(first.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
    }
}
