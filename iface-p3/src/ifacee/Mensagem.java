package ifacee;
import java.util.ArrayList;

public class Mensagem {
	public class Mensagem{
		
		public String Mensagemname;
		public ArrayList<String> Mensagem = new ArrayList<String>();

		public void ShowMensagem() {
			int i;
			if(Mensagem.size() > 0) {
				System.out.println("Suas conversas com " + Mensagemname);
				for(i = 0; i < Mensagem.size(); i++) {
					System.out.println(Mensagem.get(i));
				}
			}
			else {
				System.out.println("Voce nao tem conversas com" + this.Mensagemname);
			}
		}
		
	}
}
