package domain.entity;

import domain.dto.AccountInfo;

import java.util.ArrayList;
import java.util.List;


public class User {
    private String id;
    private String username;
    private String password;
    private String birth;
    private String phoneNum;
    private List<AccountInfo> accounts;

    public User(String id, String password, String username, String phoneNum, String birth,ArrayList<AccountInfo> accounts) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.phoneNum= phoneNum;
        this.birth = birth;
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPassword() {
        return String.valueOf(password);
    }

    public String getUsername() {
        return username;
    }

    public String getBirth() {
        return birth;
    }

    public int getAccountsCount() {
        return accounts.size();
    }
    public void addAccount(AccountInfo account) {
        accounts.add(account);
    }


}


