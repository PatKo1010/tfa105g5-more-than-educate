package web.subject.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import web.member.entity.SearchTeacherBO;
import web.subject.dao.SubjectSelectionDAO;
import web.subject.entity.SubjectEntity;

@Repository
public class SubjectSelectionDAOImpl implements SubjectSelectionDAO {
	
	@PersistenceContext
	private Session session;
	
	public Session getSession() {
		return session;
	}

	@Override
	public List<SubjectEntity> allSubjects() {
		CriteriaBuilder criteriaBuilder = this.getSession().getCriteriaBuilder();
		CriteriaQuery<SubjectEntity> criteriaQuery = criteriaBuilder.createQuery(SubjectEntity.class);
		Root<SubjectEntity> root = criteriaQuery.from(SubjectEntity.class);
		criteriaQuery = criteriaQuery.select(root);
		Query<SubjectEntity> query = this.getSession().createQuery(criteriaQuery);
		List<SubjectEntity> subjects = query.list();
		return subjects;
	}

	@Override
	public List<SearchTeacherBO> allTeachersBySubjectId(Integer subjectId) {

		String query = 
				"SELECT " +
				    "m.mem_id as memId, " + 
					"s.subject_id as subjectId, " + 
					"s.subject_icon as subjectIcon, " + 
					"m.username as username, " + 
					"m.tea_title as teacherTitle, " + 
					"m.intro_content as teacherContent, " + 
					"m.photo as teacherPhoto " + 
				"FROM subject s " + 
					"INNER JOIN member m " + 
						"ON s.subject_id = m.subject_id " + 
				"WHERE s.subject_id = :subjectId AND m.tea_qual = 1";
		List<SearchTeacherBO> teachers =  this.getSession()
				.createNativeQuery(query, SearchTeacherBO.class)
				.setParameter("subjectId", subjectId)
				.list();
		
		return teachers;
	}
	
	

}
