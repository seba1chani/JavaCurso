import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AltaProductos } from './alta-productos';

describe('AltaProductos', () => {
  let component: AltaProductos;
  let fixture: ComponentFixture<AltaProductos>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AltaProductos]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AltaProductos);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
