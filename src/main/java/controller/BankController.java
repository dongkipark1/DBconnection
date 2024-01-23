package controller;

import dao.BankDAO;
import lombok.AllArgsConstructor;

/**
 * 책임: 유효성 검사(바디 데이터를 검사), 파싱(바디 데이터를 파싱), 적절한 DAO
 * 책임을 최대한 적게 가져가라
 */
@AllArgsConstructor
public class BankController {

    private BankDAO dao;

    public void insert() {
        // 1. 파싱

        // 2. 유효성 검사
        // if(balance.length>){}

        // 3. dao 찾기
        // 컨트롤러에서 터질 것을 방지
        System.out.println("controller : insert");
        dao.insert("1234", 1000);
    }

    public void delete(){
        System.out.println("controller : delete");
        dao.deleteByNumber(1);
    }
    public void update(){
        System.out.println("controller : update");
        dao.updateByNumber(1000, 1);
    }
    public void selectOne(){
        System.out.println("controller : selectOne");
        dao.selectByNumber(1);
    }
    public void selectAll(){
        System.out.println("controller : selectAll");
        dao.selectAll();
    }
}
