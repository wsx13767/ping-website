package com.ping.formBean;

public class OrderFormBean {
	private String title;
	private int maxCount;
	private String itemName;
	private String itemInfo;
	private String kind;
	private String suger;
	private String size;
	private String ice;
	private int money;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
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
	public String getIce() {
		return ice;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "OrderFormBean [title=" + title + ", maxCount=" + maxCount + ", itemName=" + itemName + ", itemInfo="
				+ itemInfo + ", kind=" + kind + ", suger=" + suger + ", size=" + size + ", ice=" + ice + ", money="
				+ money + "]";
	}
	
}
