package com.yu.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author yu
 * @Description
 * @create 2019-10-26-15:40
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
