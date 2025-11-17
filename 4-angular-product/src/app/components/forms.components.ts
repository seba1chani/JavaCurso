import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Products } from '../models/products';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'product-form',
  imports: [FormsModule],
  templateUrl: './forms.components.html'
})
export class FormsComponents {

  @Input() public product: Products={
    id:0,
    name:'',
    description:'',
    price: 0
  };

  @Output() addProductEvent= new EventEmitter();

  onSubmit():void{
    console.log(this.product);
    this.addProductEvent.emit(this.product);
    this.clean();
  }

  clean():void{
    this.product={
      id:0,
      name:'',
      description:'',
      price: 0
    };
  }
}
