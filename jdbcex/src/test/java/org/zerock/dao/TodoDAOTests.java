package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){ // 모든 테스트 전에 TodoDAO 타입의 객체를 생성하도록 함
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception { // TodoDAO에 작성한 getTime()이 정상작동하는지 확인하도록 함
        System.out.println(todoDAO.getTime() );
    }

    @Test
    public void testTime2() throws Exception { // TodoDAO에 작성한 getTime()이 정상작동하는지 확인하도록 함
        System.out.println(todoDAO.getTime2() );
    }

    @Test
    public void testInsert() throws Exception{ // TodoVO에 선언한 @Builder를 어떻게 사용하는지 보여줌
        // 빌더 패턴 : 생성자와 달리 필요한만큼만 데이터를 세티알 수 있음
        // finished : 기본적으로 false(0)로 지정되어 있어서 우리가 값을 현재 test에서 굳이 지정해주지 않아도 됨
        TodoVO todoVO = TodoVO.builder()
                .title("Sample Title")
                .dueDate(LocalDate.of(2024, 1, 1))
                .build();

        todoDAO.insert(todoVO);
    }

    @Test
    public void testList() throws Exception {

        List<TodoVO> list = todoDAO.selectAll();

        list.forEach(vo -> System.out.println(vo));
    }

    @Test
    public void testSelectOne() throws Exception{
        Long tno = 7L;  // 반드시 존재하는 번호를 이용

        TodoVO vo = todoDAO.selectOne(tno);

        System.out.println(vo);
    }

    @Test
    public void testUpdate() throws Exception{
        TodoVO todoVO = TodoVO.builder()
                .tno(3L)
                .title("Update Test")
                .dueDate(LocalDate.of(2024,1,1))
                .finished(true)
                .build();

        todoDAO.updateOne(todoVO);
    }
}
