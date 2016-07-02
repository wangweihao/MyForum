package com.baobaotao.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wwh on 16-7-2.
 */

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "t_login_log")
public class LoginLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login_log_id")
    private int loginLogId;

    @Column(name = "login_datetime")
    private Date loginDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String ip;

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public User getUser() {
        return user;
    }

    public String getIp() {
        return ip;
    }
}
