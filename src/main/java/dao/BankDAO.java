package dao;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * DAO -DATA ACCESS OBJECT
 * SRP - 단말책임의 원칙
 */
public class BankDAO {
    public int deleteByNumber(int number){
        Connection conn = DBConnection.getInstance();
        try {
            String sql = "delete from account_tb where number = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼   (): 버퍼에 담기는 메시지 //now() db의 문법 현재시간
            pstmt.setInt(1, number); // 물음표의 순서, x= 값
            int num = pstmt.executeUpdate(); // flush와 같은 문법
            return num;

            //? ?와 같이 완성이 안된 쿼리를 수정하는 문법
            // ?의 순서 like 1 or 2 첫 번째와 두 번째가 물음표니까
            // 완성된 쿼리가 버퍼에 담겨있게 됨
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int insert(String password, int balance){
        Connection conn = DBConnection.getInstance();
        try {
            String sql = "insert into account_tb(password, balance, created_at) values(?, ?, now())";
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼   (): 버퍼에 담기는 메시지 //now() db의 문법 현재시간
            pstmt.setString(1, password); // 물음표의 순서, x= 값
            pstmt.setInt(2, balance); // 물음표의 순서, x= 값
            int num = pstmt.executeUpdate(); // flush와 같은 문법
            return num;
            //? ?와 같이 완성이 안된 쿼리를 수정하는 문법
            // ?의 순서 like 1 or 2 첫 번째와 두 번째가 물음표니까
            // 완성된 쿼리가 버퍼에 담겨있게 됨
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int updateByNumber(int balance, int number){
        Connection conn = DBConnection.getInstance();
        try {
            String sql = "update account_tb set balance = ? where number = ?"; //balance+1000 안됨 무조건 증가시키려는게 아니기 때문에
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼   (): 버퍼에 담기는 메시지 //now() db의 문법 현재시간
            pstmt.setInt(1, balance); // 물음표의 순서, x= 값
            pstmt.setInt(2, number); // 물음표의 순서, x= 값
            int num = pstmt.executeUpdate(); // flush와 같은 문법
            return num;
            //? ?와 같이 완성이 안된 쿼리를 수정하는 문법
            // ?의 순서 like 1 or 2 첫 번째와 두 번째가 물음표니까
            // 완성된 쿼리가 버퍼에 담겨있게 됨
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    }


