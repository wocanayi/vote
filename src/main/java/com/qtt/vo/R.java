package com.qtt.vo;

import lombok.Data;

/**
 * Project name：qutingting
 * Class name：SubjectServiceImpl
 * description：TODO
 * date：2019/12/20 9:37
 *
 * @author ：XC
 */

@Data
public class R {
    private int code;//结果码
    private String msg;//字符串
    private Object data;//携带数据

    public static R setR(int code, String msg, Object data) {
        R r = new R();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }

    public static R Ok(Object data) {
        return setR(200, "OK", data);
    }

    public static R Ok() {
        return setR(200, "OK", null);
    }

    public static R fail() {
        return setR(400, "Error", null);
    }

    public static R fail(String msg) {
        return setR(400, msg, null);
    }

}
