class Agendamento {

	private String nome;
	
	private Contato [] participantes;
	
	private Data data;
	
	private Hora horaInício;
	
	private Hora duração;
	
	public Agendamento(String nome) {
		
		this.nome = nome;
		
		this.participantes = null;
		this.data = null;
		this.horaInício = null;
		this.duração = null;
	}
	
	public Agendamento(String nome, Contato [] participantes) {
		
		this.nome = nome;
		this.participantes = participantes;
		
		this.data = null;
		this.horaInício = null;
		this.duração = null;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Contato[] getParticipantes() {
		return this.participantes;
	}
	
	public Contato getParticipante(int index) {
		
		if (index >= 0 && index < this.participantes.length) {
			return this.participantes[index];
		}
		
		return null;
	}
	
	public Data getData() {
		return this.data;
	}
	
	public Hora getHoraInício() {
		return this.horaInício;
	}
	
	public Hora getDuração() {
		return this.duração;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setParticipantes(Contato [] participantes) {
		this.participantes = participantes;
	}
	
	public boolean setData(Data data) {
		
		Data temp = this.data;
		this.data = data;
		
		if (!verificarData()) {
			
			this.data = temp;
			return false;
		}
		
		return true;
	}
	
	public boolean setHoraInício(Hora horaInício) {
		
		Hora temp = this.horaInício;
		this.horaInício = horaInício;
		
		if (!verificarHoraInício()) {
			
			this.horaInício = temp;
			return false;
		}
		
		return true;
	}
	
	public boolean setDuração(Hora duração) {
		
		Hora temp = this.duração;
		this.duração = duração;
		
		if (!verificarDuração()) {
			
			this.duração = temp;
			return false;
		}
		
		return true;
	}
	
	private boolean verificarHoraInício() {
		return (this.horaInício.getHora() >= 8 && this.horaInício.getHora() <= 19);
	}
	
	private boolean verificarDuração() {
		
		Hora tempo = this.duração;
		
		return (tempo.getHora() * 3600 + tempo.getMinuto() * 60 + tempo.getSegundo() <= 120 * 60);
	}
	
	private boolean verificarData() {
	
		if (this.data.getAno() > 2019) {
			return true;
		}
		
		if (this.data.getAno() == 2019) {
			
			if (this.data.getMes() > 3) {
				return true;
			}
			
			if (this.data.getMes() == 3) {
				return this.data.getDia() >= 22;
			}
		}
		
		return false;
	}
}

