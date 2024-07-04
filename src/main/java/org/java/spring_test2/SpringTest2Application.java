package org.java.spring_test2;

import org.java.spring_test2.geometry.pojo.Circle;
import org.java.spring_test2.geometry.service.CircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTest2Application implements CommandLineRunner {

	@Autowired
	private CircleService circleService;

	public static void main(String[] args) {
		SpringApplication.run(SpringTest2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Circle c1 = new Circle(25);
		Circle c2 = new Circle(310);
		Circle c3 = new Circle(415);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println("-------------------------------------------------------------------------");

		circleService.saveCircle(c1);
		circleService.saveCircle(c2);
		circleService.saveCircle(c3);

		circleService.getAllCircles().forEach(System.out::println);
	}
}
