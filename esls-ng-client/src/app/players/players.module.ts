import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {PlayersMasterDetailComponent} from "./components/players-master-detail/players-master-detail.component";
import {PlayersListComponent} from "./components/players-list/players-list.component";
import {PlayersRoutingModule} from "./players-routing.module";
import {HttpClientModule} from "@angular/common/http";
import {TableModule} from "primeng/table";
import {DialogModule} from "primeng/dialog";
import {ButtonModule} from "primeng/button";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [PlayersMasterDetailComponent, PlayersListComponent],
  imports: [
    CommonModule,
    PlayersRoutingModule,
    HttpClientModule,
    TableModule,
    DialogModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class PlayersModule {
}
