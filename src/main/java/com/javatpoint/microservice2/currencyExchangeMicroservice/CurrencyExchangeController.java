package com.javatpoint.microservice2.currencyExchangeMicroservice;

import com.javatpoint.microservice2.currencyExchangeMicroservice.VO.ExchangeValue;
import com.javatpoint.microservice2.currencyExchangeMicroservice.datamodel.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeController {

    @Autowired
    ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from,@PathVariable String to) {
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        return exchangeValue;

    }
}
