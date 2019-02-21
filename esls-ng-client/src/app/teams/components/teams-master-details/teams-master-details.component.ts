import {Component, EventEmitter, Input, Output} from '@angular/core';
import {DialogType} from "../../../shared/domain/dialog-type";
import {Team} from "../../../shared/domain/team";

@Component({
  selector: 'app-teams-master-details',
  templateUrl: './teams-master-details.component.html',
  styleUrls: ['./teams-master-details.component.css']
})
export class TeamsMasterDetailsComponent {
  @Input()
  set setDialogData(dialogData: Team) {
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

  dialogData: Team;
  displayDialog: boolean;
  dialogType: DialogType;
  newData = {};

  @Output()
  output: EventEmitter<any> = new EventEmitter();

  @Output()
  handleClose: EventEmitter<any> = new EventEmitter();
  selectedLeague: string;

  constructor() {

  }


  onSaveClick() {
    if (this.dialogType === DialogType.EDIT) {
      this.output.emit(this.dialogData);
    } else {
      const copy = this.newData;
      this.newData = {};
      this.output.emit(copy)
    }
  }

  handle() {
    this.handleClose.emit();
  }

  log($event) {
    console.log($event)
  }


  setLeague(l: string) {
    this.selectedLeague = l;
  }
}
