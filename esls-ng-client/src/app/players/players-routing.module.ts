import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {PlayersListComponent} from "./components/players-list/players-list.component";
import {PlayersMasterDetailComponent} from "./components/players-master-detail/players-master-detail.component";

const routes: Routes = [
  {
    path: '',
    component: PlayersListComponent
  },
  {
    path: 'details/:id',
    component: PlayersMasterDetailComponent
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
export class PlayersRoutingModule {
}
