package web.member.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SearchTeacherBO {

	@Id
	@Column(name = "memId")
	private Integer memId;
	@Column(name = "subjectId")
	private Integer subjectId;
	@Column(name = "subjectIcon")
	private byte[] subjectIcon;
	@Column(name = "username")
	private String username;
	@Column(name = "teacherTitle")
	private String teacherTitle;
	@Column(name = "teacherContent")
	private String teacherContent;
	@Column(name = "teacherPhoto")
	private byte[] teacherPhoto;

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public byte[] getSubjectIcon() {
		return subjectIcon;
	}

	public void setSubjectIcon(byte[] subjectIcon) {
		this.subjectIcon = subjectIcon;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTeacherTitle() {
		return teacherTitle;
	}

	public void setTeacherTitle(String teacherTitle) {
		this.teacherTitle = teacherTitle;
	}

	public String getTeacherContent() {
		return teacherContent;
	}

	public void setTeacherContent(String teacherContent) {
		this.teacherContent = teacherContent;
	}

	public byte[] getTeacherPhoto() {
		return teacherPhoto;
	}

	public void setTeacherPhoto(byte[] teacherPhoto) {
		this.teacherPhoto = teacherPhoto;
	}

	@Override
	public String toString() {
		return "SearchTeacherBO [memId=" + memId + ", subjectId=" + subjectId + ", subjectIcon="
				+ Arrays.toString(subjectIcon) + ", username=" + username + ", teacherTitle=" + teacherTitle
				+ ", teacherContent=" + teacherContent + ", teacherPhoto=" + Arrays.toString(teacherPhoto) + "]";
	}

}
