package com.example.coolweather.gson;

/**
 * Created by xiezhiyuan on 12/19/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
