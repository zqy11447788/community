package com.yu.community.dto;

import com.yu.community.model.User;
import lombok.Data;

/**
 * @author yu
 * @Description
 * @create 2019-10-16-20:06
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private String tag;
    private User user;
}
