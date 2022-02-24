package web.education.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class EducationBean {

	@Id
	@Column(name = "edu_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eduid;
	
	@Column(name = "tea_id")
	private Integer teaid;
	
	@Column(name = "edu_start")
	private Date edustart;
	
	@Column(name = "edu_end")
	private Date eduend;
	
	@Column(name = "edu_school")
	private String eduschool;
	
	@Column(name = "edu_depart")
	private String edudepart;

	@Override
	public String toString() {
		return "EducationBean [eduid=" + eduid + ", teaid=" + teaid + ", edustart=" + edustart + ", eduend=" + eduend
				+ ", eduschool=" + eduschool + ", edudepart=" + edudepart + "]";
	}

	
	
	public Integer getEduid() {
		return eduid;
	}

	public void setEduid(Integer eduid) {
		this.eduid = eduid;
	}

	public Integer getTeaid() {
		return teaid;
	}

	public void setTeaid(Integer teaid) {
		this.teaid = teaid;
	}

	public Date getEdustart() {
		return edustart;
	}

	public void setEdustart(Date edustart) {
		this.edustart = edustart;
	}

	public Date getEduend() {
		return eduend;
	}

	public void setEduend(Date eduend) {
		this.eduend = eduend;
	}

	public String getEduschool() {
		return eduschool;
	}

	public void setEduschool(String eduschool) {
		this.eduschool = eduschool;
	}

	public String getEdudepart() {
		return edudepart;
	}

	public void setEdudepart(String edudepart) {
		this.edudepart = edudepart;
	}
	
}
