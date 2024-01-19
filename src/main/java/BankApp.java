import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApp {
    public static void main(String[] args) {
        Connection conn = DBConnection.getInstance();
        try {
            String insert ="insert into account_tb(password, balance, created_at) values(?, ?, now())";
            String delete = "delete from account_tb where number = ?";
            String update = "update account_tb set balance = balance + ? where number = ?";
            PreparedStatement pstmt = conn.prepareStatement(delete); // 버퍼   (): 버퍼에 담기는 메시지 //now() db의 문법 현재시간
            pstmt.setInt(1, 4); // 물음표의 순서, x= 값


            int num = pstmt.executeUpdate(); // flush와 같은 문법
            System.out.println(num);

            //? ?와 같이 완성이 안된 쿼리를 수정하는 문법
            // ?의 순서 like 1 or 2 첫 번째와 두 번째가 물음표니까
            // 완성된 쿼리가 버퍼에 담겨있게 됨
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
