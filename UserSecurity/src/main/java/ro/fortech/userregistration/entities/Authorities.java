package ro.fortech.userregistration.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Authorities {
    @Id
    @GeneratedValue private Long id;
    private String username;
    private String authority;


    public Authorities() {
    }

    public Authorities(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

}
