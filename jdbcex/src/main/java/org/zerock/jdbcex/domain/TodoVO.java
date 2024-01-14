package org.zerock.jdbcex.domain;

import lombok.*;

import java.time.LocalDate;

@Getter // VO : 주로 읽기 전용 -> Getter만 추가
@Builder // 객체 생성 시 빌더 패턴을 위함
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}
