package karadag.oguzkaan.dto;

import karadag.oguzkaan.entity.Order;
import karadag.oguzkaan.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
