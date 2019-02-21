import {Component, EventEmitter, Input, OnChanges, Output, SimpleChanges} from '@angular/core';
import {DialogType} from "../../../shared/domain/dialog-type";
import {Season} from "../../../shared/domain/season";

@Component({
  selector: 'app-season-dialog',
  templateUrl: './season-dialog.component.html',
  styleUrls: ['./season-dialog.component.css']
})
export class SeasonDialogComponent {

  @Input()
  set setDialogData(dialogData: Season) {
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

  dialogData: Season;
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
