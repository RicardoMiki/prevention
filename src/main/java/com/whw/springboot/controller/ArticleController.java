package com.whw.springboot.controller;

import com.whw.springboot.entity.Article;
import com.whw.springboot.entity.ArticleNumber;
import com.whw.springboot.service.ArticleService;
import com.whw.springboot.utils.LoadUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置.
@Api(description = "Article接口")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;


    @ApiOperation(value = "图片和 文章分别传送，图片必填，文章填写所需部分")
    @PostMapping(value = "Article")
    public int insertArticle(Article article) {

        Date date = new Date();

        article.setArticleDate(date);
        return articleService.insertSelective(article);
    }

    @ApiOperation(value = "按照id删除")
    @DeleteMapping(value = "Article/{article_id}")
    public int delArticle(@PathVariable("article_id") Integer article_id) {
        return articleService.deleteByPrimaryKey(article_id);
    }

    @ApiOperation(value = "按照id更改文章")
    @PutMapping(value = "Article")
    public int updateArticle(Article article) {


        return articleService.updateByPrimaryKeySelective(article);
    }

    @ApiOperation(value = "查看文章，传入需要的参数即可")
    @GetMapping(value = "Article")
    public List<Article> queryArticles(ArticleNumber articleNumber) {

        List<Article> articles = articleService.selectByNumber(articleNumber);
        for (Article article : articles) {

            if (article.getArticlePic() != null) {
                String[] img = article.getArticlePic().split(";");
                article.setImgs(img);
            }

        }


        return articles;

    }

    @ApiOperation(value="上传图片")
    @PostMapping(value="Images" , headers = "content-type=multipart/form-data")
    public String getImages(@RequestParam(value = "file") MultipartFile files,
                            RedirectAttributes redirectAttributes, HttpServletRequest request) {
        return LoadUtil.upload(files, request);

    }


    @ApiOperation(value = "管理端查看文章，传入需要的参数即可")
    @GetMapping(value = "ArticleAdmin")
    public List<Article> queryArticlesAdmin(ArticleNumber articleNumber) {

        List<Article> articles = articleService.selectByNumberAdmin(articleNumber);


        return articles;

    }
}
