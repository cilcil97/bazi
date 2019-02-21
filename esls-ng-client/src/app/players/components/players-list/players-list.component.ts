import {Component, OnInit} from '@angular/core';
import {DialogType} from "../../../shared/domain/dialog-type";
import {ColumnDefinition} from "../../../shared/domain/column-definition";
import {PlayerService} from "../../services/player.service";
import {Players} from "../../../shared/domain/players";

@Component({
  selector: 'app-players-list',
  templateUrl: './players-list.component.html',
  styleUrls: ['./players-list.component.css']
})
export class PlayersListComponent implements OnInit {
  columnDefinition: ColumnDefinition[] = [
    {
      field: 'id',
      header: 'Id'
    },
    {
      field: 'akronim',
      header: 'Akronim'
    },
    {
      field: 'drzava',
      header: 'Drzava'
    },
    {
      field: 'ime',
      header: 'Ime'
    },
    {
      field: 'pozicija',
      header: 'Pozicija'
    }
  ];
  players: Players[];
  selection: Players;
  dialogType: DialogType;
  displayDialog: boolean = false;

  constructor(private service: PlayerService) {
  }

  ngOnInit() {
    this.fetch();
  }

  private fetch() {
    this.service.fetchAllPlayers()
      .subscribe(it => this.players = it)
  }

//call the dialog
  onRowSelect($event: any) {
    this.dialogType = DialogType.EDIT;
    this.displayDialog = true;
  }

  showDialogToAdd() {
    this.dialogType = DialogType.CREATE;
    this.displayDialog = true;
  }

  handleClose() {
    this.selection = null;
    this.displayDialog = false;
  }

  catchRow($event) {
    if (this.dialogType === DialogType.EDIT) {
      this.service.editPlayer($event)
        .subscribe(it => this.fetch())
    } else {
      this.service.createPlayer($event)
        .subscribe(it => this.fetch())
    }
  }
}
