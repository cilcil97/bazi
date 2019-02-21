import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Season} from "../../shared/domain/season";
import {HttpClient} from "@angular/common/http";

const apiURI = '/api/sezona';

@Injectable({
  providedIn: 'root'
})
export class SeasonService {

  constructor(private httpClient: HttpClient) { }

  fetchAllSeasons(): Observable<Season[]> {
    return this.httpClient.get<Season[]>(apiURI)
  }

  edit($event: Season): Observable<Season> {
    return this.httpClient.patch<Season>(apiURI, $event)
  }

  create($event: Season): Observable<Season> {
    return this.httpClient.post<Season>(apiURI, $event)
  }

}
