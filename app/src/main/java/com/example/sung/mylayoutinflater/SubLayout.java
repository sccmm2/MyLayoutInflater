package com.example.sung.mylayoutinflater;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by sung on 2016. 1. 31..
 */
public class SubLayout extends LinearLayout {
    /**
     * 생성자를 항상 두개 이상을 만들어야 된덴다
     */
    public SubLayout(Context context) {
        super(context);

        init(context);
    }

    public SubLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        /**
         * 아래의 구문이 layout 폴더에 있는 sub_layout.xml과 SubLayout.java를 연결시켜주는 구문이다
         */
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.sub_layout, this, true);
    }

}
