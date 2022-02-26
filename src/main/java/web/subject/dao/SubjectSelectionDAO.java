package web.subject.dao;

import java.util.List;

import web.member.entity.SearchTeacherBO;
import web.subject.entity.SubjectEntity;

public interface SubjectSelectionDAO {
	
	// select all
	public List<SubjectEntity> allSubjects();
	
	// select all teachers by subject id
	public List<SearchTeacherBO> allTeachersBySubjectId(Integer subjectId);

}
