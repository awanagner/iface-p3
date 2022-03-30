packidade ifacee;
import java.util.Scanner;
import java.util.ArrayList;

	public class Contas{
		public String nickname;
		public String name;
		private String password;
		public ArrayList<String> friends = new ArrayList<String>();
		public ArrayList<String> newfriends = new ArrayList<String>();
		public int idade;
		public String cidade;
		public String nacionalidade;
		public ArrayList<Mensagem> myMensagem = new ArrayList<Mensagem>();
		
		
		public void CreateNewAccount() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Nickname:");
			nickname = scanner.nextLine();
			
			System.out.println("Username:");
			name = scanner.nextLine();
			
			System.out.println("Password:");
			password = scanner.nextLine();
			
		}
		
		
		public String getPassword() {
			return this.password;
		}
		
		
		public void CreateProfile() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Idade:");
			idade = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Cidade:");
			cidade = scanner.nextLine();
			
			System.out.println("Nacionalidade:");
			nacionalidade = scanner.nextLine();
			
		}
		
		public void EditProfile() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("O que você quer mudar?\n     1 - idade\n     2 - cidade\n     3 - nacionalidade\n     4 - All\n");
			
			int editinput = scanner.nextInt();
			scanner.nextLine();
			
			switch(editinput) {
			
				case 1:
					System.out.println("Idade:");
					idade = scanner.nextInt();
					scanner.nextLine();
					System.out.println("OK");
					break;
				
				case 2:
					System.out.println("Cidade:");
					cidade = scanner.nextLine();
					System.out.println("OK");
					break;
					
				case 3:
					System.out.println("Nacionalidade:");
					nacionalidade = scanner.nextLine();
					System.out.println("OK");
					break;
				
				case 4:
					System.out.println("Idade:");
					idade = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Cidade:");
					cidade = scanner.nextLine();
					
					System.out.println("Nacionalidade:");
					nacionalidade = scanner.nextLine();
					System.out.println("OK!");
					break;
			
			}
			
		}
		
		
		public void AddFriend(String yourname) {
			String Mensagem = yourname;
			newfriends.add(Mensagem);
			System.out.println("OK");
		}
		
		
		public void SendMensagem(ArrayList<Contas> u) {
			
			Scanner scanner = new Scanner(System.in);
			
			int i, j;
			
			String mess = null;
			
			System.out.println("Para quem voce deseja enviar mensagem?");
			
			String newname = scanner.nextLine();
			
			for(i = 0; i < myMensagem.size(); i++) {
				
				if(newname.equals(myMensagem.get(i).Mensagemname)) {
					
					System.out.println("Digite sua mensagem...");
					
					mess = scanner.nextLine();
					
					this.myMensagem.get(i).Mensagem.add(this.name + ": " + mess);
				
				}
				
			}
			
			for(i = 0; i < u.size(); i++) {
				if(newname.equals(u.get(i).name)) {
					
					for(j = 0; j < u.get(i).myMensagem.size(); j++) {
						
						if(this.name.equals(u.get(i).myMensagem.get(j).Mensagemname)) {
							
							u.get(i).myMensagem.get(j).Mensagem.add(this.name + ": " + mess);
							
						}
					}
					
				}
			}
			
			System.out.println("OK");

		}
		
		public void PeekMensagem() {
			
			Scanner scanner = new Scanner(System.in);
			
			int i, fl = 0;
			
			System.out.println("Quem precisa ler sua mensagem...");
			
			String search = scanner.nextLine();
			
			for(i = 0; i < myMensagem.size(); i++) {
				if(search.equals(myMensagem.get(i).Mensagemname)) {
					myMensagem.get(i).ShowMensagem();
					fl++;
				}
			}
			
			if(fl == 0) {
				System.out.println("ERRO: Não encontrado!");
			}
			
		}

		
	}

}
