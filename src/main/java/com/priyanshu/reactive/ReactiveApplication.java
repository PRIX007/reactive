package com.priyanshu.reactive;

import com.priyanshu.reactive.student.Student;
import com.priyanshu.reactive.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentService service)
	{return args -> {
		for (int i = 0; i < 50; i++) {
			service.save(Student.builder().id(i).firstName("FirstName_" + i)
					.LastName("LastName" + i).age(i).build()).subscribe();
		}
	};
	}


}
