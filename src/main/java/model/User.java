package model;
import java.io.Serializable;

public class User implements Serializable {
    private int id; // 主キー
    private String loginName; //ログイン用ユーザー名
    private String name;  // ユーザー名
    private String pass;  // パスワード
    
    public User() {}
    public User(String name, String pass) {
    	this.name = name; 
    	this.pass = pass; 
    	}
    
    public User(int id, String loginName, String name, String pass) { 
    	this.id = id; 
    	this.loginName = loginName;
    	this.name = name; 
    	this.pass = pass; 
    	}

    //getter/setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getLoginName() { return loginName; }
    public void setLoginName(String loginName) { this.loginName = loginName; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }
}
