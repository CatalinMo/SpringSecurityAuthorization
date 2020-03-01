package ro.fortech.springsecurity.user_details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ro.fortech.springsecurity.entity.EntityUser;
import ro.fortech.springsecurity.repository.EntityUserRepository;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private EntityUserRepository entityUserRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
         Optional<EntityUser> user = entityUserRepository.findByUserName(userName);

         user.orElseThrow(() -> new UsernameNotFoundException("Not found: "+userName));

         return user.map(MyUserDetails::new).get();
    }
}
