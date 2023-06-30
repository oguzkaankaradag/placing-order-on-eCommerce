package karadag.oguzkaan.service;

import karadag.oguzkaan.dto.OrderResponse;
import karadag.oguzkaan.dto.OrderRequest;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
