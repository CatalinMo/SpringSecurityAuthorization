package ro.fortech.userregistration.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private boolean enabled;

    @OneToOne(mappedBy = "users")
    private Authorities authorities;


    public Users() {
    }

    public Users(String username, String password, boolean enabled, Authorities authorities){
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authorities = authorities;

    }
}
