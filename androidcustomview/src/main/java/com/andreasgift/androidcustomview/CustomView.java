package com.andreasgift.androidcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class CustomView extends FrameLayout {

    private String labelText;
    private String contentText;

    private TextView labelTextView;
    private TextView contentTextView;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View v = inflate(context, R.layout.custom_view, null);
        addView(v);
        labelTextView = v.findViewById(R.id.label_text_view);
        contentTextView = v.findViewById(R.id.content_text_view);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);

        try {
            labelText = a.getString(R.styleable.CustomView_label_text);
            labelTextView.setText(labelText);

            contentText = a.getString(R.styleable.CustomView_content_text);
            contentTextView.setText(contentText);
        } finally {
            a.recycle();
        }
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setLabelText(String text){
        labelTextView.setText(text);
    }

    public void setContentText (String text){
        contentTextView.setText(text);
    }
}
