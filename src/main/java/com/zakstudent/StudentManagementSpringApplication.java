package com.zakstudent;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.*;

import com.zakstudent.dao.EtudiantRepository;
import com.zakstudent.entities.Etudiant;

@SpringBootApplication
public class StudentManagementSpringApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(StudentManagementSpringApplication.class, args);
		EtudiantRepository etudiantrepository = ctx.getBean(EtudiantRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		etudiantrepository.save(new Etudiant("Zakariae ", df.parse("1999-12-23"), "zak@aol.com", "Zakariae.jpg"));
		etudiantrepository.save(new Etudiant("imane", df.parse("2000-03-15"), "imane@aol.com", "imane.jpg"));
		
		/*
		 * Page<Etudiant> etudiants = etudiantrepository.findAll(PageRequest.of(0,5));
		 * // get 5 students from page 0. 0 is the first page and 1 is the second . we
		 * have only two students so we only have students in the first page 0 therefore
		 * if we change 0 by 1; nothing will be printed
		 * etudiants.forEach(e->System.out.println(e.getNom())); // print all students
		 * name specified in the list etudiants above
		 * 
		 * Page<Etudiant> etudiants1 = etudiantrepository.chercherEtudiant("%m%",
		 * PageRequest.of(0, 5)); // done moi 5 etudiants de la page 0 dont le nom
		 * contient la lette m etudiants1.forEach(e->System.out.println(e.getNom()));
		 */
	
	}

}
