import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Player} from "@angular/core/src/render3/interfaces/player";
import {Players} from "../../shared/domain/players";

const apiUrl = '/api/igrachi';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private httpClient: HttpClient) {
  }

  fetchAllPlayers(): Observable<Players[]> {
    return this.httpClient.get<Players[]>(apiUrl)
  }

  createPlayer(player: Players): Observable<Players> {
    return this.httpClient.post<Players>(apiUrl, player)
  }

  editPlayer(player: Players): Observable<Players> {
    return this.httpClient.patch<Players>(apiUrl, player)
  }
}
