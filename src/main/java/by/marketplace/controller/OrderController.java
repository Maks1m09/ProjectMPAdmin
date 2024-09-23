package by.marketplace.controller;


import by.marketplace.entity.Order;

import by.marketplace.servise.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/order")
    public String order(Model model) {
        List<Order> orders = orderService.findAllOrder();
        model.addAttribute("orders", orders);
        return "order";
    }

    @PostMapping ("/order")
    public String updateOrder(@PathVariable(value = "id") Long id, Order order, Model model) {
        orderService.updateOrder(id, order);
        model.addAttribute("order", order);
        return "order";
    }
}

