import { Component, EventEmitter, Input, Output, output } from '@angular/core';
import { Products } from '../models/products';

@Component({
  selector: 'table-product',
  imports: [],
  templateUrl: './products.components.html',
})
export class ProductsComponents {
 
  @Input() products: Products[] = []
  title= 'Listado de productos'

   @Output() updateProductEvent= new EventEmitter();
   @Output() removeProductEvent= new EventEmitter();

  onUpdateProduct(product:Products):void{

    this.updateProductEvent.emit(product);
  }

  onRemoveProduct(id:number):void{

    this.removeProductEvent.emit(id);
  }
}
