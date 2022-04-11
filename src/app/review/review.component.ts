import { Component, OnInit } from '@angular/core';
import { ReviewServiceService } from '../service/review-service.service';
@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  constructor(private service:ReviewServiceService) { }

  ngOnInit(): void {
  }

  onSubmit(data:any):void{
    this.service.doRegistration(data).subscribe((responseData: any)=>{
        console.log(responseData);
    });
  }
}
