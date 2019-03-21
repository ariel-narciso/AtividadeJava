class Data {

	private boolean foiInicializado;
	
	private int dia;
	
	private int mes;
	
	private int ano;
	
	private String meses[] = {
	
		"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
		"agosto", "setembro", "outubro", "novembro", "dezembro"
	};
	
	private int numDiasMeses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		foiInicializado = validarData();
		
		if (!foiInicializado) {
		
			this.dia = 1;
			this.mes = 1;
			this.ano = 1950;
		}
	}
	
	public boolean getFoiInicializado() {
		return this.foiInicializado;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public boolean setDia(int dia) {
		
		int temp = this.dia;
		this.dia = dia;
		
		if (!validarData()) {
			
			this.dia = temp;
			return false;
		}
		
		return true;
	}
	
	public boolean setMes(int mes) {
		
		int temp = this.mes;
		this.mes = mes;
		
		if (!validarData()) {
			
			this.mes = temp;
			return false;
		}
		
		return true;
	}
	
	public boolean setAno(int ano) {
		
		int temp = this.ano;
		this.ano = ano;
		
		if (!validarData()) {
			
			this.ano = temp;
			return false;
		}
		
		return true;
	}
	
	public String getData() {
		
		String data = "";
		
		if (this.dia < 10) {
			data = "0";
		}
		
		data += this.dia + " de ";
		
		data += this.meses[this.mes - 1] + " de ";
		
		if (this.ano < 1000) {
		
			data += "0";
			
			if (this.ano < 100) {
			
				data += "0";
				
				if (this.ano < 10) {
					data += "0";
				}
			}
		}
		
		return data + this.ano;
	}
	
	private boolean validarData() {
	
		if (this.ano < 1 || this.ano > 9999) {
			return false;
		}
		
		numDiasMeses[1] = éAnoBissexto() ? 29 : 28;
		
		return (
			this.mes >= 1 && this.mes <= 12 && this.dia >= 1 &&
			this.dia <= this.numDiasMeses[this.mes - 1]
		);
	}
	
	private boolean éAnoBissexto() {
		return (this.ano % 400 == 0) || (this.ano % 100 != 0 && this.ano % 4 == 0);
	}
}

