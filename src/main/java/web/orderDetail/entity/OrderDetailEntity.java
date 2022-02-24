package web.orderDetail.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderID;
	
	@Column(name = "s_id")
	private Integer studentId;
	
	@Column(name = "s_name")
	private String sName;
	
	@Column(name="order_date")
	private Date orderDate;
	
	@Column(name = "course_title")
	private String courseTitle;
	
	@Column(name = "t_name")
	private String tName;
	
	@Column(name = "expertise_id")
	private Integer expertiseId;
	
	@Column(name = "course_intro")
	private String courseIntro;

	@Column(name = "class_amount")
	private Integer classAmount;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "class_record")
	private Integer classRecord;
	
	@Column(name = "class_status")
	private Boolean classStatus;
	
	@Column(name ="transaction_status")
	private Boolean transStatus;
	
	@Column (name ="rate")
	private Integer rate;
	
	@Column (name = "comment")
	private String comment;

	public OrderDetailEntity() {
	}
	
	@Override
	public String toString() {
		return "OrderDetailEntity [orderID=" + orderID + ", studentId=" + studentId + ", sName=" + sName
				+ ", orderDate=" + orderDate + ", courseTitle=" + courseTitle + ", tName=" + tName + ", expertiseId="
				+ expertiseId + ", courseIntro=" + courseIntro + ", classAmount=" + classAmount + ", price=" + price
				+ ", classRecord=" + classRecord + ", classStatus=" + classStatus + ", transStatus=" + transStatus
				+ ", rate=" + rate + ", comment=" + comment + "]";
	}

	public Integer getOrderID() {
		return orderID;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public Integer getExpertiseId() {
		return expertiseId;
	}

	public void setExpertiseId(Integer expertiseId) {
		this.expertiseId = expertiseId;
	}

	public String getCourseIntro() {
		return courseIntro;
	}

	public void setCourseIntro(String courseIntro) {
		this.courseIntro = courseIntro;
	}

	public Integer getClassAmount() {
		return classAmount;
	}

	public void setClassAmount(Integer classAmount) {
		this.classAmount = classAmount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getClassRecord() {
		return classRecord;
	}

	public void setClassRecord(Integer classRecord) {
		this.classRecord = classRecord;
	}

	public Boolean getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(Boolean classStatus) {
		this.classStatus = classStatus;
	}

	public Boolean getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Boolean transStatus) {
		this.transStatus = transStatus;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}	

	

}
