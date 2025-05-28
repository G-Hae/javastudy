// src/main/java/com/company/project/board/service/BoardService.java
package com.company.project.board.service;

import com.company.project.board.dto.BoardRequest;
import com.company.project.board.dto.BoardResponse;
import com.company.project.board.entity.Board;
import com.company.project.board.repository.BoardRepository;
import com.company.project.global.exception.BoardNotFoundException.java

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // 이 클래스가 서비스 계층의 컴포넌트임을 명시
@RequiredArgsConstructor
@Transactional(readOnly = true) // 읽기 전용 트랜잭션 설정 (기본값)
public class BoardService {

    private final BoardRepository boardRepository; // 데이터베이스 접근을 위한 레포지토리 의존성 주입

    @Transactional // 쓰기 작업이므로 트랜잭션 범위 시작
    public BoardResponse createBoard(BoardRequest request) {
        // DTO (BoardRequest) -> Entity (Board) 변환
        Board newBoard = Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .author(request.getAuthor())
                .build();

        Board savedBoard = boardRepository.save(newBoard); // 데이터베이스에 저장

        // Entity (Board) -> DTO (BoardResponse) 변환하여 반환
        return BoardResponse.from(savedBoard);
    }
    
public BoardResponse getBoardById(Long id) {
    Board board = boardRepository.findById(id)
                                 .orElseThrow(() -> new BoardNotFoundException("게시글을 찾을 수 없습니다. ID: " + id));
    return BoardResponse.from(board);
}

    // 다른 비즈니스 로직 (조회, 수정, 삭제) 메서드들이 여기에 추가될 수 있습니다.
}