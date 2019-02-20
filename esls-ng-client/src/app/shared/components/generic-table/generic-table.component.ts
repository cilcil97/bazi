import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {ColumnDefinition} from "../../domain/column-definition";

@Component({
  selector: 'app-generic-table',
  templateUrl: './generic-table.component.html',
  styleUrls: ['./generic-table.component.css']
})
export class GenericTableComponent<T> implements OnInit {
  @Input()
  data: T[];

  @Input()
  columns: ColumnDefinition[];

  @Input()
  selectionMode: string;

  @Input()
  caption: string;

  @Output()
  showDialog: EventEmitter<T | null> = new EventEmitter();

  selection: T;

  constructor() {
  }

  ngOnInit() {
  }

  onRowSelect(data: T) {
    this.showDialog.emit(data);
  }

  showDialogToAdd() {
    this.showDialog.emit(null)
  }
}
