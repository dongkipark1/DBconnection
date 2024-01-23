import dao.BankDAO;
import db.DBConnection;
import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // http://bank.com/account GET >> GET - 전체계좌 줘 >> SELECT * FROM ACCOUNT_TB; GET을 요청하면 돌려줄 데이터는 BODY 데이터를 준다.
        // http://bank.com/account/10 GET >> /10 GET 10번 계좌 줘 >> SELECT * FROM ACCOUNT_TB WHERE NUMBER ="10" >> 여기서 10은 PRIMARY KEY 
        // 10번을 돌려주면 BODY 데이터를 넘겨준다 (RESPONSE ID) 이 데이터가 어떻게 생긴 데이터다 (Mime TYPE)
        // DB있는 이상 요청은 전부 식별자 요청이다. DB에 있는 데이터를 주는 것
        // http://bank.com/account POST >> POST - 줄게(계좌를 만드는 것) >> BODY 데이터가 필요하다 (VALUES값이 있어야 한다) // INSERT INTO
        // http://bank.com/account/1 DELETE >> /1 DELETE - 1번 계좌 삭제 해줘 // DELETE
        // http://bank.com/account/1 PUT >> /1 PUT - 1번 계좌 수정 해줘 >> BODY 데이터 필요하다 (BALANCE 값이 필요하다) // UPDATE
        // PUT POST 요청은 무조건 BODY가 있다.
        // 라이트 요청은 OK만 주면 된다 BODY가 필요없다.
        // GET과 DELETE 요청은 HTTP에 BODY가 없다
     
     
        // /account
        // /account/1
        // /account
        // /account/1
        // /account/1
        System.out.println("http 메서드를 입력하세요");
        String method = sc.nextLine();
        System.out.println("식별자를 입력하세요");
        String action = sc.nextLine();

        String body = "";

        BankDAO bankDAO = new BankDAO();
        if(method.equals("GET")){
            if (action.equals("/account")){
                List<Account> accountList = bankDAO.selectAll();
                System.out.println(accountList);
            } else if (action.equals("/account/1")) {
                Account account = bankDAO.selectByNumber(1);
                System.out.println(account);
            }
        } else if (method.equals("POST")) {
            System.out.println("body 데이터를 입력하세요.");
            body = sc.nextLine();

            // password=1234&balance=1000
            String[] st1 = body.split("&");
            String password = st1[0].split("=")[1];
            int balance = Integer.parseInt(st1[1].split("=")[1]);

            if (action.equals("/account")){
                bankDAO.insert(password,balance);
            } // 내가 전송하는 타입이 뭔지 구분을 해줘야 한다 (mime type: 전 세계적 표준)
        } else if (method.equals("PUT")){
            System.out.println("body 데이터를 입력하세요");
            body = sc.nextLine();

            // balance=3000&number=22
            int balance =
            //int type을 구분을 지어야하는가?
            //String type이 없는데 int type 파싱을 어떻게 하지?

        }else if (method.equals("DELETE")){

        }

    }
}
