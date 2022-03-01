package web.reservDetail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name= "reserv_detail")
public class ReservDetailBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name= "reservTime_id")
	private Integer reservId;
    @Column(name= "order_id")
	private Integer orderId;
    @Column(name= "order_date")
	private java.sql.Date orderDate;
    @Column(name= "reservDate_start")
	private java.util.Date reservDateStart;
    @Column(name= "reservDate_end")
	private java.util.Date reservDateEnd;
    @Column(name= "course_id")
	private Integer courseId;
    @Column(name= "course_title")
    private String courseTitle;
    @Transient
    private Integer courseRank;
    @Column(name= "t_id")
	private Integer tId;
    @Column(name= "t_name")
	private String tName;
    @Column(name= "s_name")
	private String sName;
    @Column(name= "is_reserved")
	private Boolean isReserved;
    
    public ReservDetailBean () {};
    
	@Override
	public String toString() {
		return "reservDetailBean [reservId=" + reservId + ", orderId=" + orderId + ", orderDate=" + orderDate
				+ ", reservDateStart=" + reservDateStart + ", reservDateEnd=" + reservDateEnd + ", courseId=" + courseId
				+ ", tId=" + tId + ", tName=" + tName + ", sName=" + sName + ", isReserved=" + isReserved + "]";
	}
	public Integer getReservId() {
		return reservId;
	}
	public void setReservId(Integer reservId) {
		this.reservId = reservId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public java.sql.Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(java.sql.Date orderDate) {
		this.orderDate = orderDate;
	}
	public java.util.Date getReservDateStart() {
		return reservDateStart;
	}
	public void setReservDateStart(java.util.Date reservDateStart) {
		this.reservDateStart = reservDateStart;
	}
	public java.util.Date getReservDateEnd() {
		return reservDateEnd;
	}
	public void setReservDateEnd(java.util.Date reservDateEnd) {
		this.reservDateEnd = reservDateEnd;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Boolean getIsReserved() {
		return isReserved;
	}
	public void setIsReserved(Boolean isReserved) {
		this.isReserved = isReserved;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public Integer getCourseRank() {
		return courseRank;
	}

	public void setCourseRank(Integer courseRank) {
		this.courseRank = courseRank;
	}
	
    
    



}
