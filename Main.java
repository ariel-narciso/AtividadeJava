import java.util.Scanner;

class Main {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		Agendamento agendamento = new Agendamento(input.nextLine());
		
		System.out.print("Quantas pessoas participarão da reunião? ");
		Contato contatos[] = new Contato[input.nextInt()];
		input.nextLine();
		
		for (int i = 0; i < contatos.length; i++) {
			
			contatos[i] = new Contato();
			
			System.out.print("Digite o nome da " + (i + 1) + "a. pessoa: ");
			contatos[i].setNome(input.nextLine());
			
			System.out.print("Digite o email da " + (i + 1) + "a. pessoa: ");
			contatos[i].setEmail(input.nextLine());
			
			System.out.print("Digite o telefone da " + (i + 1) + "a. pessoa: ");
			contatos[i].setTelefone(input.nextLine());
		}
		
		agendamento.setParticipantes(contatos);
		
		System.out.print("Digite o dia da reunião: ");
		int dia = input.nextInt();
		
		System.out.print("Digite o mes da reunião: ");
		int mes = input.nextInt();
		
		System.out.print("Digite o ano da reunião: ");
		int ano = input.nextInt();
		
		agendamento.setData(new Data(dia, mes, ano));
		
		System.out.print("Digite a hora do dia da reunião: ");
		int hora = input.nextInt();
		
		agendamento.setHoraInício(new Hora(hora, 0, 0));
		
		System.out.print("Digite a quantidade de minutos que durará a reunião: ");
		int minutos = input.nextInt();
		agendamento.setDuração(new Hora(minutos / 60, minutos % 60, 0));
	}
}
