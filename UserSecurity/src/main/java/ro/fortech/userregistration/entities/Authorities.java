package ro.fortech.userregistration.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Authorities {
    @Id
    @GeneratedValue private Long id;
    private String username;
    private String authority;

    @OneToOne
    @JoinColumn(name = "users_id")
    private Users users;


    public Authorities(String username, String authority, Users users) {
        this.username = username;
        this.authority = authority;
        this.users = users;
    }

    public Authorities() {
    }
}
