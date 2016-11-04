package com.imarneanu.myseries.custom;

import com.imarneanu.myseries.R;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by imarneanu on 11/4/16.
 */
public class CustomEmptyLayout extends FrameLayout {

    @BindView(R.id.empty_layout_progress_bar)
    ProgressBar mProgressBar;

    @BindView(R.id.empty_layout_empty_text)
    TextView mEmptyText;

    public CustomEmptyLayout(Context context) {
        super(context);
    }

    public CustomEmptyLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomEmptyLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.custom_empty_layout, this);
        ButterKnife.bind(this);
    }

    public void showLoading(boolean isLoading) {
        mProgressBar.setVisibility(isLoading ? VISIBLE : GONE);
        mEmptyText.setVisibility(!isLoading ? GONE : VISIBLE);
    }

    public void setEmptyText(String text) {
        mEmptyText.setText(text);
    }
}
