package web.favor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "favor_tea")
public class FavorBean {
	@Id
	@Column(name = "favor_id")
	private int favor_id;
	@Column(name = "stu_id")
	private int stu_id;
	@Column(name = "tea_id")
	private int tea_id;

	public int getTea_id() {
		return tea_id;
	}

	public void setTea_id(int tea_id) {
		this.tea_id = tea_id;
	}

	public int getFavor_id() {
		return favor_id;
	}

	public void setFavor_id(int favor_id) {
		this.favor_id = favor_id;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	@Override
	public String toString() {
		return "FavorBean [favor_id=" + favor_id + ", stu_id" + stu_id + ", tea_id=" + tea_id + "]";
	}

}
