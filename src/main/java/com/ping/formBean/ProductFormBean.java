package com.ping.formBean;

public class ProductFormBean {
	@Override
	public String toString() {
		return "ProductFormBean [title=" + title + ", count=" + count + ", itemName=" + itemName + ", itemInfo="
				+ itemInfo + ", kind=" + kind + ", detail=" + detail + ", money=" + money + ", img=" + img + "]";
	}
	private String title;
	private int count;
	private String itemName;
	private String itemInfo;
	private String kind;
	private String detail;
	private int money;
	private String img;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	
}
