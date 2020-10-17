package com.example.anniu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class click extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        Button btn_click = findViewById(R.id.btn_click);

        btn_click.setOnClickListener(new MyOnClickListener());

        btn_click.setOnLongClickListener(new MyOnLongClickListener());
    }


    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) { // 点击事件的处理方法
            if (v.getId() == R.id.btn_click) { // 判断是否为btn_click被点击
                Toast.makeText(click.this, "您点击了控件：" + ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        }
    }


    class MyOnLongClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) { // 长按事件的处理方法
            if (v.getId() == R.id.btn_click) { // 判断是否为btn_click被长按
                Toast.makeText(click.this, "您长按了控件：" + ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    }
}