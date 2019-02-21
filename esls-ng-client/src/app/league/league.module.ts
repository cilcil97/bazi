import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {LigaComponent} from './components/liga/liga.component';
import {LigaDialogComponent} from './components/liga-dialog/liga-dialog.component';
import {TableModule} from "primeng/table";
import {HttpClientModule} from "@angular/common/http";
import {DialogModule} from "primeng/dialog";
import {ButtonModule} from "primeng/button";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {LeagueRoutingModule} from "./league-routing.module";
import {LigaService} from "./services/liga.service";

@NgModule({
  declarations: [LigaComponent, LigaDialogComponent],
  imports: [
    CommonModule,
    LeagueRoutingModule,
    HttpClientModule,
    TableModule,
    DialogModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [LigaService]
})
export class LeagueModule {
}
