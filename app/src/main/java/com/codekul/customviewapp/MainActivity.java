package com.codekul.customviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    private void loadThroughCode(){

        ViewGroup.LayoutParams paramsRoot = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(paramsRoot);

        ViewGroup.LayoutParams paramsButton = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button btnOkay = new Button(this);
        btnOkay.setLayoutParams(paramsButton);
        linearLayout.addView(btnOkay);

        ViewGroup.LayoutParams paramsMyView = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        MyView myView = new MyView(this);
        myView.setLayoutParams(paramsMyView);
        linearLayout.addView(myView);

        setContentView(linearLayout);
    }
}
