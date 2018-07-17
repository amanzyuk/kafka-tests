package ua.ardas.kafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(GreetingsStreams.class)
@Slf4j
public class KafkaConsumerStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerStreamApplication.class, args);
	}

	@Autowired
	private GreetingsStreams processor;

}
