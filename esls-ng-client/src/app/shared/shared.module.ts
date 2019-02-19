import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DialogComponent } from './components/dialog/dialog.component';
import {DialogModule} from "primeng/dialog";
import {TableModule} from "primeng/table";

@NgModule({
  declarations: [DialogComponent],
  imports: [
    CommonModule,
    DialogModule,
    TableModule
  ]
})
export class SharedModule { }
