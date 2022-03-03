package web.subject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.member.entity.SearchTeacherBO;
import web.subject.entity.SubjectEntity;
import web.subject.service.SubjectSelectionService;

@RestController
@RequestMapping("subject")
public class SubjectSelectionController {
	
	@Autowired
	private SubjectSelectionService service;
	
	@PostMapping("allSubjects")
	public List<SubjectEntity> allSubjects() {
		return service.allSubjects();
	}
	
	@PostMapping("allTeachersBySubjectId")
	public List<SearchTeacherBO> allTeachersBySubjectId(@RequestBody SearchTeacherBO searchTeacher) {
		List<SearchTeacherBO> teachers = service.allTeachersBySubjectId(searchTeacher.getSubjectId());
		return teachers;
	}

}
