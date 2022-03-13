package com.manager.app.dataAccess.abstracts;

import com.manager.app.entities.concrete.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerDao extends JpaRepository<Worker,Long> {
    List<Worker> getByMarket_MarketId(long marketId);
}
