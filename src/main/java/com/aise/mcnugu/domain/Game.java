package com.aise.mcnugu.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;

@Entity
@Getter @Setter
@Table(name = "game")
public class Game {

    @Id @GeneratedValue
    @Column(name = "game_id")
    private Long id;

    @Column(name = "game_name")
    private String name;

    // 0 - 이미지 게임 | 1 - 지도 게임 | 2 - 모여라 게임
    private Long gameType;

    // 게임 이미지 제공 url => {문제 사진 url, 정답 사진 url} json 제공
    // Flask 에서 처리
    private URL quizUrl;
}
