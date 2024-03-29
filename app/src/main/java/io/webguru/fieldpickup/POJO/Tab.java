package io.webguru.fieldpickup.POJO;

import android.support.v4.app.Fragment;

/**
 * Created by yatin on 21/01/17.
 */

public class Tab {
    private Fragment fragment;
    private String title;

    public Tab(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
