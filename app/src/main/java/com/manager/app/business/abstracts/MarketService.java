package com.manager.app.business.abstracts;

import com.manager.app.entities.concrete.Market;

import java.util.List;
import java.util.Optional;

public interface MarketService {

     public Market marketAdd(Market market);
     public List<Market> getAll();
     public Market marketFind(long marketId);
}
