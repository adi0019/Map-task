package com.example.map.Model;

import com.google.gson.annotations.SerializedName;

public class LocationModel {
    @SerializedName("latitude")
    private String latitude;

    @SerializedName("city")
    private String city;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("rating")
    private String rating;

    @SerializedName("url")
    private String url;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
