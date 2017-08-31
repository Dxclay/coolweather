package com.dxx.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by xxdeng on 2017/8/31.
 */
/*
    运用OkHttp 发出请求， 传入请求地址及注册一个回调来处理服务器响应
*/
public class HttpUtil {

    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client=new OkHttpClient();
        //发出请求
        Request request=new Request.Builder().url(address).build();
        //注册一个回调来处理服务器响应
        client.newCall(request).enqueue(callback);
    }

}
