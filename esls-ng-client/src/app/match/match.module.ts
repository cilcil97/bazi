import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatchMasterDetailsComponent} from './components/match-master-details/match-master-details.component';
import {MatchesComponent} from './components/matches/matches.component';
import {MatchListComponent} from './components/match-list/match-list.component';
import {FinalMatchComponent} from './components/final-match/final-match.component';
import {MatchRoutingModule} from "./match-routing.module";


@NgModule({
  declarations: [MatchMasterDetailsComponent, MatchesComponent, MatchListComponent, FinalMatchComponent],
  imports: [
    CommonModule,
    MatchRoutingModule
  ]
})
export class MatchModule {


}
