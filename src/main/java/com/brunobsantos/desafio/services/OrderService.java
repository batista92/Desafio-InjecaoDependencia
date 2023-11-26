package com.brunobsantos.desafio.services;

import com.brunobsantos.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    public double total(Order order) {
        double discount = order.getDiscount() / 100 * order.getBasic();
        return order.getBasic() - discount + shippingService.shipment(order);
    }
}
