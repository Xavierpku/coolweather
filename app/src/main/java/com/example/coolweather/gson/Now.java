package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiezhiyuan on 12/19/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
