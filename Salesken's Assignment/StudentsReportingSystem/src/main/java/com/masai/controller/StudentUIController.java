package com.masai.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@Controller
public class StudentUIController {

	@Autowired
	private StudentRepository  sRepo;

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";

	}

	@GetMapping("/saveStudent")
	public String saveStudent() {
		return "saveStudent";

	}

	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student student) {
		sRepo.save(student);
		return "welcome";

	}

	@GetMapping("/getPercentage")
	public String getPercentageController() {
		return "getPercentage";
	}

	@PostMapping("/getPercentage")
	public String getPercentageController(Model model, @RequestParam Integer semester) {
		int sum = 0;
		int count = 0;
		List<Student> percentage = sRepo.findBySemester(semester);
		for (Student s : percentage) {
			count++;
			sum = sum + s.getMathematicsMark() + s.getEnglishMark() + s.getScienceMark();
		}
		sum = sum / count;
		sum = sum * 100 / 300;
		model.addAttribute("avg", sum);
		return "getPercentageOutput";
	}

	@GetMapping("/avgMarks")
	public String avgMarks() {

		return "avgMarksacctosubject";
	}

	@PostMapping("/avgMarks")
	public String avgMarks(Model model, @RequestParam String subject) {
		Iterable<Student> itr = sRepo.findAll();
		List<Student> students = new ArrayList<>();
		itr.forEach(students::add);
		int count = 0;
		int sum = 0;
		for (Student st : students) {
		
			count++;
			if (subject.equals("mathematics")) {
				sum =sum+ st.getMathematicsMark();
			} else if (subject.equals("english")) {
				sum =sum+ st.getEnglishMark();
			} else if (subject.equals("science")) {
				sum =sum+ st.getScienceMark();
			}
		}
		model.addAttribute("avgMarks", sum / count);
		return "avgResult";
	}
	
	
	
	@PostMapping("/topTwo")
	public String topView(Model model) {
		Iterable<Student> itr = sRepo.findAll();

		List<Student> students = new ArrayList<>();
		itr.forEach(students::add);
		HashMap<String, Integer> map = new HashMap<>();
		for (Student st : students) {
			map.put(st.getStudentName(), (st.getMathematicsMark() + st.getEnglishMark() + st.getScienceMark()) / 3);
		}
		
		TreeSet<Map.Entry<String, Integer>> sortedSet = new TreeSet<>(
	            new Comparator<Map.Entry<String, Integer>>() {
	                @Override
	                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	                    return o1.getValue() - o2.getValue();
	                }
	            });


		List<String> list = new ArrayList<>();
		int count = 1;
		for (Map.Entry<String, Integer> name : sortedSet) {
			if (count < 3) {
				list.add(name.getKey());
				count++;
			}

		}

		model.addAttribute("toptwo", list);
		return "topTwoResult";
	}

	@GetMapping("/topTwoStudent")
	public String topView() {
		return "topTwoStudent";
	}

}
