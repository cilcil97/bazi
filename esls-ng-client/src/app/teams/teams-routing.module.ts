import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {TeamsListComponent} from "./components/teams-list/teams-list.component";
import {TeamsMasterDetailsComponent} from "./components/teams-master-details/teams-master-details.component";
import {TeamsComponent} from "./components/teams/teams.component";

const routes: Routes = [
  {
    path: '',
    component: TeamsListComponent
  },
  {
    path: 'details/:id',
    component: TeamsMasterDetailsComponent
  }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class TeamsRoutingModule {
}
