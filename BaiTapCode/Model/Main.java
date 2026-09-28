public class Main {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();

        // Tạo các sản phẩm điện tử
        ElectronicProduct laptop = new ElectronicProduct("EP01", "Laptop Dell XPS", 2000.0, 24);
        ElectronicProduct phone = new ElectronicProduct("EP02", "iPhone 15 Pro", 1200.0, 12);

        // Áp dụng giảm giá 10% cho Laptop
        laptop.applyDiscount(10); // Giá giảm từ 2000 -> 1800

        // Thêm vào kho
        inventory.addProduct(laptop);
        inventory.addProduct(phone);

        // Kiểm tra tính tổng giá trị kho (Đã cộng 10% VAT)
        System.out.println("Tổng giá trị kho hàng: $" + inventory.calculateTotalValue());

        // Tìm kiếm sản phẩm
        System.out.println("\nSản phẩm tìm thấy với từ khóa 'Dell':");
        for (Product p : inventory.searchByName("Dell")) {
            System.out.println("- " + p.getName() + " | Giá sau thuế: $" + p.calculateFinalPrice());
        }
    }
}