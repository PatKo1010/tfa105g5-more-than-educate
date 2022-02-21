package web.wrkExp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wrk_exp")
public class WrkExpBean {
	@Id
	@Column(name = "wrkExp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer wkexpid;

	@Column(name = "tea_id")
	private Integer teaid;

	@Column(name = "wk_duration")
	private Integer wkduration;

	@Column(name = "wk_unit")
	private String wkunit;

	@Column(name = "wk_title")
	private String wktitle;

	@Override
	public String toString() {
		return "WrkExpBean [wkexpid=" + wkexpid + ", teaid=" + teaid + ", wkduration=" + wkduration + ", wkunit="
				+ wkunit + ", wktitle=" + wktitle + "]";
	}

	
	public Integer getWkexpid() {
		return wkexpid;
	}

	public void setWkexpid(Integer wkexpid) {
		this.wkexpid = wkexpid;
	}

	public Integer getTeaid() {
		return teaid;
	}

	public void setTeaid(Integer teaid) {
		this.teaid = teaid;
	}

	public Integer getWkduration() {
		return wkduration;
	}

	public void setWkduration(Integer wkduration) {
		this.wkduration = wkduration;
	}

	public String getWkunit() {
		return wkunit;
	}

	public void setWkunit(String wkunit) {
		this.wkunit = wkunit;
	}

	public String getWktitle() {
		return wktitle;
	}

	public void setWktitle(String wktitle) {
		this.wktitle = wktitle;
	}

}
