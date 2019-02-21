import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Match} from "../../shared/domain/match";
import {AddMatchRequest} from "../../shared/domain/add-match-request";

const apiURI = '/api/utakmica';

@Injectable({
  providedIn: 'root'
})
export class MatchService {

  constructor(private httpClient: HttpClient) { }

  getAllMatches(): Observable<Match[]> {
    return this.httpClient.get<Match[]>(apiURI)
  }

  createMatch(request: AddMatchRequest): Observable<Match> {
    return this.httpClient.post<Match>(apiURI, request);
  }
}
