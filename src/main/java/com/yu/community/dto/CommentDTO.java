package com.yu.community.dto;

import com.yu.community.model.User;
import lombok.Data;

/**
 * @author yu
 * @Description
 * @create 2019-10-23-20:27
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
    private Integer commentCount;
}
