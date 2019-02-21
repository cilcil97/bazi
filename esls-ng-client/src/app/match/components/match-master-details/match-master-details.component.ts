import {Component, EventEmitter, Input, Output} from '@angular/core';
import {Season} from "../../../shared/domain/season";
import {Team} from "../../../shared/domain/team";
import {DialogType} from "../../../shared/domain/dialog-type";
import {MatchSimple} from "../match-list/match-list.component";
import {AddMatchRequest} from "../../../shared/domain/add-match-request";

@Component({
  selector: 'app-match-master-details',
  templateUrl: './match-master-details.component.html',
  styleUrls: ['./match-master-details.component.css']
})
export class MatchMasterDetailsComponent {
  @Input()
  set setDialogData(dialogData: MatchSimple) {
    this.dialogData = dialogData;
  };

  @Input()
  set setDisplayDialog(displayDialog: boolean) {
    this.displayDialog = displayDialog;
  };

  @Input()
  set setDialogType(dialogType: DialogType) {
    this.dialogType = dialogType;
  }

  @Input()
  seasons: Season[];
  @Input()
  teams: Team[];
  @Output()
  onSave: EventEmitter<any> = new EventEmitter();
  @Output()
  handleClose: EventEmitter<any> = new EventEmitter();

  newData: {};

  dialogData: MatchSimple;
  displayDialog: boolean;
  dialogType: DialogType;
  selectedWinner: Team;
  selectedLooser: Team;

  constructor() {
  }


  onSaveClick() {
    if (this.dialogType === DialogType.EDIT) {
      this.onSave.emit(this.dialogData);
    } else {
      const asd: AddMatchRequest = {
        finale: this.newData['finale'] as boolean,
        gubitnik: this.selectedLooser.id,
        pobednik: this.selectedWinner.id,
        year: this.newData['year'] as number,
        liga: this.newData['liga'] as number
      };
      this.newData = {};
      this.onSave.emit(asd)
    }
  }

  handle() {
    this.newData = {};
    this.handleClose.emit();
  }
}
