import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {League} from "../../shared/domain/league";
import {CreateLeagueAndSeasonRequest} from "../../shared/domain/create-league-and-season-request";
import {LeagueAndSeason} from "../../shared/domain/league-and-season";
import {SeasonWithLeagues} from "../../shared/domain/season-with-leagues";

const apiUri = '/api/liga';
const ligaSezonaApiUri = '/api/liga-sezona';

@Injectable({
  providedIn: 'root'
})
export class LigaService {

  constructor(private httpClient: HttpClient) { }

  fetchAllLeagues(): Observable<League[]> {
    return this.httpClient.get<League[]>(apiUri);
  }

  createLeague(league: League): Observable<League> {
    return this.httpClient.post<League>(apiUri, league);
  }

  createLeagueAndSeason(request: CreateLeagueAndSeasonRequest): Observable<LeagueAndSeason> {
    return this.httpClient.post<LeagueAndSeason>(ligaSezonaApiUri, request);
  }

  fetchAllSeasonsWithLeagues(): Observable<SeasonWithLeagues[]> {
    return this.httpClient.get<SeasonWithLeagues[]>(ligaSezonaApiUri);
  }

}
