package com.example.App2;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.antMatcher("/**").
//                 authorizeRequests()
//                .anyRequest().authenticated()
////                .antMatchers("/admin")
////                .hasRole("ADMIN")
////                .antMatchers("/app3")
////                .hasRole("ADMIN")
////                .antMatchers("/app1", "/app2")
////                .hasAnyRole("USER, ADMIN")
////                .antMatchers("/user")
////                .hasAnyRole("USER","ADMIN")
//                .antMatchers("/")
//                .permitAll()
//                .and()

//                .oauth2Login();
        http.antMatcher("/**").authorizeRequests()
                //.anyRequest().authenticated()
                .antMatchers("/", "/login**").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
    }
}
