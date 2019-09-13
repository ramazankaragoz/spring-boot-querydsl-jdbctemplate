package com.example.springboot.querydsl.jdbctemplate.service;

import com.example.springboot.querydsl.jdbctemplate.dao.UserDAO;
import com.example.springboot.querydsl.jdbctemplate.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author Ramazan Karagöz
 * @date 9/12/2019
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public UserDTO save(UserDTO userDTO) {
        return userDAO.save(userDTO);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return null;
    }

    @Transactional
    @Override
    public List<UserDTO> findAll() {
        return userDAO.findAll();
    }

    @Transactional
    @Override
    public UserDTO findById(Long aLong) {
        return null;
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) {

    }

    @Transactional
    @Override
    public void delete(UserDTO userDTO) {

    }
}
