package com.springboot.redisCache.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

/**
 * @author 梁其定
 * @version 1.0
 * @date 2020/5/24/024 11:23
 * @descriptio
 */

@Data
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = -339516038496531943L;
    private Integer id;
    private String name;
    private String username;
    private String date;
    private String password;
}
