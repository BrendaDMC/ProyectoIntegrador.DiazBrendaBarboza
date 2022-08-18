import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Acercade } from 'src/app/model/acercade';
import { AcercadeService } from 'src/app/service/acercade.service';

@Component({
  selector: 'app-new-acercade',
  templateUrl: './new-acercade.component.html',
  styleUrls: ['./new-acercade.component.css']
})
export class NewAcercadeComponent implements OnInit {
  acerca: string;


  constructor(private acercadeS: AcercadeService, private router: Router) { }

  ngOnInit(): void {
  }
  onCreate(): void{
    const acercade = new Acercade(this.acerca);
    this.acercadeS.save(acercade).subscribe(
      data =>{
        alert("Educacion añadida correctamente");
        this.router.navigate(['']);
      }, err =>{
        alert("falló");
        this.router.navigate(['']);
      }
    )
  }

}
