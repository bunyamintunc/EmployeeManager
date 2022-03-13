package com.manager.app.dataAccess.abstracts;

import com.manager.app.entities.concrete.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketDao extends JpaRepository<Market,Long> {
}
