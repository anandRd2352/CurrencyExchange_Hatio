package com.myapp.currency_exchange.controller;
import com.myapp.currency_exchange.model.ConversionRequest;
import com.myapp.currency_exchange.model.ConversionResponse;
import com.myapp.currency_exchange.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @PostMapping("/convert")
    public ResponseEntity<ConversionResponse> convertCurrency(@RequestBody ConversionRequest request) {
        double convertedAmount = exchangeRateService.convertCurrency(request.getFrom(), request.getTo(), request.getAmount());
        ConversionResponse currencyConversionResponse = new ConversionResponse(
                request.getFrom(),
                request.getTo(),
                request.getAmount(),
                convertedAmount
        );
        return new ResponseEntity<>(currencyConversionResponse, HttpStatus.OK);
    }

    @GetMapping("/rates")
    public ResponseEntity<Map<String, Double>> getExchangeRates(@RequestParam(value = "base", defaultValue = "USD") String base) {
        Map<String, Double> rates = exchangeRateService.getCurrencyExchangeRates(base);
        return new ResponseEntity<>(rates,HttpStatus.OK);
    }


}