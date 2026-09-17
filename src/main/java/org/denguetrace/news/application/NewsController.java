package org.denguetrace.news.application;

import org.denguetrace.news.domain.News;
import org.denguetrace.news.domain.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<News>> getAllNews() {
        return ResponseEntity.ok(newsService.getAllNews());
    }

    @PostMapping
    public ResponseEntity<Void> createBook(@RequestBody News newNews) {
        newsService.createNews(newNews);
        return ResponseEntity.status(HttpStatus.valueOf(201)).build();
    }
}