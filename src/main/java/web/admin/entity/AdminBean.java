package web.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")

public class AdminBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "admin_id",insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	@Column(name = "admin_email")
	private String adminEmail;
	@Column(name="admin_password")
	private String adminPassword;
	

	public Integer getAdmin_Id() {
		return adminId;
	}

	public AdminBean(Integer adminId, String adminEmail, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}

	public AdminBean() {

	}

	@Override
	public String toString() {
		return "AdminBean [admin_Id=" + adminId + ", adminEmail=" + adminEmail + ", adminPassword=" + adminPassword
				+ "]";
	}

	public void setAdmin_Id(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(java.lang.String adminPassword) {
		this.adminPassword = adminPassword;
	}

}
