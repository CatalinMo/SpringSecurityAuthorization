package ro.fortech.userregistration.services;

import org.springframework.stereotype.Service;
import ro.fortech.userregistration.entities.Users;
import ro.fortech.userregistration.repo.UsersRepo;

import java.util.List;

@Service
public class UserService {
    private UsersRepo usersRepo;

    public UserService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public List<Users> getAllUsers(){
        return usersRepo.findAll();
    }

    public void addUser(Users users){
        usersRepo.save(users);
    }


}
