package com.example.springrestsecurity1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailManager() {
        UserDetails user1 = User.builder().username("user1").password("{noop}test123").roles("ROLE1").build();
        UserDetails user2 = User.builder().username("user2").password("{noop}test123").roles("ROLE2").build();
        return new InMemoryUserDetailsManager(user1, user2);
    }

}
