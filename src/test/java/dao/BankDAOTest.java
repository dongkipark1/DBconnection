package dao;

import model.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BankDAOTest {
    @Test
    public void selectAll_test() {
        // given

        // when
        BankDAO dao = new BankDAO();
        List<Account> accountList = dao.selectAll();

        System.out.println(accountList.size());
        // then
    }

    @Test
    public void selectByNumber_test() {
        // given
        int number = 17;

        // when
        BankDAO dao = new BankDAO();
        Account account = dao.selectByNumber(number);

        // then
        if (account == null) {
            System.out.println("조회된 값이 없습니다.");
        } else {
            System.out.println(account);// @ToString를 써서 자동으로 투스트링 만들어짐.
//            System.out.println(account.getNumber());
//            System.out.println(account.getPassword());
//            System.out.println(account.getBalance());
//            System.out.println(account.getCreatedAt());
        }
    }

    @Test
    public void updateByNumb_test(){   // _test를 붙이는 건 컨벤션이다
        //given > 파라미터

        int balance = 5000;
        int number = 6;
        //when
        BankDAO dao = new BankDAO();
        int result = dao.updateByNumber(balance,number);
        //then
        if(result == 1){
            System.out.println(" 수정 성공 ");
        } else if(result == 0){
            System.out.println(" 수정할 번호가 없습니다 ");
        }
        else {
            System.out.println("수정 실패");
        }
    }

    @Test
    public void deleteByNumber_test(){
        // given
        int number = 10;

        // when
        BankDAO dao = new BankDAO();
        int result = dao.deleteByNumber(number);

        // then
        if (result == 1) {
            System.out.println("삭제 성공");
        } else if (result == 0) {
            System.out.println(number + "번호를 찾을 수 없습니다.");
        } else {
            System.out.println("삭제 실패");
        }
    }
    @Test
    public void insert_test(){
        //given > 파라미터
        String password = "7934";
        int balance = 1500000;
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




