package com.example.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Controller {

    @Autowired
    Environment env;

    @Autowired
    CurrencyExchangeRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieve(@PathVariable String from, @PathVariable String to) {
        String envHost = env.getProperty("local.server.port");
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
        if(currencyExchange==null) {
            return new CurrencyExchange();
        }
        currencyExchange.setEnvironment(envHost);
        return currencyExchange;
    }
}
