package br.com.agtec.ConfigurationBeanExample.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.agtec.ConfigurationBeanExample.models.Carro;

/*
 * Ao inicializar, o Spring busca as classes Configuration
 */
@Configuration
public class CarroConfiguration {

	/*
	 * Objeto @Bean pode ser utilizado em outras partes do código.
	 */
	@Bean(name="gol")
	public Carro gol() {
		return new Carro() {
			
			@Override
			public String getNome() {
				return "Gol";
			}
		};
				
	}
	
	@Bean(name="camaro")
	public Carro camaro() {
		return new Carro() {
			
			@Override
			public String getNome() {
				return "Camaro";
			}
		};
				
	}
}
