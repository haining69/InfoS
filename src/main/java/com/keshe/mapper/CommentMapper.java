package com.keshe.mapper;

import com.keshe.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Select("select * from comment")
    List<Comment> getAllComment();
}