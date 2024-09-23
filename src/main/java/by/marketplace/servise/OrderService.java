package by.marketplace.servise;


import by.marketplace.entity.Order;
import by.marketplace.entity.Product;
import by.marketplace.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;


    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    public void updateOrder(Long id, Order order) {
        Order existingProduct = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        existingProduct.setStatus(order.getStatus());
        orderRepository.save(existingProduct);
        log.info("Order " + order.getNumber() + " updated and saved");
    }
}
