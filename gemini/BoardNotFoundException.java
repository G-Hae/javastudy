// src/main/java/com/company/project/global/exception/BoardNotFoundException.java
// (global.exception 패키지를 생성해서 여기에 넣어주는 것이 좋습니다.)
package com.company.project.global.exception;

public class BoardNotFoundException extends RuntimeException { // RuntimeException을 상속받습니다.
    public BoardNotFoundException(String message) {
        super(message); // 부모 클래스(RuntimeException)의 생성자를 호출하여 메시지를 전달합니다.
    }
}