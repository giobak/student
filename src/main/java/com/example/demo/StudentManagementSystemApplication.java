package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student1 = new Student("Giorgi", "Bakradze", "gbak@yyahoo.com");
		studentRepository.save(student1);

		Student student2 = new Student("Nino", "InasaridZe", "ninoin@yahoo.de");
		studentRepository.save(student2);

		Student student3 = new Student("Nia", "Bakradze", "nia@yahoo.de");
		studentRepository.save(student3);

		Student student4 = new Student("Anano", "Bakradze", "anano@yahoo.de");
		studentRepository.save(student4);
	}
}
