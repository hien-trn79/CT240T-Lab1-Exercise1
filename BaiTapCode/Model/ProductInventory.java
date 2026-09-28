import java.util.ArrayList;
import java.util.List;

public class ProductInventory {
    private List<Product> products;

    public ProductInventory() {
        this.products = new ArrayList<>();
    }

    // Thêm sản phẩm vào kho
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    // Xóa sản phẩm theo id
    public boolean removeProduct(String id) {
        return products.removeIf(product -> product.getId().equalsIgnoreCase(id));
    }

    // Tìm kiếm danh sách sản phẩm theo tên (chứa từ khóa, không phân biệt hoa thường)
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        if (name == null || name.isEmpty()) {
            return result;
        }
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    // Tính tổng giá trị kho hàng dựa trên giá cuối cùng (Final Price) của từng sản phẩm
    public double calculateTotalValue() {
        double total = 0;
        for (Product product : products) {
            total += product.calculateFinalPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }
}