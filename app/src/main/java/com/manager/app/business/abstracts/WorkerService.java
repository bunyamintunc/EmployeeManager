package com.manager.app.business.abstracts;

import com.manager.app.entities.concrete.Worker;
import com.manager.app.entities.dto.WorkerDto;
import org.hibernate.jdbc.Work;

import java.util.List;

public interface WorkerService {
    public List<Worker> getAll();
    public Worker workerAdd(WorkerDto workerDto);
    public void workerDelete(long id);
    public Worker workerUpdate(WorkerDto workerDto);

    public Worker getWorkerById(long workerId);

    public List<Worker> getWorkersByMarketId(long marketId);
}
