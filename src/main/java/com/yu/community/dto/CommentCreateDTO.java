package com.yu.community.dto;

import lombok.Data;

/**
 * @author yu
 * @Description
 * @create 2019-10-22-11:23
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
