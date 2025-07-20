package br.com.alura.ecommerce;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private final String orderId;
    private final BigDecimal amount;
    private final String email;
}
