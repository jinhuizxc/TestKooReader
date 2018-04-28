package com.example.jh;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.jinhui.testkooreader.R;
import com.koolearn.android.kooreader.fragment.LocalBooksFragment;

/**
 * Created by jinhui on 2018/4/27.
 * email: 1004260403@qq.com
 */

public class TestActivity extends AppCompatActivity {

    private LocalBooksFragment localBooksFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        localBooksFragment = new LocalBooksFragment();
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fl, localBooksFragment);
        transaction.commit();

    }
}
