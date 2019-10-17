package com.yu.community.dto;

import lombok.Data;

/**
 * @author yu
 * @Description
 * @create 2019-10-14-20:23
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
