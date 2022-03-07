package web.orderInfo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class OrderInfoEntity {
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	@Column( name = "mem_id")
	private Integer memId;
	@Column(name = "course_id")
	private Integer courseId;
	@Column(name= "order_date", insertable = false)
	private Date orderDate;
	@Column(name ="class_record" ,insertable = false)
	private Integer classRecord;
	@Column(name="class_status",insertable = false)
	private Boolean classStatus;
	@Column(name = "transaction_status", insertable= false)
	private Boolean transactionStatus;
	@Column(name = "rate", insertable = false)
	private Integer rate;
	@Column(name = "comment", insertable = false)
	private String comment;
	
	public OrderInfoEntity() {}

	@Override
	public String toString() {
		return "OrderInfoEntity [orderId=" + orderId + ", memId=" + memId + ", courseId=" + courseId + ", orderDate="
				+ orderDate + ", classRecord=" + classRecord + ", classStatus=" + classStatus + ", transactionStatus="
				+ transactionStatus + ", rate=" + rate + ", comment=" + comment + "]";
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courdeId) {
		this.courseId = courdeId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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

	public Boolean getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(Boolean transactionStatus) {
		this.transactionStatus = transactionStatus;
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
