class Hora {

	private int hora;
	
	private int minuto;
	
	private int segundo;
	
	public Hora() {
		this.hora = this.minuto = this.segundo = 0;
	}
	
	public Hora(int hora, int minuto, int segundo) {
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
		if (!verificarHora()) {
			this.hora = this.minuto = this.segundo = 0;
		}
	}
	
	public int getHora(){
		return (this.hora);
	}
	
	public int getMinuto(){
		return (this.minuto);
	}
	
	public int getSegundo(){
		return (this.segundo);
	}
	
	public boolean setHora(int hora){
		
		if (hora >= 0 && hora < 24) {
		
			this.hora = hora;
			return true;
		}
		
		return false;
	}
	
	public boolean setMinuto(int minuto){
		
		if (minuto >= 0 && minuto < 60) {
		
			this.minuto = minuto;
			return true;
		}
		
		return false;
	}
	
	public boolean setSegundo(int segundo){
		
		if (segundo >= 0 && segundo < 60) {
		
			this.segundo = segundo;
			return true;
		}
		
		return false;
	}
	
	public boolean verificarHora(){
		
		return
			(this.hora >= 0 && this.hora < 24) &&
			(this.minuto >= 0 && this.minuto < 60) &&
			(this.segundo >= 0 && this.minuto < 60);
	}
}


