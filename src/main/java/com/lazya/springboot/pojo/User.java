package com.lazya.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Title: User
 * Description:
 *
 * @author 懒闲人(ldg)
 * @version 1.0
 * @date 2023 05 18 10 03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String username;
    private Integer age;
    private String gender;
    private String phone;
    private String address;
}
