
class ClothingProduct extends Product {
    String size;

    public ClothingProduct(String productName, String size,  double price) {
        super(productName, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

 
    @Override
    double calculateTotalPrice() {
        return price;
    }
}
