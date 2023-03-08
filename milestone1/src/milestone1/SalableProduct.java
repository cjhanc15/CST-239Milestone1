package milestone1;

public class SalableProduct {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public SalableProduct(String name, String description, double price, int quantity) {
        this.name = name;
        this.setDescription(description);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public String getName() {
       return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
