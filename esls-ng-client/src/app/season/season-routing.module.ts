import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {SeasonComponent} from "./components/season/season.component";
import {AppendToLeagueComponent} from "./components/append-to-league/append-to-league.component";

const routes: Routes = [
  {
    path: '',
    component: SeasonComponent
  },
  {
    path: 'append',
    component: AppendToLeagueComponent
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
export class SeasonRoutingModule {
}
