import {Component, OnInit, ViewChild} from '@angular/core';
import {SeasonService} from "../../services/season.service";
import {Season} from "../../../shared/domain/season";
import {ColumnDefinition} from "../../../shared/domain/column-definition";
import {SeasonDialogComponent} from "../season-dialog/season-dialog.component";
import {DialogType} from "../../../shared/domain/dialog-type";

@Component({
  selector: 'app-season',
  templateUrl: './season.component.html',
  styleUrls: ['./season.component.css']
})
export class SeasonComponent implements OnInit {

  seasons: Season[];
  caption: string = 'Tabela so sezoni';
  selectionMode = "single";
  columnDefinition: ColumnDefinition[] = [
    {
      field: 'year',
      header: 'Year'
    },
    {
      field: 'pocetenDatum',
      header: 'PocetenDatum'
    },
    {
      field: 'kraenDatum',
      header: 'KraenDatum'
    }
  ];

  @ViewChild(SeasonDialogComponent)
  seasonDialog: SeasonDialogComponent;
  selection: Season | null;
  displayDialog: boolean = false;
  dialogType: DialogType;

  constructor(private service: SeasonService) {
  }

  ngOnInit() {
    this.fetchSeasons();
  }

  catchRow($event: Season) {
    this.handleClose();
    if (this.dialogType === DialogType.EDIT) {
      this.service.edit($event)
        .subscribe(it => this.fetchSeasons())

    } else {
      this.service.create($event)
        .subscribe(it => this.fetchSeasons())
    }

  }

  showDialogToAdd() {
    this.dialogType = DialogType.CREATE;
    this.displayDialog = true;
    console.log(this.displayDialog);
  }

  onRowSelect() {
    this.dialogType = DialogType.EDIT;
    this.displayDialog = true;
  }

  handleClose() {
    this.selection = null;
    this.displayDialog = false;
  }

  fetchSeasons() {
    this.service.fetchAllSeasons()
      .subscribe((it: Season[]) => this.seasons = it
      );
  }
}
