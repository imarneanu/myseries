package com.imarneanu.myseries.page.home;

import com.imarneanu.myseries.R;
import com.imarneanu.myseries.custom.views.CustomEmptyLayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by imarneanu on 11/4/16.
 */
public class HomeFragment extends Fragment {
    @BindView(R.id.home_empty_layout)
    CustomEmptyLayout mEmptyLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mEmptyLayout.setVisibility(View.VISIBLE);
        mEmptyLayout.setEmptyText("You have no series yet.");
    }
}
