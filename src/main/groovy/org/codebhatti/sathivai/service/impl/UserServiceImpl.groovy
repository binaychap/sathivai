package org.codebhatti.sathivai.service.impl

import org.codebhatti.sathivai.domain.User
import org.codebhatti.sathivai.repository.UserRepository
import org.codebhatti.sathivai.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

/**
 * Created by binai_rai on 12/9/17.
 */
@Service
class UserServiceImpl implements UserService, UserDetailsService{

    @Autowired
     UserRepository userRepository

    @Override
    User findByEmail(String email) {
        return userRepository.findByEmail(email)
    }

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByEmail(username)
        if(user == null){
            throw new UsernameNotFoundException(username)
        }
        return new UserDetailsImpl(user)
    }


}
