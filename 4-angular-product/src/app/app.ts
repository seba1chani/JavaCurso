import { Component, OnInit, signal } from '@angular/core';
import { ProductsComponents } from './components/products.components';
import { Products } from './models/products';
import { FormsComponents } from './components/forms.components';
import Swal from 'sweetalert2';
import { Router, RouterOutlet } from '@angular/router';
import { AltaProductos } from './components/productos/alta/alta-productos/alta-productos';
@Component({
  selector: 'app-root',
  imports: [ProductsComponents, FormsComponents, RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})

export class App implements OnInit{

  constructor(private router:Router){
    
  }

    products: Products[] = [];
    countId=signal(3);
    productSelected: Products={id:0,name:'',description:'',price:0 };


    ngOnInit(): void {
      this.products= [
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
      ]
    }
   addProduct(product :Products ): void{
    if(product.id > 0){
      this.products= this.products.map(prod => {
        if(prod.id == product.id){
          return{...product}
        }
        return prod;
      })
      Swal.fire({
        title: "Producto acutalizado",
        text: "Producto Actualizado con exito!!",
        icon: "success"
      });
    } else{
      this.products= [... this.products,{...product,id: this.countId()}]
      this.countId.update(id => id + 1 );
      Swal.fire({
        title: "Producto Creado!",
        text: "Producto Creado con exito!",
        icon: "success"
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
        this.products= this.products.filter(product => product.id!= id);
        Swal.fire({
          title: "Producto Eliminado!",
          text: "Producto Eliminado con exito!",
          icon: "success"
        });
      }
    });
   
  }

  navegarAHome():void {
    this.router.navigate(['/alta-productos']);
  }
    
}
