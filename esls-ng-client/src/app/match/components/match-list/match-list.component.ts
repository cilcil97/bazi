import {Component, OnInit, ViewChild} from '@angular/core';
import {GenericTableComponent} from "../../../shared/components/generic-table/generic-table.component";
import {Match} from "../../../shared/domain/match";

@Component({
  selector: 'app-match-list',
  templateUrl: './match-list.component.html',
  styleUrls: ['./match-list.component.css']
})
export class MatchListComponent implements OnInit {

  @ViewChild(GenericTableComponent)
  table: GenericTableComponent<Match>;

  constructor() { }

  ngOnInit() {
  }

}
