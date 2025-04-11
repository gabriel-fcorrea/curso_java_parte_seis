package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {

	private Date manufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public final String priceTag() {
		return super.getName() + " (used) R$ " + price + " (Manufacture Date:" + sdf.format(manufactureDate) + ")";
	}

}
