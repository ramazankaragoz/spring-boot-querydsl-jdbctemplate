package com.example.springboot.querydsl.jdbctemplate.dao;

import com.example.springboot.querydsl.jdbctemplate.dto.QUsrUser;
import com.example.springboot.querydsl.jdbctemplate.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.sql.RowId;
import java.sql.SQLException;
import java.util.List;


/**
 * @author Ramazan Karagöz
 * @date 9/12/2019
 */

@Repository
public class UserDAOimpl extends BaseDAO<UserDTO> implements UserDAO {

    @Override
    public UserDTO save(UserDTO userDTO) {

        QUsrUser qUsrUser = QUsrUser.usrUser;

        Integer id= null;

            id = getSqlQueryFactory().insert(qUsrUser)
                    .columns(
                            qUsrUser.userName,
                            qUsrUser.firstName,
                            qUsrUser.lastName,
                            qUsrUser.password)
                    .values(
                            userDTO.getUserName(),
                            userDTO.getFirstName(),
                            userDTO.getLastName(),
                            userDTO.getPassword()).executeWithKey(Integer.class);


        if (id!=null){
            userDTO.setId(id.longValue());
        }

        return userDTO;
    }

    @Override
    public UserDTO getById(Long aLong) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {


        return null;
    }
}
