package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.LoginController;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity.authorizeRequests().anyRequest().authenticated();
        httpSecurity.formLogin().loginPage(LoginController.PAGE).usernameParameter("user")
                .passwordParameter("pass").permitAll();
        httpSecurity.logout().logoutSuccessUrl("/login").permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)
            throws Exception
    {
        authenticationManagerBuilder.userDetailsService(this.userDetailsService);
    }

    @Autowired
    public void setUserDetailsService(UserDetailsService userDetailsService)
    {
        this.userDetailsService = userDetailsService;
    }
}