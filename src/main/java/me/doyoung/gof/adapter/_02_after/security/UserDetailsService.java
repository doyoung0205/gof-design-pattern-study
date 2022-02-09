package me.doyoung.gof.adapter._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
