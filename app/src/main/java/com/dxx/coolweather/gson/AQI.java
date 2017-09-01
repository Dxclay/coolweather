package com.dxx.coolweather.gson;

/**
 * Created by xxdeng on 2017/8/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
