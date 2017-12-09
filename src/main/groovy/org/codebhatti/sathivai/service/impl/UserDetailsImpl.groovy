package org.codebhatti.sathivai.service.impl

import org.codebhatti.sathivai.domain.User
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

/**
 * Created by binai_rai on 12/9/17.
 */
class UserDetailsImpl implements UserDetails{

    User user

    UserDetailsImpl(User user) {
        this.user = user
    }

    @Override
    Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>()
        Set<String> roles = user.getRoles()
        for( String role : roles ) {
            authorities.add( new SimpleGrantedAuthority(role) )
        }
        return authorities
    }

    @Override
    String getPassword() {
        return user.getPassword()
    }

    @Override
    String getUsername() {
        return user.getEmail()
    }

    @Override
    boolean isAccountNonExpired() {
        return true
    }

    @Override
    boolean isAccountNonLocked() {
        return true
    }

    @Override
    boolean isCredentialsNonExpired() {
        return true
    }

    @Override
    boolean isEnabled() {
        return true
    }
}
