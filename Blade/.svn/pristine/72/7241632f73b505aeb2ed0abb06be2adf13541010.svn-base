package com.go123.controller;

import com.go123.persistence.domain.Article;
import com.go123.persistence.repository.ArticleRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: wzhonggo
 * Date: 12-12-4
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class TestController {
    private static final Logger log = Logger.getLogger("TestController");

    @Autowired
    private ArticleRepository articleRepository;

    @RequestMapping("/index")
    public void index(HttpServletResponse httpServletRespose) throws IOException {
        httpServletRespose.getOutputStream().println("go123: " +  java.lang.System.getenv("VCAP_SERVICES") );
    }

    @RequestMapping("/test")
    public void test(HttpServletResponse httpServletRespose) throws IOException {
        Article article = new Article();
        article.setTitle("war3");
        article.setContent("测试");
        articleRepository.save(article);

        log.info(article.getTitle());
        log.error(article.getContent());


        httpServletRespose.getOutputStream().println("go123: " /*+  java.lang.System.getenv("VCAP_SERVICES")*/ );
    }


    /**
     *  需要加入jackson-mapper-asl jar包
     * @param httpServletRespose
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/echo_json", produces = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    Article json(HttpServletResponse httpServletRespose) throws IOException {
        Article article = articleRepository.findOne(1L);
        log.info(article.getTitle());
        return article;
    }


//   还需要一些jar包， OXM,JAXB
/*   @RequestMapping(value = "/echo_xml", produces = MediaType.APPLICATION_XML_VALUE)
    public
    @ResponseBody
    Article xml(HttpServletResponse httpServletRespose) throws IOException {
        Article article = articleRepository.findOne(2L);
        log.info(article.getTitle());
        return article;
    }*/


}
