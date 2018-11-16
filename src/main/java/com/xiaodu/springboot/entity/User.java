package com.xiaodu.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.Date;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 14:00
 * @desc:
 */
@Entity
@Table(name = "tb_user")
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "u_id",length = 64)
//    @GeneratedValue(generator = "UUIDGenerator")    // DefaultIdentifierGeneratorFactory
//    @GenericGenerator(name = "UUIDGenerator",strategy = "uuid2")
    @GeneratedValue(generator = "myGenerator")
    @GenericGenerator(name = "myGenerator", strategy = "com.xiaodu.springboot.util.MyGenerator")
    private String uId;                        // 员工ID

    @Column(name = "u_name",length = 32)       // 员工姓名
    private String uName;

    @Column(name = "gender", length=1)          // 性别
    private Integer gender;

    @Column(name = "age", length = 2)           // 年龄
    private Integer age;

    @Column(name = "addr", length = 62)
    private String addr;                        // 现住址

    @Column(name="u_no",length = 32)           // 员工编号
    private String uNo;

    @Column(name = "username",length = 32)     // 用户名
    private String username;

    @Column(name="password",length = 16)       // 密码
    private String password;

    @Column(name="d_no",length = 32)
    private String dNo;                        // 部门编号

    @Column(name="u_role",length = 32)
    private String uRole;                      // 角色

    @Column(name="u_job",length = 32)
    private String uJob;                       // 职位岗位

    @Column(name ="u_info",length = 32)
    private String uInfo;                     // 个人资料详情

    @Column(name="u_email",length = 32)
    @Email
    private String email;                    // 企业邮箱

    @Column(name="phone",length = 11)
    private String phone;                     // 电话

    @Column(name="entry_time")
    private Date entryTime;                   // 入职日期

    @Column(name="leave_office_time")
    private Date leaveOfficeTime;             // 离职日期

}
