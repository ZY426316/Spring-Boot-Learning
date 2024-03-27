package top.zyz.database.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.zyz.database.entity.Article;


@Mapper
public interface ArticleMapper {
    void insertArticle(Article article);
}
