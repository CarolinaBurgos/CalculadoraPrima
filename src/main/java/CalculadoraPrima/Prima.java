package CalculadoraPrima;

public class Prima {

	 private transient int edad;
	 private transient int puntos;
	 private transient int tarifaBasica;
	 private transient int maxPuntosLicencia;
	 
	 public static final int EDAD25 = 25;
	 public static final int EDAD35 = 35;
	 public static final int EDAD45 = 45;
	 public static final int EDAD65 = 65;
	 
	 public static final int PUNTO1 = 1;
	 public static final int PUNTO3 = 3;
	 public static final int PUNTO5 = 5;
	 public static final int PUNTO7 = 7;
	 
	 //Issue
	 public static final int PUNTO4 = 4;
	 
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

		if(this.edad<EDAD25) {
			factorEdad=2.8;
			if(puntosPerdidos<=PUNTO1){
				ReducciónConductorSeguro=50;
			}
		}

		if(this.edad>=EDAD25 && this.edad<EDAD35) {
			factorEdad=1.8;
			if(puntosPerdidos<=PUNTO3){
				ReducciónConductorSeguro=50;
			}
		}

		if(this.edad>=EDAD35 && this.edad<EDAD45) {
			factorEdad=1.0;
			if(puntosPerdidos<=PUNTO5){
				ReducciónConductorSeguro=100;
			}
		}

		if(this.edad>=EDAD45 && this.edad<EDAD65) {
			factorEdad=0.8;
			if(puntosPerdidos<PUNTO7){
				ReducciónConductorSeguro=150;
			}
		}

		if(this.edad>=EDAD65) {
			factorEdad=1.5;
			if(puntosPerdidos<=PUNTO4){
				ReducciónConductorSeguro=200;
			}
		}
		double primaCalculada=this.tarifaBasica*factorEdad-ReducciónConductorSeguro;
		return primaCalculada;
	}
	
}
