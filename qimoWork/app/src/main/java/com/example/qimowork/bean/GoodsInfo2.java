package com.example.qimowork.bean;

import com.example.qimowork.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "唯一", "热恋", "甜甜", "素锦", "知秋", "恋人","暖阳","年华"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "只有一个；独一无二",
            "热烈地恋爱，深深地留恋",
            "内心感到幸福、愉快、舒适",
            "年岁本色单纯又鲜明美好的时光",
            "一叶落知天下秋",
            "沉醉于爱河",
            "晨起开门雪满山，雪晴云淡日光寒。",
            "杏艳桃娇夺晚霞，乐游无庙有年华。",
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {7599, 11099, 4099, 2499, 6999, 3099, 7999, 7388};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.weiyi_s, R.drawable.relian_s, R.drawable.tiantian_s,
            R.drawable.sujin_s, R.drawable.zhiqiu_s, R.drawable.lianren_s,
            R.drawable.nuanyang_s, R.drawable.nianhua_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.weiyi, R.drawable.relian, R.drawable.tiantian,
            R.drawable.sujin, R.drawable.zhiqiu, R.drawable.lianren,
            R.drawable.nuanyang,R.drawable.nianhua
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}