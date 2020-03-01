package ro.fortech.springsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ro.fortech.springsecurity.user_details.UserDetailsServiceImpl;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    //Authentication

    //MySQL Authentification



    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }
    //Authorization
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin")
//                .hasRole("ADMIN")
////                .antMatchers("/app3")
////                .hasRole("ADMIN")
////                .antMatchers("/app1", "/app2")
////                .hasAnyRole("USER, ADMIN")
//                .antMatchers("/user")
//                .hasAnyRole("USER","ADMIN")
//                .antMatchers("/")
//                .permitAll()
//                .and()
//                .formLogin();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
                .antMatchers("/login", "/oauth/authorize")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
//                .authorizeRequests()
//                .antMatchers("/").hasAnyRole("ADMIN","USER").and()
                .formLogin().permitAll();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
