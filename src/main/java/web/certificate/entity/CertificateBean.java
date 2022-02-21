package web.certificate.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "certificate")
public class CertificateBean {

	@Id
	@Column(name = "cert_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer certid;
	
	@Column(name = "tea_id")
	private Integer teaid;
	
	@Column(name = "cert_photo")
	private byte[] certphoto;

	@Override
	public String toString() {
		return "CertificateBean [certid=" + certid + ", teaid=" + teaid + ", certphoto=" + Arrays.toString(certphoto)
				+ "]";
	}

	
	public Integer getCertid() {
		return certid;
	}

	public void setCertid(Integer certid) {
		this.certid = certid;
	}

	public Integer getTeaid() {
		return teaid;
	}

	public void setTeaid(Integer teaid) {
		this.teaid = teaid;
	}

	public byte[] getCertphoto() {
		return certphoto;
	}

	public void setCertphoto(byte[] certphoto) {
		this.certphoto = certphoto;
	}
	
}
