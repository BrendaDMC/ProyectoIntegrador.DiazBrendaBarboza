import { Component, OnInit } from '@angular/core';
import { Hys } from 'src/app/model/hys';
import { HysService } from 'src/app/service/hys.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css']
})
export class HysComponent implements OnInit {
  hs: Hys[] = [];

  constructor(private sHys: HysService, private tokenService: TokenService) { }

  isLogged = false;

 ngOnInit(): void {
    this.cargarHys();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarHys(): void {
    this.sHys.lista().subscribe(data => { this.hs = data; })
  }

}
