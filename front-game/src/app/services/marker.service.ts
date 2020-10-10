import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';

import * as L from 'leaflet';
import { MatchDTO } from '../models/match.dto';
import { Observable } from 'rxjs';
import { PopUpService } from './pop-up.service';
import { MatchResponse } from '../models/match.response';

const MATCH_URL = environment.BASE_URL + 'matches';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class MarkerService {

  constructor(private http: HttpClient, private popupService: PopUpService, private match: MatchResponse) {
  }

  makeMunicipalitiesMarkers(map: L.Map): void {

    var self = this;
    this.match.map.municipalities.forEach(function (value) {
      let lat = value.centroide.lon;
      let lon = value.centroide.lat;
      const marker = L.marker([Number(lon), Number(lat)]).addTo(map);

      marker.bindPopup(self.popupService.makeMunicipalitesPopup(value));
    }); 
    
    // this.getMunicipalities().subscribe((res: any) => {
    //   for (const c of res.features) {
    //     const lat = c.geometry.coordinates[0];
    //     const lon = c.geometry.coordinates[1];
    //     const marker = L.marker([lon, lat]).addTo(map);
    //   }
    // });
  }

  // public getMunicipalities(): Observable<any> {
  //   return this.http.get<any>(`${MATCH_URL}`)
  // }
}