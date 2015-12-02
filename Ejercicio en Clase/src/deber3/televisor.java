package deber3;

public class televisor {

	private int volumen_actual;
	private int canal_actual;
	private boolean encendido;
	
	public televisor(){
		
	}
	
	public televisor (int volumenParam, int canalParam){
		this.volumen_actual=volumenParam;
		this.canal_actual=canalParam;
		
	}
	
	public void establecerVolumen (int volumen){
		volumen_actual=volumen;
	}
	
	public void establecerCanal(int canal){
		canal_actual=canal;
	}
	
	public int obtenerVolumen(){
		return volumen_actual;
		
	}
	
	public int obtenerCanal(){
		return canal_actual;
		
	}

	public boolean obtenerEstado(){
		return encendido;
	}
	
	public void encender(){
		encendido=true;
		
	}
	
	public void apagar(){
		encendido=false;
	}
	
	public void subirVolumen(){
		if(encendido&& volumen_actual<=100)
			volumen_actual++;
		
	}
	
	public void bajarVolumen(){
		if(encendido&& volumen_actual>0)
			volumen_actual--;
		
	}
	
	public void cambiarCanalArriba(){
		if(encendido&& canal_actual<=50)
			canal_actual++;
	}
	
	public void cambiarCanalAbajo(){
		if(encendido&& canal_actual>=1)
			canal_actual--;
	}
	
	public String toString(){
		return "canalActual:"+canal_actual+"volumen Acual:" +volumen_actual;
		
	}
}
