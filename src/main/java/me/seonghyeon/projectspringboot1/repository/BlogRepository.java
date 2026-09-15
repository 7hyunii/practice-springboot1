package me.seonghyeon.projectspringboot1.repository;

import me.seonghyeon.projectspringboot1.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
