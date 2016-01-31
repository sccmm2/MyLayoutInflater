package com.example.sung.mylayoutinflater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        /*
        * 아래는 SubLayout.java파일을 생성하여 둘을 연결시켜주면서 서브레이아웃을 만드는 방법이다
        **/
        SubLayout layout1 = new SubLayout(this);

        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        container.addView(layout1);

        /**
         * 아래는 inflate 에 의해 서브레이아웃을 붙히는 방법이다
         */
        /*
        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        //시스템 서비스 참조 부분 뷰 붙이는 방법이다
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.sub_layout, container, true);

        Button button2 = (Button) container.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "부분화면의 버튼이 눌렸습니다", Toast.LENGTH_LONG).show();
            }
        });
        */
    }
}
