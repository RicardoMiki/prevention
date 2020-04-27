package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Article;
import com.whw.springboot.entity.ArticleNumber;
import com.whw.springboot.mapper.ArticleMapper;
import com.whw.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articMapper;

    @Override
    public int deleteByPrimaryKey(Integer articleId) {
        // TODO Auto-generated method stub

        return articMapper.deleteByPrimaryKey(articleId);
    }

    @Override
    public int insert(Article record) {
        // TODO Auto-generated method stub
        return articMapper.insert(record);
    }

    @Override
    public int insertSelective(Article record) {
        // TODO Auto-generated method stub
        return articMapper.insertSelective(record);
    }

    @Override
    public Article selectByPrimaryKey(Integer articleId) {
        // TODO Auto-generated method stub
        return articMapper.selectByPrimaryKey(articleId);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        // TODO Auto-generated method stub
        return articMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        // TODO Auto-generated method stub
        return articMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Article> selectByNumber(ArticleNumber articleNumber) {
        // TODO Auto-generated method stub
        return articMapper.selectByNumber(articleNumber);
    }

    @Override
    public List<Article> selectByNumberAdmin(ArticleNumber articleNumber) {
        // TODO Auto-generated method stub
        return articMapper.selectByNumberAdmin(articleNumber);
    }

}
