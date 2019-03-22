package Com.Folder.Spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SatsangRegisterDTO implements Serializable {
	@Column(name = "id")
	private int id;
	@Column(name = "date")
	private String date;
	@Column(name = "sk")
	private String sk;
	@Column(name = "pathi")
	private String pathi;
	@Column(name = "shabad")
	private String shabad;
	@Column(name = "saint")
	private String saint;
	@Column(name = "book")
	private String book;
	@Column(name = "gents")
	private String gents;
	@Column(name = "ladies")
	private String ladies;
	@Column(name = "children")
	private String children;
	@Column(name = "p_total")
	private String p_total;
	@Column(name = "fourw")
	private String fourw;
	@Column(name = "twow")
	private String twow;
	@Column(name = "w_total")
	private String w_total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSk() {
		return sk;
	}

	public void setSk(String sk) {
		this.sk = sk;
	}

	public String getPathi() {
		return pathi;
	}

	public void setPathi(String pathi) {
		this.pathi = pathi;
	}

	public String getShabad() {
		return shabad;
	}

	public void setShabad(String shabad) {
		this.shabad = shabad;
	}

	public String getSaint() {
		return saint;
	}

	public void setSaint(String saint) {
		this.saint = saint;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getGents() {
		return gents;
	}

	public void setGents(String gents) {
		this.gents = gents;
	}

	public String getLadies() {
		return ladies;
	}

	public void setLadies(String ladies) {
		this.ladies = ladies;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getP_total() {
		return p_total;
	}

	public void setP_total(String p_total) {
		this.p_total = p_total;
	}

	public String getFourw() {
		return fourw;
	}

	public void setFourw(String fourw) {
		this.fourw = fourw;
	}

	public String getTwow() {
		return twow;
	}

	public void setTwow(String twow) {
		this.twow = twow;
	}

	public String getW_total() {
		return w_total;
	}

	public void setW_total(String w_total) {
		this.w_total = w_total;
	}

	@Override
	public String toString() {
		return "SatsangRegisterDTO [id=" + id + ", date=" + date + ", sk=" + sk + ", pathi=" + pathi + ", shabad="
				+ shabad + ", saint=" + saint + ", book=" + book + ", gents=" + gents + ", ladies=" + ladies
				+ ", children=" + children + ", p_total=" + p_total + ", fourw=" + fourw + ", twow=" + twow
				+ ", w_total=" + w_total + "]";
	}

}
