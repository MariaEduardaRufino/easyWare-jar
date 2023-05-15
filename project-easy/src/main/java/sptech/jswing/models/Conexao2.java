/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.models;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author dusda
 */
public class Conexao2 {
     private JdbcTemplate connection;
    
    public Conexao2() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://18.206.158.133/banco1");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
        this.connection = new JdbcTemplate(dataSource);
    }

    
    public JdbcTemplate getConnection() {
        return connection;
    }
}
