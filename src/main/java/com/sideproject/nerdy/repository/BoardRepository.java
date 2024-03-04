package com.sideproject.nerdy.repository;

import com.sideproject.nerdy.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board, Long> {
}
