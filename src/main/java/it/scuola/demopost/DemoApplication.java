package it.scuola.demopost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Message m = new Message();
		m.setText("prova da codice");
		MessageRepository messageRepository = context.getBean(MessageRepository.class);
		messageRepository.save(m);
	}

}
