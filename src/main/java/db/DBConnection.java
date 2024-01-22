package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection { //

    public static Connection getInstance(){ //Connection: 소켓
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/cosdb";      // url은 상상해서 적을 수 있는게 아니다 찾아봐라!!
        // "프로토콜, ip주소(내 ip주소(루프백주소) 혹은 상대방 ip주소), 포트번호, db명"

        //프로토콜이 적용된 소켓
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("db connection success");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
