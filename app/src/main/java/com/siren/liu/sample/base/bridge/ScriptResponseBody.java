package com.siren.liu.sample.base.bridge;

/**
 * method：方法名，对应ScriptRequestBody的callback。
 * data：实体数据。
 * code：响应码。
 * msg：业务错误信息。
 */
public class ScriptResponseBody {
    public String method;
    public String data;
    public String code;
    public String msg;
}
