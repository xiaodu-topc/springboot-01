package com.xiaodu.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 11:03
 * @desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept {

    private String dName;                             // 部门名称
    private String did;                               // 部门ID
    private String dParentNo;                         // 上级部门
    private String dNo;                               // 部门编号
    private String dHead;                             // 部门领导人
    private String dZone;                             // 部门区域

}
