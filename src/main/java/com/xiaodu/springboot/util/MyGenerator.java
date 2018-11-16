package com.xiaodu.springboot.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/15 14:48
 * @desc:
 */
public class MyGenerator implements IdentifierGenerator {
    public MyGenerator(){}

    @Override
    public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
        return UUIDutil.getUUID();
    }
}
