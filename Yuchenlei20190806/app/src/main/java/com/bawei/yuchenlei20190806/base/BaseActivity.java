package com.bawei.yuchenlei20190806.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bawei.yuchenlei20190806.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        getView();
        getData();

    }

    protected abstract int getLayout();

    protected abstract void getView();

    protected abstract void getData();

}
