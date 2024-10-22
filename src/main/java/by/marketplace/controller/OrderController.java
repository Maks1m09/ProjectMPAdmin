package by.marketplace.controller;

import by.marketplace.entity.Order;
import by.marketplace.entity.Status;
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

    @RequestMapping(value = "/order/update/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    public String updateOrderStatus(@PathVariable("id") Long id, @RequestParam("statusValue") Status status) {
        orderService.updateOrderStatus(status, id);
        return "redirect:/order";
    }

}

