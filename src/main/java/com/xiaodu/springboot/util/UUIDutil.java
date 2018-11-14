package com.xiaodu.springboot.util;

import javax.xml.bind.SchemaOutputResolver;
import java.util.UUID;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 12:08
 * @desc:
 */
public class UUIDutil {

    public static String getUUID() {

        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static void main(String[] args) {
        System.out.println(UUIDutil.getUUID());
    }
}
