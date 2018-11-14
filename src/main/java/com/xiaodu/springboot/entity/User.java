package com.xiaodu.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

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
    @Column(name = "u_id",length = 32)
    @GeneratedValue(generator = "UUIDGenerator")
    @GenericGenerator(name = "UUIDGenerator",strategy = "uuid2")
    private String uId;

    @Column(name = "u_name",length = 32)
    private String uName;

    @Column(name="u_no",length = 32)
    private String uNo;

    @Column(name = "username",length = 32)
    private String username;

    @Column(name="password",length = 16)
    private String password;

    @Column(name="d_no",length = 32)
    private String dNo;                        // 部门编号

    @Column(name="u_role",length = 32)
    private String uRole;                      // 角色

    @Column(name="u_job",length = 32)
    private String uJob;                       // 职位岗位

    @Column(name ="u_info",length = 32)
    private String uInfo;                      // 个人资料详情

    @Column(name="u_email",length = 32)
    @Email
    private String email;                    // 企业邮箱

    @Column(name="phone",length = 11)
    private Integer phone;                     // 电话
}
