package com.shirodemo.shirodemo;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = "com.shirodemo.shirodemo.mapper")
public class ShirodemoApplication {

	@Autowired
	Environment en;

	public static void main(String[] args) {
		SpringApplication.run(ShirodemoApplication.class, args);
	}

	//进行数据的库的配置
	@Bean
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(en.getProperty("spring.datasource.url"));
		dataSource.setUsername(en.getProperty("spring.datasource.username"));
		dataSource.setPassword(en.getProperty("spring.datasource.password"));
		dataSource.setDriverClassName(en.getProperty("spring.datasource.driver-class-name"));
		return dataSource;
	}
}
