import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatchMasterDetailsComponent} from './components/match-master-details/match-master-details.component';
import {MatchListComponent} from './components/match-list/match-list.component';
import {MatchRoutingModule} from "./match-routing.module";
import {MatchService} from "./services/match.service";
import {TableModule} from "primeng/table";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {ButtonModule} from "primeng/button";
import {DialogModule} from "primeng/dialog";
import {ListboxModule} from "primeng/listbox";


@NgModule({
  declarations: [MatchMasterDetailsComponent, MatchListComponent],
  imports: [
    CommonModule,
    MatchRoutingModule,
    TableModule,
    ButtonModule,
    DialogModule,
    ListboxModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [MatchService]
})
export class MatchModule {


}
