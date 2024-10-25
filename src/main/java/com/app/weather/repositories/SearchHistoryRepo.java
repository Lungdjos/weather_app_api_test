package com.app.weather.repositories;

import com.app.weather.model.SearchHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchHistoryRepo extends JpaRepository<SearchHistory, Long> {
    List<SearchHistory> findTop5ByOrderByIdDesc();
}
