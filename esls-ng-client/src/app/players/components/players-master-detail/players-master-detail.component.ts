import {Component, EventEmitter, Input, Output} from '@angular/core';
import {DialogType} from "../../../shared/domain/dialog-type";
import {Players} from "../../../shared/domain/players";

@Component({
  selector: 'app-players-master-detail',
  templateUrl: './players-master-detail.component.html',
  styleUrls: ['./players-master-detail.component.css']
})
export class PlayersMasterDetailComponent {
  @Input()
  set setDialogData(dialogData: Players) {
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

  dialogData: Players;
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

}
