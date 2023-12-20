package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (isMaxValid()) {
            items[itemCount] = item;
            itemCount++;
            return;
        }

        System.out.println("장바구니가 가득 찼습니다.");
    }

    public void displayItems() {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("총 금액: " + calculateTotalPrice());
    }

    private boolean isMaxValid() {
        return itemCount < 10;
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
