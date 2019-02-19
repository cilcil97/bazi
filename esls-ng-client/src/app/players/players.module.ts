import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {PlayersMasterDetailComponent} from "./components/players-master-detail/players-master-detail.component";
import {PlayersListComponent} from "./components/players-list/players-list.component";
import {PlayersComponent} from "./components/players/players.component";
import {PlayersRoutingModule} from "./players-routing.module";

@NgModule({
  declarations: [PlayersMasterDetailComponent, PlayersListComponent, PlayersComponent],
  imports: [
    CommonModule,
    PlayersRoutingModule
  ]
})
export class PlayersModule { }
