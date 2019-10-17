package com.yu.community.model;

import lombok.Data;

/**
 * @author yu
 * @Description
 * @create 2019-10-16-9:35
 */
@Data
public class Question {
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

}
