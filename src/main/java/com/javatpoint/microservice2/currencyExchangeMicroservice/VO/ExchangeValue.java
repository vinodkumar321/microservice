package com.javatpoint.microservice2.currencyExchangeMicroservice.VO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="exchange_value")
public class ExchangeValue {
     @Id
     @Column(name="id")
     private Long id;

     @Column(name="currency_from")
     private String from;

     @Column(name="currency_to")
     private String to;

     @Column(name="conversion_multiple")
     private BigDecimal conversionMultiple;

     @Column(name="port")
     private Integer port;


    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
