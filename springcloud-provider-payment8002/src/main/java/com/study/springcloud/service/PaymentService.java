package com.study.springcloud.service;

import com.study.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
