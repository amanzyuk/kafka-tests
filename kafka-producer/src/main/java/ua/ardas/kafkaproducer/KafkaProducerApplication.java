package ua.ardas.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {

	@Autowired
	public KafkaProducerApplication(Sender sender) {
		this.sender = sender;
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}


	private final Sender sender;

	@Override
	public void run(String... args) throws Exception {
		int i = 0;
		while (true) {
			sender.send("test message " + i, String.valueOf(i++));
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
