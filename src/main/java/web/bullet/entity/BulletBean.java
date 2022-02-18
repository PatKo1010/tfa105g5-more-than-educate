package web.bullet.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bullet")

public class BulletBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="bullet_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Integer bulletID;
	@Column(name="admin_id")
	private Integer adminID;
	@Column(name="bullet_title")
	private String bulletTitle;
	@Column(name="bullet_content")
	private String bulletContent;
	@Column(name="bullet_time")
	private LocalDateTime bulletTime;
	
	
	public BulletBean() {
	}
	
	public BulletBean(Integer bulletID,Integer adminID,String bulletTitle,String bulletContent,LocalDateTime bulletTime) {
		super();
		this.adminID=adminID;
		this.bulletID=bulletID;
		this.bulletTitle=bulletTitle;
		this.bulletContent=bulletContent;
		this.bulletTime=bulletTime;
	}
	
	public Integer getBulletId() {
		return bulletID;
	}

	public void setBulletId(Integer bulletId) {
		this.bulletID = bulletId;
	}

	public Integer getAdminId() {
		return adminID;
	}

	public void setAdminId(Integer adminId) {
		this.adminID = adminId;
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

	public LocalDateTime getBulletTime() {
		return bulletTime;
	}

	public void setBulletTime(LocalDateTime bulletTime) {
		this.bulletTime = bulletTime;
	}

	@Override
	public String toString() {
		return "BulletBean [bulletId=" + bulletID + ", adminId=" + adminID + ", bulletTitle=" + bulletTitle
				+ ", bulletContent=" + bulletContent + ", bulletTime=" + bulletTime + "]";
	}


	}
