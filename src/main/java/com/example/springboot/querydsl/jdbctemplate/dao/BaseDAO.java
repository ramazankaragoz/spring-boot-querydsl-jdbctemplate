package com.example.springboot.querydsl.jdbctemplate.dao;


import com.querydsl.sql.SQLQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import java.io.Serializable;
/**
 * @author Ramazan Karagöz
 * @date 9/12/2019
 */

public abstract class BaseDAO<T> implements Serializable{

    private Class<T> dtoClass;

    @Autowired
    private SQLQueryFactory sqlQueryFactory;

    public BaseDAO() {
        dtoClass= (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(),BaseDAO.class);
    }


    public Integer save(Object[] columns,Object[] values){

        return null;

    }

    public SQLQueryFactory getSqlQueryFactory() {
        return sqlQueryFactory;
    }
}
