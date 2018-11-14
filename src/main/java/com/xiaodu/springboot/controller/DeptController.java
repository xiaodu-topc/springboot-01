package com.xiaodu.springboot.controller;

import com.xiaodu.springboot.entity.Dept;
import com.xiaodu.springboot.service.DeptService;
import com.xiaodu.springboot.util.UUIDutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/9 17:39
 * @desc:
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public void add( @RequestBody Dept dept) {
        dept.setDid(UUIDutil.getUUID());
        int i = deptService.addDept(dept);
    }

}
