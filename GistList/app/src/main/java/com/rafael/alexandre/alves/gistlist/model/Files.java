package com.rafael.alexandre.alves.gistlist.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Files implements Serializable {

    @SerializedName("filename")
    @Expose
    public String filename;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("content")
    @Expose
    public String content;
}
