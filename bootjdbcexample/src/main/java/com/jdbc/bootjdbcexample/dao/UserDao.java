package com.jdbc.bootjdbcexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createtable()
    {
        String query="create table if not exists user(id int primary key,name varchar(20) not null,age int not null)";
        int update=this.jdbcTemplate.update(query);
        return update;
    }
    public int insertuser(int id,String name,int age)
    {
        String query="insert into user(id,name,age) values(?,?,?)";
        int update=this.jdbcTemplate.update(query, id,name,age);
        return update;
    }

    public int deleteuser(int i) {
        String query="delete from user where id=?";
        int update=this.jdbcTemplate.update(query,i);
        return  update;
    }

    public int updateuser(int i) {
        String query="update user set name=? where id=?";
        int update=this.jdbcTemplate.update(query,"yoy",i);
        return  update;
    }
}
