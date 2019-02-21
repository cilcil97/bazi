import {Component, OnInit} from '@angular/core';
import {TeamService} from "../../services/team.service";
import {LigaService} from "../../../league/services/liga.service";
import {Team} from "../../../shared/domain/team";
import {DialogType} from "../../../shared/domain/dialog-type";
import {ColumnDefinition} from "../../../shared/domain/column-definition";

@Component({
  selector: 'app-teams-list',
  templateUrl: './teams-list.component.html',
  styleUrls: ['./teams-list.component.css']
})
export class TeamsListComponent implements OnInit {
  columnDefinition: ColumnDefinition[] = [
    {
      field: 'id',
      header: 'Id'
    },
    {
      field: 'ime',
      header: 'Ime'
    },
    {
      field: 'logo',
      header: 'Logo'
    },
    {
      field: 'liga',
      header: 'Liga'
    }
  ];
  teams: Team[];
  selection: Team;
  displayDialog: boolean = false;
  dialogType: DialogType;
  leagues: string[];

  constructor(private service: TeamService,
              private leagueService: LigaService) {
  }

  ngOnInit() {
    this.fetchLeagues();
    this.fetch();
  }

  private fetchLeagues() {
    this.leagueService.fetchAllLeagues()
      .subscribe(it => this.leagues = it.map(it => it.ime))
  }

  private fetch() {
    this.service.fetchAllTeams()
      .subscribe(it => {
        this.teams = it;
      });
  }

  onRowSelect($event: any) {
    this.dialogType = DialogType.EDIT;
    this.displayDialog = true;
  }

  showDialogToAdd() {
    this.dialogType = DialogType.CREATE;
    this.displayDialog = true;
  }

  handleClose() {
    console.log(this.leagues);
    this.fetchLeagues();
    this.selection = null;
    this.displayDialog = false;
  }

  catchRow($event: any) {
    if (this.dialogType === DialogType.EDIT) {
      this.service.editTim($event)
        .subscribe(it => this.fetch())
    } else {
      this.service.createTim($event)
        .subscribe(it => this.fetch())
    }
  }
}
