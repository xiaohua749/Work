package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.util.DateUtil;

public class bbs extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {
    private TextView tv_bbs;
    private TextView tv_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);

        tv_control=findViewById(R.id.tv_control);
        tv_control.setOnClickListener(this);
        tv_control.setOnLongClickListener(this);
        tv_bbs=findViewById(R.id.tv_bbs);
        tv_bbs.setOnClickListener(this);
        tv_bbs.setOnLongClickListener(this);

        tv_bbs.setMovementMethod(new ScrollingMovementMethod());
    }

    private String[] mChatStr={"又是另一个夜 雨飘的夜\n" ,
            "在一条喧闹后的街 我望着月亮\n",
            "忘了是雨还是泪水突然滑过脸上\n" ,
            "心喃喃自语 我却又听不见\n" ,
            "白天 我总笑容满面\n" ,
            "为什么每夜 我总辗转难眠\n" ,
            "自律和压抑 到底如何分辨\n" ,
            "说要做自己 却不敢对自己正眼\n" ,
            "原来孤独 是灯光下 所有人都对我佩服\n" ,
            "但月光下 却一直害怕自己退步\n" ,
            "你别停下 有个声音催促\n" ,
            "但这无尽的赛跑为何追逐\n" ,
            "If ain’t nobody stayed with me\n" ,
            "那这是演给谁的戏\n" ,
            "我看着一路多少人都扑空\n" ,
            "到最后 怕自己也没什么不同\n" ,
            "也背向了背向了初衷\n" ,
            "皎洁的月光 请洁净我\n" ,
            "洗净年月泼的墨\n" ,
            "熄灭我吞下的烟火\n" ,
            "我从小到大 凡事都要做到第一位\n" ,
            "再艰难咬着牙 再累我不流一滴泪\n",
            "我有着强迫症的意志力 天赋不能浪费\n" ,
            "我让我家里几个柜子里都放满了奖杯\n" ,
            "这世界告诉你 成功要靠自己\n" ,
            "什么叫做成功我却不知道定义\n" ,
            "我已经变得热可炙手\n",
            "但优秀还是没有为我带来自由\n" ,
            "原来孤独 是感觉自己是那蓝天下的枯树\n" ,
            "站在高处 伤口得自己捂住 无处哭诉\n" ,
            "虽然我坚强但是我也偶尔无助\n" ,
            "每当我祈祷上帝说努力了就好\n" ,
            "但面对世界我只感觉自己瘦小\n",
            "They say when you’re lonely, Hang out with homies\n" ,
            "他们不懂 说得容易 但我的Home里只有Me\n" ,
            "皎洁的月光 请洁净我\n" ,
            "洗净年月泼的墨\n" ,
            "熄灭我吞下的烟火\n" ,
            "对自己说了多少遍 I’m a super women\n" ,
            "我逼着心里面 那渴望爱的小女生\n" ,
            "要学会成熟点 有话就说给日记本\n" ,
            "终于发现世界再冷 没有我对自己狠\n" ,
            "我爸教我恒心能让 铁柱变成针\n" ,
            "但一不小心能让 泥足陷很深\n" ,
            "我是不是应该换个第三人称\n" ,
            "问问自己 其实想过什么样的人生\n" ,
            "原来孤独 是想哭却又不想瞩目\n" ,
            "是努力融入 但你还 常常感觉自己格格不入\n" ,
            "是不想辜负 了期待 你却又感觉束缚\n" ,
            "唯一的安抚 是知道世界之大\n" ,
            "这一刻和你一样 感到孤独的 无数"};

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.tv_control||v.getId()==R.id.tv_bbs){

            int random=(int)(Math.random()*51)%51;

            String newStr=String.format("%s\n%s %s",
                    tv_bbs.getText().toString(),DateUtil.getNowTime(),mChatStr[random]);

            tv_bbs.setText(newStr);
        }
    }

    @Override
    public boolean onLongClick(View v){
        if(v.getId()==R.id.tv_control||v.getId()==R.id.tv_bbs){
            tv_bbs.setText("");
        }
        return true;
    }
}
