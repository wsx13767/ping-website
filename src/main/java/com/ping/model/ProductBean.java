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
	@Column(name="ORDER_ID")
	private int orderId;
	@Column(name="KIND")
	private String kind;
	@Column(name="MONEY")
	private int money;
	@Column(name="ICE")
	private String ice;
	@Column(name="SUGER")
	private String suger;
	@Column(name="PRODUCT_SIZE")
	private String size;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getIce() {
		return ice;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	public String getSuger() {
		return suger;
	}
	public void setSuger(String suger) {
		this.suger = suger;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
