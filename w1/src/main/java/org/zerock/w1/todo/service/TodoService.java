package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE; // 이는 TodoService.INSTANCE 로 사용할 수 있으며 항상 하나의 객체만을 가르키므로 싱글톤 패턴이라고 할 수 있음
    // Todo : 등록과 목록을 볼 수 있도록 구현해야 함


    public void register(TodoDTO todoDTO) { // 새로운 TodoDto 객체를 받아서 확인할 수 있도록
        System.out.println("DEBUG " + todoDTO);
    }

    public List<TodoDTO> getList() { // 10개의 TodoDTO 객체를 만들어서 반환

        List<TodoDTO> todoDTOS = IntStream.range(0, 10).mapToObj(i -> {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("TODO-"+i);
            dto.setDueDate(LocalDate.now());

            return dto;
        }).collect(Collectors.toList());

        return todoDTOS;
    }

    public TodoDTO get(Long tno) { // 상세 정보 반환

        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }
}
