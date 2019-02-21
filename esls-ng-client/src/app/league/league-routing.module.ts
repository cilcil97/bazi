import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {LigaComponent} from "./components/liga/liga.component";

const routes: Routes = [
  {
    path: '',
    component: LigaComponent
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
export class LeagueRoutingModule {
}
