package com.yu.community.dto;

import com.yu.community.model.User;
import lombok.Data;

/**
 * @author yu
 * @Description
 * @create 2019-10-27-15:53
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String  typeName;
    private Integer type;
}
