package com.yunlin.xihai.user.elder.http.request;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.RequestBody;

public class XLHttpCommonRequest extends XLHttpRequest {

    private JSONObject jsonObject = new JSONObject();
    private Object object;
    private BaseRequest request;

    public XLHttpCommonRequest() {

    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public XLHttpCommonRequest put(String name, String value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public XLHttpCommonRequest put(String name, int value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public XLHttpCommonRequest put(String name, boolean value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public XLHttpCommonRequest put(String name, double value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public XLHttpCommonRequest put(String name, long value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public XLHttpCommonRequest put(String name, Object value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public XLHttpCommonRequest putObject(Object object) {
        if (object == null) {
            this.object = "";
        } else {
            this.object = object;
        }
        return this;
    }

    public XLHttpCommonRequest putRequest(BaseModel request) {
        this.request = new BaseRequest(request);
        return this;
    }

    @Override
    public RequestBody toRequestBody() {
        String request = null;
        if (this.request != null) {
            request = this.request.toString();
        } else {
            if (object != null) {
                request = object.toString();
            } else {
                request = jsonObject.toString();
            }
        }

//        Loger.i("request:" + request);
        return RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), request);
    }


}
