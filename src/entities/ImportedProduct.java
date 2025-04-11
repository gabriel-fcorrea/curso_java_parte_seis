package entities;

public final class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public final String priceTag() {
		return super.getName() + " R$ " + totalPrice(customsFee) + "(Customs fee: R$ " + customsFee + ")";
	}

	public final double totalPrice(double totalPrice) {
		return totalPrice = (price + customsFee);
	}
}
