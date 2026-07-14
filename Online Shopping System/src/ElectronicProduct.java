
class ElectronicProduct extends Product {
    int warrantyPeriod;
    public ElectronicProduct(String productName,int warrantyPeriod,  double price) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    @Override
    double calculateTotalPrice() {
        return price + (0.05 * price);
    }
}
