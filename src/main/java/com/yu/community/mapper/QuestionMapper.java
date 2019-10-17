package com.yu.community.mapper;

import com.yu.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yu
 * @Description
 * @create 2019-10-16-9:25
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    public void create(Question question);
    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(@RequestParam(value = "offset") Integer offset,@RequestParam(value = "size") Integer size);
    @Select("select count(1) from question")
    Integer count();
}
