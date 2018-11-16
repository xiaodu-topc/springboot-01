package com.xiaodu.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/15 17:50
 * @desc:
 */
@Data
@Accessors(chain = true)
@Entity
@Table(name = "tb_userInfo")
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    @Id
    @Column(name="uInfo",length = 32)                             // id
    private String uInfo;

    @Column(name = "addr",length = 64)                            // 家庭住址
    private String addr;

    @Column(name = "identity_no",length = 18)                     // 身份证编码
    private String IdentityNo;

    @Column(name ="link_man1",length = 32)                         //  紧急联系人1
    private String linkMan1;

    @Column(name = "link_phone1",length = 11)                      // 联系人手机号1
    private String linkPhone1;

    @Column(name ="link_man2",length = 32)                         //  紧急联系人2
    private String linkMan2;

    @Column(name = "link_phone2",length = 11)                      // 联系人手机号2
    private String linkPhone2;

    @Column(name="email",length = 32)
    @Email
    private String email;                                          // 个人邮箱

}
