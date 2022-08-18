export class Experiencia {
    id?: number;
    nombreE: string;
    periodoEx: string;
    descripcionE: string;

    constructor(nombreE: string, periodoEx: string, descripcionE: string){
        this.nombreE=nombreE;
        this.periodoEx = periodoEx;
        this.descripcionE=descripcionE;
    }
}
