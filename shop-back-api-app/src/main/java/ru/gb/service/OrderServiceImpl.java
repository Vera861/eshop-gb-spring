package ru.gb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.service.dto.LineItem;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final CartService cartService;

    @Autowired
    public OrderServiceImpl(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void create() {
        List<LineItem> lineItems = cartService.getLineItems();
    }

    @Override
    public void findAll() {

    }
}
