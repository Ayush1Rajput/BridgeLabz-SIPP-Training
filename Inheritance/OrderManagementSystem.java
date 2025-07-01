import java.util.Date;

// Superclass
class Order {
    String orderId;
    Date orderDate;

    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void displayOrderStatus() {
        System.out.println("<------> Order Status <------>");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: Order Placed");
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, Date orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void displayOrderStatus() {
        super.displayOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: Order Shipped");
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;

    public DeliveredOrder(String orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void displayOrderStatus() {
        super.displayOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: Order Delivered");
    }
}

// Main class
public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD001", new Date());
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", new Date(), "TRACK123");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", new Date(), "TRACK456", new Date());

        order.displayOrderStatus();
        System.out.println();
        shippedOrder.displayOrderStatus();
        System.out.println();
        deliveredOrder.displayOrderStatus();
    }
}