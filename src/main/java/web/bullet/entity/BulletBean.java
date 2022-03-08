package web.bullet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sun.istack.NotNull;

@Entity
@Table(name = "bullet")

public class BulletBean extends Core implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bullet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bulletId;
	@Column(name = "admin_id")
	private Integer adminId;
	@NotNull
	@Column(name = "bullet_title",nullable = false)
	private String bulletTitle;
	@NotNull
	@Column(name = "bullet_content",nullable = false)
	private String bulletContent;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bullet_time", columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Date bulletTime = new Date();

	
	public BulletBean(Integer bulletID, Integer adminID, String bulletTitle, String bulletContent,
			Date bulletTime) {
		super();
		this.adminId = adminID;
		this.bulletId = bulletID;
		this.bulletTitle = bulletTitle;
		this.bulletContent = bulletContent;
		this.bulletTime = bulletTime;
	}

	public BulletBean(boolean successful) {
		super(successful);
	}

	public BulletBean() {
	}

	public Integer getBulletId() {
		return bulletId;
	}

	public void setBulletId(Integer bulletId) {
		this.bulletId = bulletId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getBulletTitle() {
		return bulletTitle;
	}

	public void setBulletTitle(String bulletTitle) {
		this.bulletTitle = bulletTitle;
	}

	public String getBulletContent() {
		return bulletContent;
	}

	public void setBulletContent(String bulletContent) {
		this.bulletContent = bulletContent;
	}

	public Date getBulletTime() {
		return bulletTime;
	}

	public void setBulletTime(Date bulletTime) {
		this.bulletTime = bulletTime;
	}

	@Override
	public String toString() {
		return "BulletBean [bulletId=" + bulletId + ", adminId=" + adminId + ", bulletTitle=" + bulletTitle
				+ ", bulletContent=" + bulletContent + ", bulletTime=" + bulletTime + "]";
	}

}
