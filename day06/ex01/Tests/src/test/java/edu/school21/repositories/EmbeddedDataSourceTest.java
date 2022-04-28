package edu.school21.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.sql.Connection;

public class EmbeddedDataSourceTest {

    private DataSource data;

    @BeforeEach
    public void init() {
        EmbeddedDatabaseBuilder dataSource = new EmbeddedDatabaseBuilder();
        data = dataSource
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
    }

    @Test
    public void getConnection() throws Exception {
        Connection connection = data.getConnection();
        Assertions.assertNotNull(connection);
    }
}
