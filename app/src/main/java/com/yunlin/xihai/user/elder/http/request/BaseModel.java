package com.yunlin.xihai.user.elder.http.request;

import com.google.gson.Gson;

import java.io.Serializable;

public class BaseModel implements Serializable, Cloneable {
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public Object clone() {
        try {
            return  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(toString(), this.getClass());
    }
}
