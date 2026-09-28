public class ElectronicProduct extends Product implements Discountable {
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    // Ghi đè phương thức tính giá cuối cùng (đã tính thuế VAT 10%)[cite: 2]
    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.10;
    }

    // Triển khai phương thức giảm giá trực tiếp vào price[cite: 2]
    @Override
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double newPrice = getPrice() * (1 - percent / 100.0);
            setPrice(newPrice);
        }
    }
}