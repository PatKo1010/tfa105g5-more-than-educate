package web.orderInfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class CourseEntity{
	
	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseid;
	
	@Column(name = "mem_id")
	private Integer memid;
	
	@Column(name = "expertise_id")
	private Integer expertiseid;
	
	@Column(name = "course_title")
	private String coursetitle;
	
	@Column(name = "course_intro")
	private String courseintro;
	
	@Column(name = "class_amount")
	private Integer classamount;
	
	@Column(name = "price")
	private Integer price;
	
	@Override
	public String toString() {
		return "CourseBean [courseid=" + courseid + ", memid=" + memid + ", expertiseid=" + expertiseid
				+ ", coursetitle=" + coursetitle + ", courseintro=" + courseintro + ", classamount=" + classamount
				+ ", price=" + price + "]";
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
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

	public String getCoursetitle() {
		return coursetitle;
	}

	public void setCoursetitle(String coursetitle) {
		this.coursetitle = coursetitle;
	}

	public String getCourseintro() {
		return courseintro;
	}

	public void setCourseintro(String courseintro) {
		this.courseintro = courseintro;
	}

	public Integer getClassamount() {
		return classamount;
	}

	public void setClassamount(Integer classamount) {
		this.classamount = classamount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
