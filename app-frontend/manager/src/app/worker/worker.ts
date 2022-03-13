import { Market } from "../market/market"


export interface Worker{

    id : number
    name : string
    surName : string
    role : string
    age : number
    salary : number
    imgUrl : string
    market : Market
    

}