import {Component, OnInit} from '@angular/core';
import {ColumnDefinition} from "../../../shared/domain/column-definition";
import {League} from "../../../shared/domain/league";
import {LigaService} from "../../services/liga.service";
import {DialogType} from "../../../shared/domain/dialog-type";

@Component({
  selector: 'app-liga',
  templateUrl: './liga.component.html',
  styleUrls: ['./liga.component.css']
})
export class LigaComponent implements OnInit {

  columnDefinition: ColumnDefinition[] = [
    {
      field: 'id',
      header: 'Id'
    },
    {
      field: 'kontinent',
      header: 'Kontinent'
    },
    {
      field: 'ime',
      header: 'Ime'
    },
    {
      field: 'mestoNaOdrzuvanje',
      header: 'MestoNaOdrzuvanje'
    }
  ];
  selection: League;
  leagues: League[];
  displayDialog: boolean = false;
  dialogType: DialogType = null;

  constructor(private service: LigaService) { }

  ngOnInit() {
    this.fetch();
  }


  private fetch() {
    this.service.fetchAllLeagues()
      .subscribe(it => this.leagues = it)
  }

  handleClose() {
    this.selection = null;
    this.displayDialog = false;
  }

  showDialogToAdd() {
    this.dialogType = DialogType.CREATE;
    this.displayDialog = true;
  }

  onRowSelect($event: any) {
    this.dialogType = DialogType.EDIT;
    this.displayDialog = true;
  }

  catchRow($event: League) {
    if(this.dialogType === DialogType.EDIT) {
      console.warn("Not implemented");
    }
    else {
      this.service.createLeague($event)
        .subscribe(it => this.fetch())
    }
  }
}
