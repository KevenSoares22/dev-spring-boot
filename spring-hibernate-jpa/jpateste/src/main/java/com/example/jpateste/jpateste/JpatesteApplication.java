package com.example.jpateste.jpateste;

import com.example.jpateste.jpateste.dao.StudentDAO;
import com.example.jpateste.jpateste.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpatesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpatesteApplication.class, args);
	}


	@Bean
	    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
            return runner -> { createStudent(studentDAO)};

}











private void createStudent(StudentDAO studentDAO){
		Student tempStudent = new Student("Test", "User", "testuser@mail.com");
        studentDAO.save(tempStudent);
        System.out.println(tempStudent.getId());

}
}
