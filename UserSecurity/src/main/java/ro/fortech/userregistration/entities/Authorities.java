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

}
