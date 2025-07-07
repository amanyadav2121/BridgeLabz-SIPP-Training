

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped with Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on: " + deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {

        Order order = new Order("ORD001", "2025-07-01");
        System.out.println(order.getOrderStatus());

        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-07-01", "TRK12345");
        System.out.println(shipped.getOrderStatus());

        DeliveredOrder delivered = new DeliveredOrder("ORD003", "2025-07-01", "TRK98765", "2025-07-03");
        System.out.println(delivered.getOrderStatus());
    }
}
