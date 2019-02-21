import {Component, OnInit} from '@angular/core';
import {TeamService} from "../../../teams/services/team.service";
import {SeasonService} from "../../../season/services/season.service";
import {MatchService} from "../../services/match.service";
import {Team} from "../../../shared/domain/team";
import {Season} from "../../../shared/domain/season";
import {AddMatchRequest} from "../../../shared/domain/add-match-request";
import {Match} from "../../../shared/domain/match";
import {ColumnDefinition} from "../../../shared/domain/column-definition";
import {DialogType} from "../../../shared/domain/dialog-type";
import {LigaService} from "../../../league/services/liga.service";

export interface MatchSimple {
  id: number,
  finale: boolean,
  gubitnikIme: string,
  pobednikIme: string,
  year: number,
  liga: string
}

@Component({
  selector: 'app-match-list',
  templateUrl: './match-list.component.html',
  styleUrls: ['./match-list.component.css']
})
export class MatchListComponent implements OnInit {

  teams: Team[];
  seasons: Season[];
  matches: Match[];
  matchesSimple: MatchSimple[] = null;
  dialogType: DialogType;
  displayDialog: boolean;

  columnDefinition: ColumnDefinition[] = [
    {
      field: 'id',
      header: 'Id'
    },
    {
      field: 'pobednikIme',
      header: 'Pobednik Ime'
    },
    {
      field: 'gubitnikIme',
      header: 'Gubitnik Ime'
    },
    {
      field: 'finale',
      header: 'Finale'
    },
    {
      field: 'year',
      header: 'Year'
    },
    {
      field: 'liga',
      header: 'Liga'
    }
  ];
  selection: MatchSimple;
  selected: MatchSimple;

  constructor(private teamService: TeamService,
              private seasonsService: SeasonService,
              private leaguesAndSeasons: LigaService,
              private matchService: MatchService) {
  }

  ngOnInit() {
    this.teamService.fetchAllTeams()
      .subscribe(it => this.teams = it);

    this.seasonsService.fetchAllSeasons()
      .subscribe(it => this.seasons = it);

    this.fetchMatches();
  }

  private fetchMatches() {
    this.matchService.getAllMatches()
      .subscribe(it => {
        this.map(it);
        this.matches = it;
      });
  }

  private map(it: Match[]) {
    this.matchesSimple = it.map(match => {
      return {
        finale: match.finale,
        gubitnikIme: match.gubitnik.ime,
        id: match.id,
        pobednikIme: match.pobednik.ime,
        liga: match.sezona.liga.ime,
        year: match.sezona.sezona.year
      };
    })
  }

  save(event: AddMatchRequest) {
    this.close();
    if(this.dialogType === DialogType.EDIT) {
      console.warn("Not implemented")
    }

    else {
      this.matchService.createMatch(event)
        .subscribe(_ => this.fetchMatches())
    }
  }

  close() {
    this.dialogType = null;
    this.displayDialog = false;
    this.selected = null;
  }

  onRowSelect($event) {
    this.dialogType = DialogType.EDIT;
    this.displayDialog = true;
    this.selected = this.selection;
  }

  showDialogToAdd() {
    this.dialogType = DialogType.CREATE;
    this.displayDialog = true;
  }
}
