import {Team} from "./team";
import {LeagueAndSeason} from "./league-and-season";

export interface Match {
  id: number,
  finale: boolean,
  gubitnik: Team,
  pobednik: Team,
  sezona: LeagueAndSeason
}
