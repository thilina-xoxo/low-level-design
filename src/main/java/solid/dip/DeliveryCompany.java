package solid.dip;

public class DeliveryCompany {

    private DeliveryService deliveryService;

    public DeliveryCompany(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendProduct (Product product) {
        deliveryService.deliverProduct(product);
    }
}
