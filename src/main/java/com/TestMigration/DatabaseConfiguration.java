package com.TestMigration;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {
    @Bean(name = "productfeedback")
    @Primary
    public JdbcTemplate HolmesJDBCTemplate() {
        return new JdbcTemplate(holmesDataSource());
    }


    private DataSource holmesDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser("FlyWayDev");
        dataSource.setPassword("zu2hAbru");
        dataSource.setServerName("localhost");
        dataSource.setInstanceName("QAFI19");
        dataSource.setDatabaseName("ProductSafety");
        return dataSource;
    }


}

