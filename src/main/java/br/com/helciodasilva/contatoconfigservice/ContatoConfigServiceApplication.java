package br.com.helciodasilva.contatoconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringCloudApplication
public class ContatoConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatoConfigServiceApplication.class, args);
	}
}
