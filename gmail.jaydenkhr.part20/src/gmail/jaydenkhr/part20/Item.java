package gmail.jaydenkhr.part20;

public class Item {
	private int itemnum;
	private String itempart;
	private String itemname;
	private Integer itemprice;
	
	public int getItemnum() {
		return itemnum;
	}
	public void setItemnum(int itemnum) {
		this.itemnum = itemnum;
	}
	public String getItempart() {
		return itempart;
	}
	public void setItempart(String itempart) {
		this.itempart = itempart;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Integer getItemprice() {
		return itemprice;
	}
	public void setItemprice(Integer itemprice) {
		this.itemprice = itemprice;
	}
	@Override
	public String toString() {
		return "Item [itemnum=" + itemnum + ", itempart=" + itempart + ", itemname=" + itemname + ", itemprice="
				+ itemprice + "]";
	}

	
}
