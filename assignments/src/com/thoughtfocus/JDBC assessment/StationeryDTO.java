package assessment;

public class StationeryDTO {
	private String Name;
	private String Type;
	private String BrandName;
	private double Price;
	private String Quantity;
	private long SerialNumber;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public long getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		SerialNumber = serialNumber;
	}
	
	@Override
	public String toString() {
		return "StationeryDTO [Name=" + Name + ", Type=" + Type + ", BrandName=" + BrandName + ", Price=" + Price
				+ ", Quantity=" + Quantity + ", SerialNumber=" + SerialNumber + "]";
	}
	
	
	
	

}
