package by.marketplace.servise;


import by.marketplace.entity.Order;
import by.marketplace.entity.Status;
import by.marketplace.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    public void updateOrderStatus(Status status, Long id) {
        Order existingOrder = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        existingOrder.setStatus(status);
        orderRepository.save(existingOrder);
        log.info("Order " + orderRepository.save(existingOrder) + " updated and saved");
    }
}
