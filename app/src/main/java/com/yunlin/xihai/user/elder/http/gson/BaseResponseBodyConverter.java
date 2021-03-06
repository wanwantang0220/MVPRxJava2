package com.yunlin.xihai.user.elder.http.gson;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.yunlin.xihai.user.elder.base.BaseException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

public class BaseResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    BaseResponseBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {

        String jsonString = value.string();
        try {
            JSONObject object = new JSONObject(jsonString);

            int code = object.getInt("status");
            if (code != 1) {
                String msg = object.getString("msg");
                if (TextUtils.isEmpty(msg)) {
                    msg = object.getString("error");
                }
                //异常处理
                throw new BaseException(msg, code);
            }

            return adapter.fromJson(object.getString("data"));

        } catch (JSONException e) {
            e.printStackTrace();
            //数据解析异常
            throw new BaseException(BaseException.PARSE_ERROR_MSG, BaseException.PARSE_ERROR);
        } finally {
            value.close();
        }
    }
}
