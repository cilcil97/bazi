import {Component, OnInit} from '@angular/core';
import {SeasonService} from "../../services/season.service";
import {LigaService} from "../../../league/services/liga.service";
import {League} from "../../../shared/domain/league";
import {Season} from "../../../shared/domain/season";
import {CreateLeagueAndSeasonRequest} from "../../../shared/domain/create-league-and-season-request";
import {SeasonWithLeagues} from "../../../shared/domain/season-with-leagues";
import {ColumnDefinition} from "../../../shared/domain/column-definition";

@Component({
  selector: 'app-append-to-league',
  templateUrl: './append-to-league.component.html',
  styleUrls: ['./append-to-league.component.css']
})
export class AppendToLeagueComponent implements OnInit {

  leagues: League[];
  seasons: Season[];
  seasonWithLeagues: SeasonWithLeagues[];

  selectedSeason: Season;
  selectedLeagues: League[];
  columnDefinition: ColumnDefinition[] = [
    {
      field: 'year',
      header: 'Year'
    },
    {
      field: 'ligi',
      header: 'Ligi'
    }
  ];

  constructor(private seasonService: SeasonService,
              private leagueService: LigaService) {
  }

  ngOnInit() {
    this.seasonService.fetchAllSeasons()
      .subscribe(it => this.seasons = it);
    this.leagueService.fetchAllLeagues()
      .subscribe(it => this.leagues = it);
    this.leagueService.fetchAllSeasonsWithLeagues()
      .subscribe(it => this.seasonWithLeagues = it)
  }


  save() {
    const request: CreateLeagueAndSeasonRequest = {
      ligi: this.selectedLeagues.map(it => it.id),
      sezonaId: this.selectedSeason.year
    };

    this.leagueService.createLeagueAndSeason(request)
      .subscribe(it => it)
  }
}
