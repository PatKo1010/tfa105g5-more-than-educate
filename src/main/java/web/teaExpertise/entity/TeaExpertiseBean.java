package web.teaExpertise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tea_expertise")
public class TeaExpertiseBean {

	@Id
	@Column(name = "tea_expertise_id")
	private Integer teaexpertiseid;
	
	@Column(name = "mem_id")	
	private Integer memid;
	
	@Column(name = "expertise_id")
	private Integer expertiseid;

	@Override
	public String toString() {
		return "TeaExpertiseBean [teaexpertiseid=" + teaexpertiseid + ", memid=" + memid + ", expertiseid="
				+ expertiseid + "]";
	}

	
	
	
	public Integer getTeaexpertiseid() {
		return teaexpertiseid;
	}

	public void setTeaexpertiseid(Integer teaexpertiseid) {
		this.teaexpertiseid = teaexpertiseid;
	}

	public Integer getMemid() {
		return memid;
	}

	public void setMemid(Integer memid) {
		this.memid = memid;
	}

	public Integer getExpertiseid() {
		return expertiseid;
	}

	public void setExpertiseid(Integer expertiseid) {
		this.expertiseid = expertiseid;
	}

}
