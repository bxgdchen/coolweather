package com.coolweather.android.gson;

/**
 * AQI model
 *
 * @author Chen GuiQiang
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
    }
}
