import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {TeamsMasterDetailsComponent} from './components/teams-master-details/teams-master-details.component';
import {TeamsListComponent} from './components/teams-list/teams-list.component';
import {TeamsRoutingModule} from "./teams-routing.module";
import {HttpClientModule} from "@angular/common/http";
import {TableModule} from "primeng/table";
import {DialogModule} from "primeng/dialog";
import {ButtonModule} from "primeng/button";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {LigaService} from "../league/services/liga.service";
import {TeamService} from "./services/team.service";
import {DropdownModule} from "primeng/primeng";
import {NgbDropdownModule} from "@ng-bootstrap/ng-bootstrap";

@NgModule({
  declarations: [TeamsMasterDetailsComponent, TeamsListComponent],
  imports: [
    CommonModule,
    TeamsRoutingModule,
    HttpClientModule,
    TableModule,
    DropdownModule,
    DialogModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    NgbDropdownModule
  ],
  providers: [LigaService, TeamService]
})
export class TeamsModule {
}
