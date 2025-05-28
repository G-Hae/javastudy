// src/main/java/com/company/project/board/controller/BoardController.java
package com.company.project.board.controller;

import com.company.project.board.dto.BoardRequest;
import com.company.project.board.dto.BoardResponse;
import com.company.project.board.service.BoardService;
import com.company.project.global.exception.BoardNotFoundException; 
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // RESTful API를 처리하는 컨트롤러임을 명시 /@Controller와 @ResponseBody의 조합이라고 생각하시면 됩니다.
@RequestMapping("/api/boards") // 이 컨트롤러의 모든 API는 /api/boards 경로로 시작
@RequiredArgsConstructor // final 필드를 가진 생성자를 자동으로 생성하여 의존성 주입 (Lombok)
public class BoardController {

    private final BoardService boardService; // 비즈니스 로직을 처리할 서비스 계층 의존성 주입

    @PostMapping // POST 요청을 처리, ex: POST /api/boards
    public ResponseEntity<BoardResponse> createBoard(@RequestBody @Valid BoardRequest request) {
        // @RequestBody: HTTP 요청 본문에 담긴 JSON 데이터를 BoardRequest 객체로 변환
        // @Valid: BoardRequest 객체의 유효성을 검증 (DTO 내부의 @NotBlank, @Size 등 활용)

        BoardResponse response = boardService.createBoard(request); // 서비스 계층으로 요청 위임
        return ResponseEntity.status(HttpStatus.CREATED).body(response); // HTTP 201 Created 응답 반환
    }

    @GetMapping("/{id}") // GET 요청을 처리, ex: GET /api/boards/1
    public ResponseEntity<BoardResponse> getBoardById(@PathVariable Long id) {
        // @PathVariable: URL 경로 변수(여기서는 {id})를 메서드 파라미터로 바인딩
        BoardResponse response = boardService.getBoardById(id);
        return ResponseEntity.ok(response); // HTTP 200 OK 응답 반환
    }

    // ⭐ 새로 추가할 예외 처리 메서드 ⭐
    @ExceptionHandler(BoardNotFoundException.class) // BoardNotFoundException이 발생하면 이 메서드가 처리
    public ResponseEntity<String> handleBoardNotFoundException(BoardNotFoundException ex) {
        // 클라이언트에게 반환할 에러 메시지
        String errorMessage = ex.getMessage(); 
        // HTTP 404 Not Found 상태 코드와 메시지를 함께 반환
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage); 
    }

    // 다른 API (조회, 수정, 삭제) 메서드들이 여기에 추가될 수 있습니다.
}