package com.greencity.core.models.impl;

import com.greencity.core.models.Article;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        adapters = Article.class,
        resourceType = "greencity/components/content/article",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ArticleImpl implements Article {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String author;

    @ValueMapValue
    private String article;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getArticle() {
        return article;
    }

    @Override
    public boolean isEmpty() {
        return StringUtils.isBlank(title) && StringUtils.isBlank(author) && StringUtils.isBlank(article);
    }
}