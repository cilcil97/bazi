import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Team} from "../../shared/domain/team";
import {AddTeamRequest} from "../../shared/domain/add-team-request";
import {EditTeamRequest} from "../../shared/domain/edit-team-request";

const apiURI = '/api/timovi';

@Injectable({
  providedIn: 'root'
})
export class TeamService {

  constructor(private httpClient: HttpClient) {
  }

  fetchAllTeams(): Observable<Team[]> {
    return this.httpClient.get<Team[]>(apiURI)
  }

  createTim(request: AddTeamRequest): Observable<Team> {
    return this.httpClient.post<Team>(apiURI, request)
  }

  editTim(request: EditTeamRequest): Observable<Team> {
    return this.httpClient.patch<Team>(apiURI, request)
  }
}
