package ro.fortech.userregistration.entities;

import javax.persistence.*;

@Entity
public class Authorities {
    @Id
    @GeneratedValue private Long id;
    private String username;
    private String authority;

    @OneToOne
    @JoinColumn(name = "users_id")
    private Users users;


    public Authorities() {
    }


}
