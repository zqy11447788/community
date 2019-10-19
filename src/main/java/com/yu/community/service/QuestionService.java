package com.yu.community.service;

import com.yu.community.dto.PaginationDTO;
import com.yu.community.dto.QuestionDTO;
import com.yu.community.mapper.QuestionMapper;
import com.yu.community.mapper.UserMapper;
import com.yu.community.model.Question;
import com.yu.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu
 * @Description
 * @create 2019-10-16-20:08
 */
@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;

    public PaginationDTO list(Integer page, Integer size) {

        PaginationDTO paginationDTO = new PaginationDTO();
        Integer totalPage;
        Integer totalCount = questionMapper.count();

        if (totalCount % size == 0){
            totalPage = totalCount / size;
        }else {
            totalPage = (totalCount / size) +1;
        }

        if( page < 1 ){
            page = 1;
        }
        if( page > totalPage){
            page = totalPage;
        }

        paginationDTO.setPaginAtion(totalPage,page);

        Integer offset = size * (page - 1);
        List<Question> questionList = questionMapper.list(offset,size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();


        for (Question question : questionList) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);

        return paginationDTO;
    }

    public PaginationDTO list(Integer userId, Integer page, Integer size) {
        PaginationDTO paginationDTO = new PaginationDTO();
        Integer totalPage;
        Integer totalCount = questionMapper.countByUserId(userId);
        if (totalCount % size == 0){
            totalPage = totalCount / size;
        }else {
            totalPage = (totalCount / size) +1;
        }

        if( page < 1 ){
            page = 1;
        }
        if( page > totalPage){
            page = totalPage;
        }

        paginationDTO.setPaginAtion(totalPage,page);
        Integer offset = size * (page - 1);
        List<Question> questionList = questionMapper.listByUserId(userId,offset,size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();


        for (Question question : questionList) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);

        return paginationDTO;
    }
}
