package web.chat.entity;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

public class MemberVO implements java.io.Serializable {

	private Integer mem_id;
	private String email;
	private String password;
	private String username;
	private String phone_num;
	private Date birth;
	private byte[] photo;
	private Integer tea_qual;
	private Date reg_date;
	private String tea_title;
	private Integer subject_id;
	private String intro_content;
	private byte[] intro_clip;
	private Integer rate_sum;
	private Integer rate_count;

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
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

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
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

	public Integer getTea_qual() {
		return tea_qual;
	}

	public void setTea_qual(Integer tea_qual) {
		this.tea_qual = tea_qual;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getTea_title() {
		return tea_title;
	}

	public void setTea_title(String tea_title) {
		this.tea_title = tea_title;
	}

	public Integer getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}

	public String getIntro_content() {
		return intro_content;
	}

	public void setIntro_content(String intro_content) {
		this.intro_content = intro_content;
	}

	public byte[] getIntro_clip() {
		return intro_clip;
	}

	public void setIntro_clip(byte[] intro_clip) {
		this.intro_clip = intro_clip;
	}

	public Integer getRate_sum() {
		return rate_sum;
	}

	public void setRate_sum(Integer rate_sum) {
		this.rate_sum = rate_sum;
	}

	public Integer getRate_count() {
		return rate_count;
	}

	public void setRate_count(Integer rate_count) {
		this.rate_count = rate_count;
	}

}
