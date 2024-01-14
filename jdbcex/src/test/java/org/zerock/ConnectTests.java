package org.zerock;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTests { // 자바 코드를 이용해서 설치된 MariaDB와 연결을 확인하는 용도의 코드
    @Test
    public void testConnection() throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        // Class.forName() : JDBC 드라이버 클래스를 메모리상으로 로딩하는 역할
        // 이 때 문자열 : 패키지명과 클래스명의 대소문자까지 정확히 일치해야 함

        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb",
                "webuser",
                "1234"
        );
        // Connection : DB와 네트워크의 연결을 의미
        // DriverManager.getConnection() : DB 내에 있는 여러 정보들을 통해 특정한 DB에 연결을 시도함

        Assertions.assertNotNull(connection);
        // Assertions.assertNotNull() : DB와 정상적으로 연결된다면 받은 객체가 null이 아니라느 것을 확신한다는 의미

        connection.close();
    }

    @Test
    public void testHikariCP() throws Exception {

        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("1234");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();

        System.out.println(connection);

        connection.close();
    }
}
