import { Injectable } from '@angular/core';
import * as moment from 'moment';

@Injectable({
  providedIn: 'root'
})
export class DateUtilsService {

  constructor() { }

  formatToISO(date: Date): string {
    return moment(date).format("yyyy-MM-dd")
  }

}
