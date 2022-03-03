package web.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expertise")
public class Expertise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "expertise_id")
	private Integer expertiseId;
	
	@Column(name = "subject_id")
	private String subjectId;
	
	@Column(name = "expertise_name")
	private String expertiseName;

	public Integer getExpertiseId() {
		return expertiseId;
	}

	public void setExpertiseId(Integer expertiseId) {
		this.expertiseId = expertiseId;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getExpertiseName() {
		return expertiseName;
	}

	public void setExpertiseName(String expertiseName) {
		this.expertiseName = expertiseName;
	}
}
