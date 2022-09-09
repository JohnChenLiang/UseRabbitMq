package com.example.userabbitmq.pojo;

import java.io.Serializable;

public class Log implements Serializable {
    private Integer id;

    private String params;

    //发送消息体的时候如果传递的是对象，那么需要注意你必须要实现序列化接口生成序列化ID
    //需要这行 和 类名那的implements Serializable
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", params='" + params + '\'' +
                '}';
    }
}
