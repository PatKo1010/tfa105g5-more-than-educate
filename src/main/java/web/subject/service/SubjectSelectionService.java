package web.subject.service;

import java.util.List;

import web.member.entity.SearchTeacherBO;
import web.subject.entity.SubjectEntity;

public interface SubjectSelectionService {

	public List<SubjectEntity> allSubjects();
	public List<SearchTeacherBO> allTeachersBySubjectId(Integer subjectId);

}
