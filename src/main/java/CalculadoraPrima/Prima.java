package CalculadoraPrima;

public class Prima {

	 private int edad;
	 private int puntos;
	 private int tarifaBasica;
	 private int maxPuntosLicencia;
	 
	public Prima(int edad,int puntos) {
		super();
		this.edad = edad;
		this.puntos=puntos;
		this.tarifaBasica=500; 
		this.maxPuntosLicencia=30;
	}

	//Prima = TarifaBásica * FactorEdad - ReducciónConductorSeguro
	public double calculoPrima() {
		double factorEdad=0;
		int ReducciónConductorSeguro=0;
		int puntosPerdidos=maxPuntosLicencia-this.puntos;

		if(this.edad<25) {
			factorEdad=2.8;
			if(puntosPerdidos<=1){
				ReducciónConductorSeguro=50;
			}
		}

		if(this.edad>=25 && this.edad<35) {
			factorEdad=1.8;
			if(puntosPerdidos<=3){
				ReducciónConductorSeguro=50;
			}
		}

		if(this.edad>=35 && this.edad<45) {
			factorEdad=1.0;
			if(puntosPerdidos<=5){
				ReducciónConductorSeguro=100;
			}
		}

		if(this.edad>=45 && this.edad<65) {
			factorEdad=0.8;
			if(puntosPerdidos<=7){
				ReducciónConductorSeguro=150;
			}
		}

		if(this.edad>=65) {
			factorEdad=1.5;
			if(puntosPerdidos<=5){
				ReducciónConductorSeguro=200;
			}
		}
		double primaCalculada=this.tarifaBasica*factorEdad-ReducciónConductorSeguro;
		return primaCalculada;
	}
	
}
