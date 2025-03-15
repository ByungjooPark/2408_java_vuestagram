package com.example.vuestagram.repogitory;

import com.example.vuestagram.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepogitory extends JpaRepository<Board, Long> {
}
