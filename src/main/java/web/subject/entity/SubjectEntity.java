package web.subject.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class SubjectEntity {

	@Id
	@Column(name = "subject_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectId;

	@Column(name = "subject_name")
	private String subjectName;

	@Column(name = "subject_icon", columnDefinition = "LONGBLOB")
	private byte[] subjectIcon;

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public byte[] getSubjectIcon() {
		return subjectIcon;
	}

	public void setSubjectIcon(byte[] subjectIcon) {
		this.subjectIcon = subjectIcon;
	}

	@Override
	public String toString() {
		return "SubjectEntity [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectIcon="
				+ Arrays.toString(subjectIcon) + "]";
	}

}
