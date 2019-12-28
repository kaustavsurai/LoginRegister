package model;

import javax.persistence.*;
@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;
    @Column(name = "pass_word")
    private String password;
    @Column(name = "session_id")
    private String sessionId;

    public Login(){}

    public Login(String email,String password,String sessionId){
        setEmail(email);
        setPassword(password);
        setSessionId(sessionId);
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
