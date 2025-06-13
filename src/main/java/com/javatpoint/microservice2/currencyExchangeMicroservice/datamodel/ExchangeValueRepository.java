package com.javatpoint.microservice2.currencyExchangeMicroservice.datamodel;

import com.javatpoint.microservice2.currencyExchangeMicroservice.VO.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
     ExchangeValue findByFromAndTo(String from, String to);
}
