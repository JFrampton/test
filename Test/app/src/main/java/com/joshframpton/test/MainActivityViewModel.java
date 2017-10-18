package com.joshframpton.test;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by rippi on 10/17/2017.
 */

public class MainActivityViewModel extends BaseObservable {

    private final String mString;

    public MainActivityViewModel() {
        mString = "Hello World Binding";
    }

    @Bindable
    public String getString() {
        return mString;
    }
}
