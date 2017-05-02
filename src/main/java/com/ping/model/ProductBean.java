package com.ping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class ProductBean {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="KIND")
	private String kind;
	@Column(name="DETAIL")
	private String detail;
	@Column(name="MONEY")
	private int money;
	@Column(name="INFO")
	private String info;
	@Column(name="NAME")
	private String name;
	@Column(name="COUNT")
	private int count;
	@Column(name="IMG")
	private String img;
	@Column(name="STATUS")
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", kind=" + kind + ", detail=" + detail + ", money=" + money + ", info=" + info
				+ ", name=" + name + ", count=" + count + ", img=" + img + ", status=" + status + ", title=" + title
				+ "]";
	}
	@Column(name="TITLE")
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
