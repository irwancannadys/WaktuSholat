
package com.domikado.waktusholat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("fajr")
    @Expose
    private String fajr;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("dhuhr")
    @Expose
    private String dhuhr;
    @SerializedName("asr")
    @Expose
    private String asr;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("maghrib")
    @Expose
    private String maghrib;
    @SerializedName("isha")
    @Expose
    private String isha;

    public String getFajr() {
        return fajr;
    }

    public void setFajr(String fajr) {
        this.fajr = fajr;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getDhuhr() {
        return dhuhr;
    }

    public void setDhuhr(String dhuhr) {
        this.dhuhr = dhuhr;
    }

    public String getAsr() {
        return asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsha() {
        return isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }

}
