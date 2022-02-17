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
	@Column(name ="reservDate_start")
	private Date reservDateStart;
	@Column(name = "reservDate_end")
	private Date reservDateEnd;

	public ReservTimeBean() {
	}

	public ReservTimeBean(Integer orderID, Date reservDateStart, Date reservDateEnd) {
		super();
		this.orderID = orderID;
		this.reservDateStart = reservDateStart;
		this.reservDateEnd = reservDateEnd;
	}

	@Override
	public String toString() {
		return "ReservTimeBean [reservID=" + reservID + ", orderID=" + orderID + ", reservDateStart=" + reservDateStart
				+ ", reservDateEnd=" + reservDateEnd + "]";
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

}
