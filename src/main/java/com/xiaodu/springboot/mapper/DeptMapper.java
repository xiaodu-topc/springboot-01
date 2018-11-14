package com.xiaodu.springboot.mapper;

import com.xiaodu.springboot.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 11:23
 * @desc:
 */
@Mapper
public interface DeptMapper {

    int insertDept(Dept dept);

}
