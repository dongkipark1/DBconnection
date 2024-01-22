package db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest { //테스트에는 ~ Test라고 붙인다 (컨벤션)

    // 리턴타입을 적을 수 없다. 무조건 void만 쓸 수 있다. 누구한테 리턴 불가
    // 매개변수를 적을 수 없다.
    // 이유는? 그냥 이렇게 만들어져 있다
    // @Test를 붙이면 메서드 별로 실행 가능
    @Test
    public void getInstance_test(){               //테스트코드에는 _를 붙인다 (컨벤션)
        // given = 파라미터

        // when = 본코드 실행
        Connection conn = DBConnection.getInstance();

        // then = 눈 검증
        if(conn == null){
            System.out.println("실패");
        }else {
            System.out.println("성공");
        }
    }
}
