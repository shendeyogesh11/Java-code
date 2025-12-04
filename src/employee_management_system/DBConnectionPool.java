package employee_management_system;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBConnectionPool {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/employee_management");
        config.setUsername("root");
        config.setPassword("Yogesh.@0059");

        config.setMaximumPoolSize(10);        // Max connections in pool
        config.setMinimumIdle(2);             // Minimum idle ready connections
        config.setIdleTimeout(30000);         // Idle connection timeout
        config.setConnectionTimeout(30000);   // Wait time for a free connection
        config.setMaxLifetime(1800000);       // Max connection lifetime

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}
