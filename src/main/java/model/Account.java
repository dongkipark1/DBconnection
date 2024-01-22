package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * DB에 Select 한 데이터를 담기 위한 오브젝트
 */

@AllArgsConstructor // 모든 아규먼트 생성자를 롬복이 만들어줌
@Getter
@Setter
@ToString
public class Account {
    private int number;
    private String password;
    private int balance;

    //DB는 _ 자바는 카멜표기법
    private Timestamp createdAt;


}
