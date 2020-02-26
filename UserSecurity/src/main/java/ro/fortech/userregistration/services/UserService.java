package ro.fortech.userregistration.services;

import org.springframework.stereotype.Service;
\import ro.fortech.userregistration.entities.Authorities;
import ro.fortech.userregistration.entities.Users;
import ro.fortech.userregistration.repo.AuthoritiesRepo;
import ro.fortech.userregistration.repo.UsersRepo;

import java.util.List;

@Service
public class UserService {
    private UsersRepo usersRepo;
    private AuthoritiesRepo authoritiesRepo;

    public List<Users> getAllUsers(){
        return usersRepo.findAll();
    }

    public void addUser(Users users){
        Authorities authorities = new Authorities(users.getUsername(),users.getAuthorities().getAuthority(),users);
        usersRepo.save(users);
        authoritiesRepo.save(authorities);
    }


}
