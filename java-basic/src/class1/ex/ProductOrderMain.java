package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] productOrders = {
            new ProductOrder("두부", 2000, 2),
            new ProductOrder("김치", 5000, 1),
            new ProductOrder("콜라", 1500, 2)
        };
        int sum = 0;
        
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            sum += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액: " + sum);
    }
}
