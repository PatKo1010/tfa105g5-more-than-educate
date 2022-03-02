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
	private int hashtagid;
	@Column(name = "tea_id")
	private int teaid;
	
	@Column(name = "hashtag")
	private String hashtag;
	
	public int getHashtag_id() {
		return hashtagid;
	}



	public void setHashtag_id(int hashtagid) {
		this.hashtagid = hashtagid;
	}



	public int getTeaid() {
		return teaid;
	}



	public void setTeaid(int teaid) {
		this.teaid = teaid;
	}



	public String getHashtag() {
		return hashtag;
	}



	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}




	

	@Override
	public String toString() {
		return "HashtagBean [hashtagid=" + hashtagid + ", teaid" + teaid + ", hashtag=" + hashtag + "]";
	}


}
