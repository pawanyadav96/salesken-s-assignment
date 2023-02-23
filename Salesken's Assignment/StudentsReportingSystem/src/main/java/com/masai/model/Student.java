package com.masai.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(indexName = "student")
public class Student {
	@Id()
	private Long studentRoll;
	private String studentName;
	private Integer semester;
	private Integer mathematicsMark;
	private Integer scienceMark;
	private Integer englishMark;
	
	

	public Student(Long studentRoll, String studentName, Integer mathematicsMark, Integer scienceMark,
			Integer englishMark, Integer semester) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.mathematicsMark = mathematicsMark;
		this.scienceMark = scienceMark;
		this.englishMark = englishMark;
		this.semester = semester;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(Long studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getMathematicsMark() {
		return mathematicsMark;
	}
	public void setMathematicsMark(Integer mathematicsMark) {
		this.mathematicsMark = mathematicsMark;
	}
	public Integer getScienceMark() {
		return scienceMark;
	}
	public void setScienceMark(Integer scienceMark) {
		this.scienceMark = scienceMark;
	}
	public Integer getEnglishMark() {
		return englishMark;
	}
	public void setEnglishMark(Integer englishMark) {
		this.englishMark = englishMark;
	}
	public Integer getSemester() {
		
		return semester;
	}
	
	//It will take only 1 or 2 for semester
	public void setSemester(Integer semester) {
		if(this.semester ==1 || this.semester ==2)
		{
			this.semester = semester;
		}
		else {
            System.out.println("Invalid semester value. Semester must be 1 or 2.");
        }
	}
	
	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mathematicsMark="
				+ mathematicsMark + ", scienceMark=" + scienceMark + ", englishMark=" + englishMark + ", semester="
				+ semester + "]";
	}
}
