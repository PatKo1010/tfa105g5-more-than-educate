package web.reservDetail.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReservDetailWithRank implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "course_rank")
	private Integer courseRank;
	@Column(name = "s_name")
	private String sName;
	@Column(name = "course_id")
	private Integer courseId;
	@Column(name = "course_title")
	private String courseTitle;
	@Column(name = "t_id")
	private Integer tId;
	@Column(name = "t_name")
	private String tName;
	@Id
	@Column(name ="reservTime_id")
	private Integer reservTimeId;
	@Column(name = "reservDate_start")
	private Date reservDateStart;
	@Column(name = "reservDate_end")
	private Date reservDateEnd;
	@Column(name = "is_reserved")
	private Boolean isReserved;
	
	public ReservDetailWithRank () {}

	@Override
	public String toString() {
		return "ReservDetailWithRank [orderId=" + orderId + ", courseRank=" + courseRank + ", sName=" + sName
				+ ", courseId=" + courseId + ", courseTitle=" + courseTitle + ", tId=" + tId + ", tName=" + tName
				+ ", reservTimeId=" + reservTimeId + ", reservDateStart=" + reservDateStart + ", reservDateEnd="
				+ reservDateEnd + ", isReserved=" + isReserved + "]";
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCourseRank() {
		return courseRank;
	}

	public void setCourseRank(Integer courseRank) {
		this.courseRank = courseRank;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
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

	public Integer getReservTimeId() {
		return reservTimeId;
	}

	public void setReservTimeId(Integer reservTimeId) {
		this.reservTimeId = reservTimeId;
	}

	public Date getReservDateStart() {
		return reservDateStart;
	}

	public void setReservDateStart(Date reservDateStart) {
		this.reservDateStart = reservDateStart;
	}

	public Date getReservDateEnd() {
		return reservDateEnd;
	}

	public void setReservDateEnd(Date reservDateEnd) {
		this.reservDateEnd = reservDateEnd;
	}

	public Boolean getIsReserved() {
		return isReserved;
	}

	public void setIsReserved(Boolean isReserved) {
		this.isReserved = isReserved;
	}

}
