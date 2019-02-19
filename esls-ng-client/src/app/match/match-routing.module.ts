import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {MatchListComponent} from "./components/match-list/match-list.component";
import {MatchMasterDetailsComponent} from "./components/match-master-details/match-master-details.component";
import {FinalMatchComponent} from "./components/final-match/final-match.component";

const routes: Routes = [
  {
    path: '',
    component: MatchListComponent
  },
  {
    path: 'details/:id',
    component: MatchMasterDetailsComponent
  },
  {
    path: 'final',
    component: FinalMatchComponent
  }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class MatchRoutingModule {
}
