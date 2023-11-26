package com.brunobsantos.desafio.services;

import com.brunobsantos.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getBasic() >= 200.0)
            return 0;
        if (order.getBasic() >= 100.0)
            return 12.0;
        return 20.0;
    }
}
