import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { MarketComponent } from './market/market.component';
import { WorkerComponent } from './worker/worker.component';

const routes: Routes = [
  
  {path:'',component:MarketComponent},
  {path:'market/:marketId',component:WorkerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
