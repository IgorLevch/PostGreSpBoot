package com.example.sbPostgre.service;

import com.example.sbPostgre.entity.EmployeeEntity;
import com.example.sbPostgre.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public EmployeeEntity getUserById(Long id){
        return userRepository.getReferenceById(id);
    }

}
