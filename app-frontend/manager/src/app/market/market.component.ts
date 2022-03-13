import { Component, OnInit } from '@angular/core';

import { MarketService } from '../services/market.service';
import { Market } from './market';

@Component({
  selector: 'app-market',
  templateUrl: './market.component.html',
  styleUrls: ['./market.component.css']
})
export class MarketComponent implements OnInit {

  constructor(private marketService : MarketService) { }

  ngOnInit(): void {
    this.getMarkets()
  }
  
  markets : Market[] = []
  
  getMarkets(): void {
      this.marketService.getAllMarket().subscribe(response=>{
        this.markets=response
      })
  }



}
