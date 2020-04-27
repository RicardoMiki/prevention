package com.whw.springboot.mapper;

import com.whw.springboot.entity.Article;
import com.whw.springboot.entity.ArticleNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectByNumber(ArticleNumber articleNumber);

    List<Article> selectByNumberAdmin(ArticleNumber articleNumber);
}
