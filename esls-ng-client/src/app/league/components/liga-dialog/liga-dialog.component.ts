import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Season} from "../../../shared/domain/season";
import {DialogType} from "../../../shared/domain/dialog-type";
import {League} from "../../../shared/domain/league";

@Component({
  selector: 'app-liga-dialog',
  templateUrl: './liga-dialog.component.html',
  styleUrls: ['./liga-dialog.component.css']
})
export class LigaDialogComponent {

  @Input()
  set setDialogData(dialogData: League) {
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

  dialogData: League;
  displayDialog: boolean;
  dialogType: DialogType;
  newData = {};

  @Output()
  output: EventEmitter<any> = new EventEmitter();

  @Output()
  handleClose: EventEmitter<any> = new EventEmitter();

  constructor() {
  }


  onSaveClick() {
    if(this.dialogType === DialogType.EDIT) {
      this.output.emit(this.dialogData);
    }
    else {
      const copy = this.newData;
      this.newData = {};
      this.output.emit(copy)
    }
  }

  handle() {
    this.handleClose.emit();
  }

}
