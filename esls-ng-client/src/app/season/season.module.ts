import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SeasonComponent } from './components/season/season.component';
import {SeasonRoutingModule} from "./season-routing.module";
import {SharedModule} from "../shared/shared.module";
import {SeasonService} from "./services/season.service";
import {HttpClientModule} from "@angular/common/http";
import {TableModule} from "primeng/table";
import {DialogModule} from "primeng/dialog";
import {ButtonModule} from "primeng/button";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { SeasonDialogComponent } from './components/season-dialog/season-dialog.component';
import { AppendToLeagueComponent } from './components/append-to-league/append-to-league.component';
import {ListboxModule} from "primeng/listbox";

@NgModule({
  declarations: [SeasonComponent, SeasonDialogComponent, AppendToLeagueComponent],
  imports: [
    CommonModule,
    SeasonRoutingModule,
    SharedModule,
    HttpClientModule,
    TableModule,
    DialogModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    ListboxModule
  ],
  providers: [SeasonService]
})
export class SeasonModule { }
