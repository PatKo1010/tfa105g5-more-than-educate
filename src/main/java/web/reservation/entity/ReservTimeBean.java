package web.reservation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="reserv_time")
public class ReservTimeBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "reservTime_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Integer reservID;
	@Column(name = "order_id")
	private Integer orderID;
	@Column(name ="reservDate_start",insertable = false)
	private Date reservDateStart;
	@Column(name = "reservDate_end", insertable = false)
	private Date reservDateEnd;
	@Column(name = "is_reserved", insertable= false)
	private Boolean isReserved;

	public ReservTimeBean() {
	}
	
	@Override
	public String toString() {
		return "ReservTimeBean [reservID=" + reservID + ", orderID=" + orderID + ", reservDateStart=" + reservDateStart
				+ ", reservDateEnd=" + reservDateEnd + ", isReserved=" + isReserved + "]";
	}

	public Integer getReservID() {
		return reservID;
	}

	public void setReservID(Integer reservID) {
		this.reservID = reservID;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
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
