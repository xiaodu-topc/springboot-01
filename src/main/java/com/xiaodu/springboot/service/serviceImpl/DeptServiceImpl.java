package com.xiaodu.springboot.service.serviceImpl;

import com.xiaodu.springboot.entity.Dept;
import com.xiaodu.springboot.mapper.DeptMapper;
import com.xiaodu.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 11:25
 * @desc:
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    @Transactional
    public int addDept(Dept dept) {
        return deptMapper.insertDept(dept);
    }
}
