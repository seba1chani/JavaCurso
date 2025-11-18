import { Component, OnInit, signal } from '@angular/core';
import { ProductsComponents } from './components/products.components';
import { Products } from './models/products';
import { FormsComponents } from './components/forms.components';
import Swal from 'sweetalert2';
import { ProductService } from './services/product-service';

@Component({
  selector: 'app-root',
  imports: [ProductsComponents,FormsComponents],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit{

    products: Products[] = [];
    countId=signal(3);
    productSelected: Products= new Products();

    constructor(private service: ProductService){}
    ngOnInit(): void {
      this.service.findAll().subscribe(products=> this.products = products )
     /* this.products= [
         {
          id: 1,
          name: 'Monitor Asus 35 pulgadas',
          price: 1000,
          description: 'El monitor perfecto para juegos de alta resolucion'
        },
        {
          id: 2,
          name: 'Iphone 16 pro',
          price: 1700,
          description: 'El smartphone es exelente e incluye Appe Intelligence!'
        }
      ] */
    }
   addProduct(product :Products ): void{
    if(product.id > 0){

      this.service.update(product).subscribe(productUpdate => {
        this.products= this.products.map(prod => {
          if(prod.id == product.id){
            return{...productUpdate}
          }
          return prod;
        })
        Swal.fire({
          title: "Producto acutalizado",
          text: `"Producto ${productUpdate.name} Actualizado con exito!!"`,
          icon: "success"
        });
      });

    } else{
      this.service.create(product).subscribe(productNew => {
        this.products= [... this.products,{...productNew}]
        //this.countId.update(id => id + 1 );
        Swal.fire({
          title: "Producto Creado!",
          text: `"Producto ${productNew.name} Creado con exito!"`,
          icon: "success"
        });
      });
    }
    
   }

   onUpdateProductEvent(product:Products):void{
    this.productSelected={...product};
   }


   onRemoveProductEvent(id:number):void{
    Swal.fire({
      title: "Seguro que quiere eliminar?",
      text: "Cuidado se eliminara el producto del sistema!",
      icon: "warning",
      showCancelButton: true,
      confirmButtonColor: "#3085d6",
      cancelButtonColor: "#d33",
      confirmButtonText: "Si papi!"
    }).then((result) => {
      if (result.isConfirmed) {
          this.service.remove(id).subscribe(productDeleted=>{
          this.products= this.products.filter(product => product.id!= id);
          Swal.fire({
            title: "Producto Eliminado!",
            text: `"Producto ${productDeleted.name} Eliminado con exito!"`,
            icon: "success"
          });
        });
      }
    });
   
  }

    
    
}
