package web.subject.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.member.entity.SearchTeacherBO;
import web.subject.dao.SubjectSelectionDAO;
import web.subject.entity.SubjectEntity;
import web.subject.service.SubjectSelectionService;

@Service
@Transactional
public class SubjectSelectionServiceImpl implements SubjectSelectionService {
	
	@Autowired
	private SubjectSelectionDAO dao;

	@Override
	public List<SubjectEntity> allSubjects() {
		return dao.allSubjects();
	}

	@Override
	public List<SearchTeacherBO> allTeachersBySubjectId(Integer subjectId) {
		return dao.allTeachersBySubjectId(subjectId);
	}
	
	

}
