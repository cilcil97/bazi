import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {TeamsListComponent} from "./components/teams-list/teams-list.component";

const routes: Routes = [
  {
    path: '',
    component: TeamsListComponent
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
