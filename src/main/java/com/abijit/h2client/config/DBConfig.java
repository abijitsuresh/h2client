package com.abijit.h2client.config;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static io.r2dbc.spi.ConnectionFactoryOptions.*;

@Configuration
public class DBConfig {
//    @Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactoryOptions connectionFactoryOptions = ConnectionFactoryOptions.builder()
                .option(DRIVER, "h2")
                .option(PROTOCOL, "tcp")  // file, mem
                .option(HOST, "localhost")
                .option(PORT, 9092)
                .option(USER, "sa")
                .option(DATABASE, "~/Projects/h2-data/embeddedDB")
                .build();
        return ConnectionFactories.get(connectionFactoryOptions);
    }
}
