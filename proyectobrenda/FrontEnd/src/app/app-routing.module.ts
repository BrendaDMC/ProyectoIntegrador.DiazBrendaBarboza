import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditAcercadeComponent } from './components/acerca-de/edit-acercade.component';
import { NewAcercadeComponent } from './components/acerca-de/new-acercade.component';
import { EditeducacionComponent } from './components/educacion/editeducacion.component';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import {HomeComponent} from './components/home/home.component'
import { EditHysComponent } from './components/hys/edit-hys.component';
import { LoginComponent } from './components/login/login.component';
import { EditProyectosComponent } from './components/proyecto/edit-proyectos.component';
import { NewProyectosComponent } from './components/proyecto/new-proyectos.component';


const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'login',component: LoginComponent},
  {path:'login',component: LoginComponent},
  {path:'nuevaexp',component: NewExperienciaComponent},
  {path:'editexp/:id',component:EditExperienciaComponent},
  {path:'nuevaedu',component: NeweducacionComponent},
  {path: 'editedu/:id', component: EditeducacionComponent},
  {path:'nuevaacerca',component: NewAcercadeComponent},
  {path: 'editacerca/:id', component: EditAcercadeComponent},
  {path: 'edithys/:id', component:EditHysComponent},
  {path: 'newproyecto',component: NewProyectosComponent},
  {path: 'editproyecto/:id', component: EditProyectosComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
