package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JdbcConfig {
    @Bean(name = {"ds"})
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://Localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("Oct121993@");
        return ds;
    }
  @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getTemplate()
    {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
}
