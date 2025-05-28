// src/main/java/com/company/project/board/repository/BoardRepository.java
package com.company.project.board.repository;

import com.company.project.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 이 인터페이스가 데이터베이스 접근 계층(DAO)임을 명시
public interface BoardRepository extends JpaRepository<Board, Long> {
    // JpaRepository를 상속받으면 기본적인 CRUD 메서드 (save, findById, findAll, delete 등)를 자동으로 제공받음
    // 따라서 별도의 구현 없이 바로 사용 가능

    // 필요하다면 여기에 커스텀 쿼리 메서드를 정의할 수 있습니다.
    // 예: List<Board> findByAuthor(String author); // 작성자로 게시글 조회
}