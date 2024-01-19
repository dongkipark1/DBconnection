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
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/cosdb";      // url은 상상해서 적을 수 있는게 아니다 찾아봐라!!
        // "프로토콜, ip주소(내 ip주소(루프백주소) 혹은 상대방 ip주소), 포트번호, db명"

        //프로토콜이 적용된 소켓
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
