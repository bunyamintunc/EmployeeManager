import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

import { WorkerService } from '../services/worker.service';

declare var  window : any;

@Component({
  selector: 'app-worker',
  templateUrl: './worker.component.html',
  styleUrls: ['./worker.component.css']
})
export class WorkerComponent implements OnInit {
  
  constructor(private workerService:WorkerService,private activadeRoute :ActivatedRoute) { }

  public workers : any = [];
  formModal :any;

  ngOnInit(): void {
    this.formModal = new window.bootstrap.Modal(
      document.getElementById("exampleModal")
    )
    this.catchWorkers()
 
  }

  catchWorkers(){
    this.activadeRoute.params.subscribe(params =>{
      this.workerService.getWorkerByMarketId(params['marketId']).subscribe(response=>{
        this.workers = response
      })
    })

  }

  getAllWorkers(){
    this.workerService.getAllWorkers().subscribe(response=>{
      this.workers= response
    })
  }

  addWorker(addForm:NgForm):void{
    this.workerService.addWorker(addForm.value).subscribe((response:Worker)=>{
      addForm.reset()
      console.log(response)
      this.getAllWorkers()
    })
    document.getElementById('add-worker-form')?.click();
  }

  openModal(){
    this.formModal.show();
  }

  doSomething(){
    this.formModal.hide();
  }

 


}
