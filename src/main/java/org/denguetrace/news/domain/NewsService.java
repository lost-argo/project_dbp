package org.denguetrace.news.domain;

import org.denguetrace.news.infrastructure.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News findNewsById(Long id){
        return newsRepository.findById(id).orElseThrow(() -> new RuntimeException("News with id " + id + " not found"));
    }

    public void createNews(News newNews){
        newsRepository.save(newNews);
    }
}