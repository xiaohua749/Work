package com.example.anniu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class image_scale extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_scale;// 声明一个图像视图的对象
    private View v_content;
    private final static String TAG = "ImageScaleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_scale);

        // 从布局文件中获取名叫iv_scale的图像视图
        iv_scale = findViewById(R.id.iv_scale);

        // 从布局文件中获取名叫v_content的视图
        //v_content = findViewById(R.id.v_content);
        // 下面通过七个按钮，分别演示不同拉伸类型的图片拉伸效果
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_fitCenter).setOnClickListener(this);
        findViewById(R.id.btn_centerCrop).setOnClickListener(this);
        findViewById(R.id.btn_centerInside).setOnClickListener(this);
        findViewById(R.id.btn_fitXY).setOnClickListener(this);
        findViewById(R.id.btn_fitStart).setOnClickListener(this);
        findViewById(R.id.btn_fitEnd).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {  // 一旦监听到点击动作，就触发监听器的onClick方法
        if (v.getId() == R.id.btn_center) {
            // 将拉伸类型设置为“按照原尺寸居中显示”
            iv_scale.setScaleType(ImageView.ScaleType.CENTER);
            //v_content.setBackgroundResource(R.drawable.picture1);
        } else if (v.getId() == R.id.btn_fitCenter) {
            // 将拉伸类型设置为“保持宽高比例，拉伸图片使其位于视图中间”
            iv_scale.setScaleType(ImageView.ScaleType.FIT_CENTER);
           // v_content.setBackgroundResource(R.drawable.picture1);
        } else if (v.getId() == R.id.btn_centerCrop) {
            // 将拉伸类型设置为“拉伸图片使其充满视图，并位于视图中间”
            iv_scale.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //v_content.setBackgroundResource(R.drawable.picture1);
        } else if (v.getId() == R.id.btn_centerInside) {
            // 将拉伸类型设置为“保持宽高比例，缩小图片使之位于视图中间（只缩小不放大）”
            iv_scale.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            //v_content.setBackgroundResource(R.drawable.picture1);
        } else if (v.getId() == R.id.btn_fitXY) {
            // 将拉伸类型设置为“拉伸图片使其正好填满视图（图片可能被拉伸变形）”
            iv_scale.setScaleType(ImageView.ScaleType.FIT_XY);
            //v_content.setBackgroundResource(R.drawable.picture1);
        } else if (v.getId() == R.id.btn_fitStart) {
            // 将拉伸类型设置为“保持宽高比例，拉伸图片使其位于视图上方或左侧”
            iv_scale.setScaleType(ImageView.ScaleType.FIT_START);
            //v_content.setBackgroundResource(R.drawable.picture1);
        } else if (v.getId() == R.id.btn_fitEnd) {
            // 将拉伸类型设置为“保持宽高比例，拉伸图片使其位于视图下方或右侧”
            iv_scale.setScaleType(ImageView.ScaleType.FIT_END);
            //v_content.setBackgroundResource(R.drawable.picture1);
        }
        Log.d(TAG, "onClick: " + iv_scale.getScaleType());
        Toast.makeText(image_scale.this, "设置缩放类型：" + iv_scale.getScaleType(), Toast.LENGTH_SHORT).show();
    }
}