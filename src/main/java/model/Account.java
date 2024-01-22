package model;

import lombok.Getter;

import java.sql.Timestamp;

/**
 * DB에 Select 한 데이터를 담기 위한 오브젝트
 */

@Getter
public class Account {
    private int number;
    private String password;
    private int balance;

    //DB는 _ 자바는 카멜표기법
    private Timestamp createdAt;
}
