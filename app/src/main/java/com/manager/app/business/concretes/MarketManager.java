package com.manager.app.business.concretes;

import com.manager.app.business.abstracts.MarketService;
import com.manager.app.dataAccess.abstracts.MarketDao;
import com.manager.app.entities.concrete.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarketManager implements MarketService {

    @Autowired
    MarketDao marketDao;

    @Override
    public Market marketAdd(Market market) {
        return  this.marketDao.save(market);
    }

    @Override
    public List<Market> getAll() {
        return this.marketDao.findAll();
    }

    @Override
    public Market marketFind(long marketId) {
        return this.marketDao.findById(marketId).orElse(null);
    }


}
