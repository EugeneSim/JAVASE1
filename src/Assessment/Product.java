package Assessment;

/**
 * Product
 */
public class Product {

        String name;
        int quantity;
        double price;
        int newQty;

        public Product (String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        double total_value() {
            return quantity*price;
        }

        int update_quantity(int i,boolean update_qty) {
            if (update_qty) {
                newQty+=i;
                return newQty;
            }
            else {
                return quantity;
            }
        }
}