import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {DialogType} from "../../domain/dialog-type";
import {ColumnDefinition} from "../../domain/column-definition";
import {FormGroup} from "@angular/forms";

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent<T> implements OnInit {

  @Input()
  opened: boolean;

  @Input()
  type: DialogType;

  @Input()
  header: string;

  @Input()
  data?: T | null = null;

  @Input()
  form: FormGroup;

  @Output()
  onCompleteClick: EventEmitter<T> = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

}
