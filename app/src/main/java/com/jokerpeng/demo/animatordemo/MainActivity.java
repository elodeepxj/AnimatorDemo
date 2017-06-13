package com.jokerpeng.demo.animatordemo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Animator animator;
    /**
     * 围绕Y轴旋转
     * */
    private Button btn_rotation_y;
    /**
     * 围绕X轴旋转
     * */
    private Button btn_rotation_x;
    /**
     * 沿着X轴平移
     * */
    private Button btn_translation_x;
    /**
     * 沿着Y轴平移
     * */
    private Button btn_translation_y;
    /**
     * 沿着X轴缩放
     * */
    private Button btn_scale_x;
    /**
     * 沿着Y轴缩放
     * */
    private Button btn_scale_y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAction();
    }

    private void initView() {
        btn_rotation_y = (Button) findViewById(R.id.btn_rotation_y);
        btn_rotation_x = (Button) findViewById(R.id.btn_rotation_x);
        btn_translation_x = (Button) findViewById(R.id.btn_translation_x);
        btn_translation_y = (Button) findViewById(R.id.btn_translation_y);
        btn_scale_y = (Button) findViewById(R.id.btn_scale_y);
        btn_scale_x = (Button) findViewById(R.id.btn_scale_x);
    }

    private void initData() {

    }

    private void initAction() {
        btn_rotation_x.setOnClickListener(this);
        btn_rotation_y.setOnClickListener(this);
        btn_translation_x.setOnClickListener(this);
        btn_translation_y.setOnClickListener(this);
        btn_scale_y.setOnClickListener(this);
        btn_scale_x.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(null != v){
            switch (v.getId()){
                case R.id.btn_rotation_y://围绕Y轴旋转
                    animator = ObjectAnimator.ofFloat(btn_rotation_y,"rotationY",0,180);
                    break;
                case R.id.btn_rotation_x://围绕X轴旋转
                    animator = ObjectAnimator.ofFloat(btn_rotation_x,"rotationX",0,180);
                    break;
                case R.id.btn_translation_x://沿着X轴平移
                    animator = ObjectAnimator.ofFloat(btn_translation_x,"translationX",0,200,0);
                    break;
                case R.id.btn_translation_y://沿着Y轴平移
                    animator = ObjectAnimator.ofFloat(btn_translation_y,"translationY",0,200,0);
                    break;
                case R.id.btn_scale_y://沿着Y轴缩放
                    animator = ObjectAnimator.ofFloat(btn_scale_y,"scaleX",1,2,1);
                    break;
                case R.id.btn_scale_x://沿着X轴缩放
                    animator = ObjectAnimator.ofFloat(btn_scale_x,"scaleY",1,2,1);
                    break;
            }
            animator.setDuration(2000);
            animator.start();
        }
    }
}
