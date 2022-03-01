package web.member.entity;

import java.util.Arrays;
import java.util.Date;//java.sql.date

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "member")
@DynamicInsert
public class MemberBean {
	@Id
	@Column(name = "mem_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memid;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "username")
	private String username;
	@ColumnDefault("手機號碼")
	@Column(name = "phone_num")
	private String phonenum;
	@ColumnDefault("1970-01-01")
	@Column(name = "birth")
	private Date birth;

	@Column(name = "photo")
	private byte[] photo;
	@ColumnDefault("0")
	@Column(name = "tea_qual")
	private Boolean teaqual;

	@Column(name = "reg_date")
	private Date regdate;

	@Column(name = "tea_title")
	private String teatitle;

	@Column(name = "subject_id")
	private Integer subjectid; // FK

	@Column(name = "intro_content")
	private String introcontent;

	@Column(name = "intro_clip")
	private byte[] introclip;

	@Column(name = "rate_sum")
	private Integer ratesum;

	@Column(name = "rate_count")
	private Integer ratecount;

	public MemberBean() {
	}
	
	public MemberBean(
			byte[] photo,
			String username,
			String teatitle,
			String introcontent,
			Integer ratesum,
			Integer ratecount,
			Date regdate
		) {
		this.username = username;
		this.photo = photo;
		this.regdate = regdate;
		this.teatitle = teatitle;
		this.introcontent = introcontent;
		this.ratesum = ratesum;
		this.ratecount = ratecount;
	}

	public MemberBean(String email, String password, String username, String phonenum, Date birth, byte[] photo,
			Boolean teaqual, Date regdate, String teatitle, Integer subjectid, String introcontent, byte[] introclip,
			Integer ratesum, Integer ratecount) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
		this.phonenum = phonenum;
		this.birth = birth;
		this.photo = photo;
		this.teaqual = teaqual;
		this.regdate = regdate;
		this.teatitle = teatitle;
		this.subjectid = subjectid;
		this.introcontent = introcontent;
		this.introclip = introclip;
		this.ratesum = ratesum;
		this.ratecount = ratecount;
	}

	@Override
	public String toString() {
		return "MemberBean [memid=" + memid + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", phonenum=" + phonenum + ", birth=" + birth + ", photo=" + Arrays.toString(photo) + ", teaqual="
				+ teaqual + ", regdate=" + regdate + ", teatitle=" + teatitle + ", subjectid=" + subjectid
				+ ", introcontent=" + introcontent + ", introclip=" + Arrays.toString(introclip) + ", ratesum="
				+ ratesum + ", ratecount=" + ratecount + "]";
	}

	public Integer getMemid() {
		return memid;
	}

	public void setMemid(Integer memid) {
		this.memid = memid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Boolean getTeaqual() {
		return teaqual;
	}

	public void setTeaqual(Boolean teaqual) {
		this.teaqual = teaqual;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getTeatitle() {
		return teatitle;
	}

	public void setTeatitle(String teatitle) {
		this.teatitle = teatitle;
	}

	public Integer getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

	public String getIntrocontent() {
		return introcontent;
	}

	public void setIntrocontent(String introcontent) {
		this.introcontent = introcontent;
	}

	public byte[] getIntroclip() {
		return introclip;
	}

	public void setIntroclip(byte[] introclip) {
		this.introclip = introclip;
	}

	public Integer getRatesum() {
		return ratesum;
	}

	public void setRatesum(Integer ratesum) {
		this.ratesum = ratesum;
	}

	public Integer getRatecount() {
		return ratecount;
	}

	public void setRatecount(Integer ratecount) {
		this.ratecount = ratecount;
	}

}
