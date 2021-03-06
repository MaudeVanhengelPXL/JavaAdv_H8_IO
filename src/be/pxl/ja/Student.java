package be.pxl.ja;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {

	private String name;
	private LocalDate graduationDate;
	private transient LocalDate dateOfBirth;
	//niet mee geserialiseerd

	public Student(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}

	public String getName() {
		return name;
	}

	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
}
