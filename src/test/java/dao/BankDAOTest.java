package dao;

import org.junit.jupiter.api.Test;

public class BankDAOTest {

    @Test
    public void insert_test(){   // _test를 붙이는 건 컨벤션이다
        //given > 파라미터
        String password = "3456";
        int balance = 70000;
        //when
        BankDAO dao = new BankDAO();
        int result = dao.insert(password,balance);
        //then
        if(result == 1){
            System.out.println("추가 성공");
        } else {
            System.out.println("추가 실패");
        }
    }
}
