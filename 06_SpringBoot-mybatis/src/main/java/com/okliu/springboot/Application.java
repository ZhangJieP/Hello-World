package com.okliu.springboot;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.github.pagehelper.PageHelper;
import com.okliu.springboot.config.DataSourceConfig;
import com.okliu.springboot.config.MybatisDbAConfig;
import com.okliu.springboot.config.MybatisDbBConfig;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan(value= {"com.okliu.springboot.dao","com.okliu.springboot.DBDao"})
@ComponentScan(value= {"com.okliu.springboot.service.impl","com.okliu.springboot.web"})

@Import({DataSourceConfig.class,MybatisDbAConfig.class,MybatisDbBConfig.class})
public class Application {
		
	/**
	 *  
	 * @return
	 */
//	@Bean
//	public PageHelper pageHelper() {
//		PageHelper pageHelper=new PageHelper();
//		Properties properties=new Properties();
//		properties.setProperty("offsetPageNum", "true");
//		properties.setProperty("rowBoundsWithCount", "true");
//		properties.setProperty("reasonable", "true");
//		pageHelper.setProperties(properties);
//		return pageHelper;
//	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

