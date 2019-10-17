package com.yu.community.model;

import lombok.Data;

/**
 * @author yu
 * @Description
 * @create 2019-10-15-12:53
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;


}
