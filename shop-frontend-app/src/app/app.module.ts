import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductGalleryPageComponent } from './page/product-gallery-page/product-gallery-page.component';
import { ProductInfoPageComponent } from './page/product-info-page/product-info-page.component';
import { NavBarComponent } from './component/nav-bar/nav-bar.component';
import { ProductFilterComponent } from './component/product-filter/product-filter.component';
import { FooterComponent } from './component/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductGalleryPageComponent,
    ProductInfoPageComponent,
    NavBarComponent,
    ProductFilterComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
