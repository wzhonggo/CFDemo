package com.go123.persistence.repository;

import com.go123.persistence.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: wzhonggo
 * Date: 12-12-8
 * Time: 下午1:20
 * To change this template use File | Settings | File Templates.
 */


/**
 *  JpaRepository<T, ID extends Serializable>  中 T对应 加了@Entity注解的javabean,
 *   TD对应该javabean的主键，例如：Article中继承AbstractPersistable<Long>中的Long
 */
public interface  ArticleRepository extends JpaRepository<Article,Long> {
}
