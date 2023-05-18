package com.lazya.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lazya.springboot.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Title: UserMapper
 * Description:
 *
 * @author 懒闲人(ldg)
 * @version 1.0
 * @date 2023 05 18 10 06
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
