package com.example.redis_leaderboard.repository;

import com.example.redis_leaderboard.domain.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ItemOrder, Long> {
}
