import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TeamsComponent } from './components/teams/teams.component';
import { TeamsMasterDetailsComponent } from './components/teams-master-details/teams-master-details.component';
import { TeamsListComponent } from './components/teams-list/teams-list.component';
import {TeamsRoutingModule} from "./teams-routing.module";

@NgModule({
  declarations: [TeamsComponent, TeamsMasterDetailsComponent, TeamsListComponent],
  imports: [
    CommonModule,
    TeamsRoutingModule
  ]
})
export class TeamsModule { }
