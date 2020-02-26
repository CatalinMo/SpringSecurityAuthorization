package ro.fortech.springsecurity.entity;

import javax.persistence.*;

@Entity
@Table(name = "EntityUser")
public class EntityUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;
    private String password;
    private boolean enabled;
    private String roles;

    public EntityUser() {
    }

    public EntityUser(String userName, String password, boolean enabled, String roles) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
