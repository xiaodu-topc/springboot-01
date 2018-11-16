package com.xiaodu.springboot.jpa;

import com.xiaodu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/15 13:53
 * @desc:
 */
public interface UserRepository extends JpaRepository<User,String > {

    User getUserByUsername(String username);

    User getUserByUsernameAndPassword(String username,String password);

}
