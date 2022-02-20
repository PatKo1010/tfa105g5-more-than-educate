package web.hashtag.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "hashtag")
public class HashtagBean {
	@Id
	@Column(name = "hashtag_id")
	private int hashtag_id;
	@Column(name = "tea_id")
	private int tea_id;
	
	@Column(name = "hashtag")
	private String hashtag;
	
	public int getHashtag_id() {
		return hashtag_id;
	}



	public void setHashtag_id(int hashtag_id) {
		this.hashtag_id = hashtag_id;
	}



	public int getTea_id() {
		return tea_id;
	}



	public void setTea_id(int tea_id) {
		this.tea_id = tea_id;
	}



	public String getHashtag() {
		return hashtag;
	}



	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}




	

	@Override
	public String toString() {
		return "HashtagBean [hashtag_id=" + hashtag_id + ", tea_id" + tea_id + ", hashtag=" + hashtag + "]";
	}


}
