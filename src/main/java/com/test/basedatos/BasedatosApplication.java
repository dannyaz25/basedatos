package com.test.basedatos;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {ContextInstanceDataAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class BasedatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasedatosApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(PersonReposity personReposity){
	return args -> {
		personReposity.save(new Person(1l,"John","Smith"));
		//personReposity.save(new Person(2l,"Jane","Smith"));
	};
	}

}
