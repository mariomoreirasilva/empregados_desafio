package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//classe de configuração que será responsvel para criar componentes, etc

@Configuration
public class AppConfig {

   @Bean
   public PasswordEncoder passwordEncoder() {
    	//metodo para criptografar a senha. será usado no service
		return new BCryptPasswordEncoder();
	}

}
