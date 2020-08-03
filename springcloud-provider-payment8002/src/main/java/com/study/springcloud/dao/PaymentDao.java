package com.study.springcloud.dao;

import com.study.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
