package top.zyz.database.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import top.zyz.database.entity.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {

}
