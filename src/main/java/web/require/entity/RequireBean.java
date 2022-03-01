package web.require.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "require_list")
public class RequireBean {
	@Id
	@Column(name = "require_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Integer require_id;
	public Integer getRequire_id() {
		return require_id;
	}

	public void setRequire_id(Integer require_id) {
		this.require_id = require_id;
	}

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public Integer getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}

	public String getLearning_purpose() {
		return learning_purpose;
	}

	public void setLearning_purpose(String learning_purpose) {
		this.learning_purpose = learning_purpose;
	}

	public String getAvail_time() {
		return avail_time;
	}

	public void setAvail_time(String avail_time) {
		this.avail_time = avail_time;
	}

	public Integer getPrice_min() {
		return price_min;
	}

	public void setPrice_min(Integer price_min) {
		this.price_min = price_min;
	}

	public Integer getPrice_max() {
		return price_max;
	}

	public void setPrice_max(Integer price_max) {
		this.price_max = price_max;
	}

	public String getRequire_detail() {
		return require_detail;
	}

	public void setRequire_detail(String require_detail) {
		this.require_detail = require_detail;
	}

	@Column(name = "mem_id")
	private Integer mem_id;
	@Column(name = "subject_id")
	private Integer subject_id;
	@Column(name = "learning_purpose")
	private String learning_purpose;
	@Column(name = "avail_time")
	private String avail_time;
	@Column(name = "price_min")
	private Integer price_min;
	@Column(name = "price_max")
	private Integer price_max;
	@Column(name = "require_detail")
	private String require_detail;
	
	@Override
	public String toString() {
		return "RequireBean [require_id=" + require_id + ", mem_id" + mem_id + ", subject_id=" + subject_id + ", learning_purpose=" + learning_purpose + ", avail_time=" + avail_time + ", price_min=" + price_min + ", price_max=" + price_max + ", require_detail=" + require_detail + "]";
	}

}
