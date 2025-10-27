package com.example.redis_leaderboard.repository;

import com.example.redis_leaderboard.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
