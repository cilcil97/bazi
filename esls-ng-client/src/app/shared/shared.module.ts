import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DialogModule} from "primeng/dialog";
import {TableModule} from "primeng/table";
import { GenericTableComponent } from './components/generic-table/generic-table.component';

@NgModule({
  declarations: [GenericTableComponent],
  imports: [
    CommonModule,
    DialogModule,
    TableModule
  ]
})
export class SharedModule {
}
