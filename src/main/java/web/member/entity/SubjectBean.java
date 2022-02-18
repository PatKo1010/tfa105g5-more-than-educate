package web.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //Entity意義: 代表了Class級 是VO (OOP世界觀)
@Table(name = "subject")  //Table意義: 代表了Class級 是table(資料庫世界觀)
// =>Bean is a Entity
public class SubjectBean {
	@Id
	@Column(name = "subject_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectid;

	@Column(name = "subject_name")
	private String subjectname;

	@Override
	public String toString() {
		return "SubjectBean [subjectid=" + subjectid + ", subjectname=" + subjectname + "]";
	}

	
	public Integer getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
}