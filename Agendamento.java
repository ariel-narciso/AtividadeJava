class Agendamento {

	private String nome;
	
	private String [] participantes;
	
	private Data data;
	
	public void setData(Data data) {
		this.data = data;
	}
	
	private Hora horaInício;
	
	private Hora duração;
	
	public Agendamento() {
		//data = new Data();
	}
	
	public static void main(String [] args) {
	
		Agendamento agendamento = new Agendamento();
		agendamento.setData(new Data(13, 6, 1997));
		System.out.println(agendamento.data.getData());
	}	
}
