package br.com.kandrade.noteapi;

import br.com.kandrade.noteapi.config.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MongoConfig.class)
public class NoteapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteapiApplication.class, args);
	}
}
