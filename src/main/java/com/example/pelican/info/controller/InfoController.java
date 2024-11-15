package com.example.pelican.info.controller;

import com.example.pelican.info.dto.InfoRequest;
import com.example.pelican.info.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoController {
    private final InfoService infoService;

    @PostMapping("/{userId}")
    public void CreatePost(@PathVariable Long userId, @RequestBody InfoRequest.createInfo req){
        infoService.createInfo(userId, req);
    }

    @PatchMapping("/{userId}")
    public void UpdatePost(@PathVariable Long userId, @RequestBody InfoRequest.PatchInfo req){
        infoService.updateInfo(userId, req);
    }

//    @GetMapping("/match")
//    public boolean matchUsers(@RequestParam Long userId1, @RequestParam Long userId2) {
//        return infoService.matchUser(userId1, userId2);
//    }
}
