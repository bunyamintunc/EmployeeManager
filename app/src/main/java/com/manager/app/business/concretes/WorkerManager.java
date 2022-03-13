package com.manager.app.business.concretes;

import com.manager.app.business.abstracts.MarketService;
import com.manager.app.business.abstracts.WorkerService;
import com.manager.app.dataAccess.abstracts.WorkerDao;
import com.manager.app.entities.concrete.Market;
import com.manager.app.entities.concrete.Worker;
import com.manager.app.entities.dto.WorkerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerManager implements WorkerService {

    @Autowired
    WorkerDao workerDao;
    @Autowired
    MarketService marketService;

    @Override
    public List<Worker> getAll() {
        return  this.workerDao.findAll();
    }

    @Override
    public Worker workerAdd(WorkerDto workerDto) {

        Worker worker = new Worker();
        worker.setId(workerDto.getId());
        worker.setAge(workerDto.getAge());
        worker.setImgUrl(workerDto.getImgUrl());
        worker.setName(workerDto.getName());
        worker.setSurName(workerDto.getSurName());
        worker.setRole(workerDto.getRole());
        worker.setSalary(workerDto.getSalary());

        Market market = this.marketService.marketFind(workerDto.getMarketId());

        if(market!=null){
            worker.setMarket(market);
        }else {
            System.out.println("market boş");
        }
        return this.workerDao.save(worker);


    }

    @Override
    public void workerDelete(long id) {
         this.workerDao.deleteById(id);
    }

    @Override
    public Worker workerUpdate(WorkerDto workerDto) {
        return null;
    }

    @Override
    public Worker getWorkerById(long workerId) {
        return this.workerDao.findById(workerId).orElse(null);
    }

    @Override
    public List<Worker> getWorkersByMarketId(long marketId) {

        return this.workerDao.getByMarket_MarketId(marketId);
    }
}
