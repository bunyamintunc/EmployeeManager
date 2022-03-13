package com.manager.app.controllers;

import com.manager.app.business.abstracts.MarketService;
import com.manager.app.entities.concrete.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketsController {

    @Autowired
    MarketService marketService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getall")
    public List<Market> getAllMarkets(){
        return  this.marketService.getAll();
    }

    @PostMapping
    public Market addMarket(@RequestBody Market market){
        return this.marketService.marketAdd(market);
    }


}
