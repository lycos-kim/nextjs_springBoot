package com.example.backend;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost") // 모든 메서드에 CORS 허용
public class HelloController {

    // DB 대신 데이터를 저장할 리스트 (메모리 저장소)
    private List<String> userList = new ArrayList<>();

    // 1. 데이터 저장 (POST 방식)
    @PostMapping("/api/users")
    public Map<String, String> addUser(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        userList.add(name);
        System.out.println("현재 저장된 인원 :: " + userList);
        return Map.of("message", name + "님이 리스트에 등록되었습니다!!");
    }

    // 2. 전체 목록 조회 (GET 방식)
    @GetMapping("/api/users")
    public List<String> getUsers() {
        return userList;
    }
}
