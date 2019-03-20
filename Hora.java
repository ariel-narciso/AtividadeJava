public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora(int h, int m, int s){
		
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
		
		if (!verificarHora()) {
		
			this.hora = 0;
			this.minuto = 0;
			this.segundo = 0;
		}
	}
	
	public static void main(String [] args) {
		
		Hora hora = new Hora(100, 600, 700);
	}
	
	public void setHora(int h){
		if(h >= 0 && h < 24){
			this.hora = h;
		}
	}
	
	public int getHora(){
		return(this.hora);
	}
	
	public void setMinuto(int m){
		if(m >= 0 && m < 60){
			this.minuto = m;
		}
	}
	
	public int getMinuto(){
		return(this.minuto);
	}
	
	public void setSegundo(int s){
		if(s >= 0 && s < 60){
			this.segundo = s;
		}
	}
	
	public int getSegundo(){
		return(this.segundo);
	}
	
	public boolean verificarHora(){
		
		return
			(this.hora >= 0 && this.hora < 24) &&
			(this.minuto >= 0 && this.minuto < 60) &&
			(this.segundo >= 0 && this.minuto < 60);
	}
}


