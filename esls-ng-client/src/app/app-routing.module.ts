import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MatchModule} from "./match/match.module";
import {PlayersModule} from "./players/players.module";
import {TeamsModule} from "./teams/teams.module";
import {LeagueModule} from "./league/league.module";
import {SeasonModule} from "./season/season.module";

const routes: Routes = [
  {
    path: 'matches',
    loadChildren: () => MatchModule
  },
  {
    path: 'players',
    loadChildren: () => PlayersModule
  },
  {
    path: 'teams',
    loadChildren: () => TeamsModule
  },
  {
    path: 'leagues',
    loadChildren: () => LeagueModule
  },
  {
    path: 'season',
    loadChildren: () => SeasonModule
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
