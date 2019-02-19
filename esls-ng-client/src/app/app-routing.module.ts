import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MatchModule} from "./match/match.module";
import {AppComponent} from "./app.component";
import {PlayersModule} from "./players/players.module";
import {TeamsModule} from "./teams/teams.module";

const routes: Routes = [
  {
    path: 'match',
    loadChildren: () => MatchModule
  },
  {
    path: 'players',
    loadChildren: () => PlayersModule
  },
  {
    path: 'teams',
    loadChildren: () => TeamsModule
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
