/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author hv
 */
public class Login {
    String userName;
    String passsWord;

    public Login(String userName, String passsWord) {
        this.userName = userName;
        this.passsWord = passsWord;
    }

    public Login() {
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasssWord() {
        return passsWord;
    }

    public void setPasssWord(String passsWord) {
        this.passsWord = passsWord;
    }
    
}
