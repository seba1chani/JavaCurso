import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Products } from '../models/products';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'product-form',
  imports: [FormsModule],
  templateUrl: './forms.components.html'
})
export class FormsComponents {

  @Input() public product: Products= new Products();

  @Output() addProductEvent= new EventEmitter();

  onSubmit(productForm: NgForm):void{
    if(productForm.valid){
      console.log(this.product);
      this.addProductEvent.emit(this.product);
      this.clean();
      productForm.reset();
      productForm.resetForm();
    }
    
  }

  clean():void{
    this.product= new Products();
  }
}
