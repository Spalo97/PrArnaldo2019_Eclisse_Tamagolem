import java.util.*;


public class Supporto {
	private int n; 
	
	
	public int getN() {
		return n;
	}

	public void introduzione() {
		Scanner lettore = new Scanner(System.in);
		System.out.println("Ciao!");
		System.out.println("Benvenuti nel mondo dei TAMAGOLEM");
		System.out.println("Avete mai giocato a tamagolem?");
		System.out.println("[0] Si, conosciamo le regole");
		System.out.println("[1] No, vorremmo sapere le regole");
		int risposta = lettore.nextInt();
		if (risposta != 0 && risposta != 1) {
			do {
				System.out.println("Non ho capito la risposta!");
				System.out.println("[0] Si, conosciamo le regole");
				System.out.println("[1] No, vorremmo sapere le regole");
				risposta =lettore.nextInt();
			} while (risposta != 0 && risposta != 1);
		}
		switch (risposta) {
		case 0:
			System.out.println("Bene, Allora iniziamo subito!");
			break;
		case 1:
			System.out.println("Le regoli sono semplici!");
			System.out.println("Nelle battaglie i Tamagolem si scaglieranno contro delle pietre del potere");
			System.out.println("la pietra più forte colpirà il tamagolem che ha scagliato la pietra più debole");
			System.out.println("Ma attenzione!");
			System.out.println("I giocatori non sapranno l'equilibrio degli elementi a inzio partita!");
			System.out.println("Vince il giocatore che sconfigge tutti i tamagolem dell'avversario!");
			System.out.println("Ora che le regole sono chiare, Giochiamo!\n");
			break;
		}
	}
	
	public int sceltaLivello() {
		Scanner lettore = new Scanner(System.in);
		Tamagolem tama = new Tamagolem();
		System.out.println("A che livello di difficoltà vuoi giocare?");
		System.out.println("[0] Livello Tama-BASE: Per principianti o deboli di cuore");
		System.out.println("[1] Livello Tama-MEDIO: per giocatori abili");
		System.out.println("[2] Livello Tama-GOLEM: per giocatori assidui e davvero esperti!");
		int risposta = lettore.nextInt();
		if (risposta != 0 && risposta != 1 && risposta != 2) {
			do {
				System.out.println("Non ho capito la risposta!");
				System.out.println("[0] Livello Tama-BASE: Per principianti o deboli di cuore");
				System.out.println("[1] Livello Tama-MEDIO: per giocatori abili");
				System.out.println("[2] Livello Tama-GOLEM: per giocatori assidui e davvero esperti!");
				risposta=lettore.nextInt();
			} while (risposta != 0 && risposta != 1 && risposta != 2);
		}
		int n=0;
		switch(risposta) {
		case 0:
			//n=(int) (Math.ceil(Math.random()*((3-5)+1))+3);
			n=4;
			this.n=n;
			return n;
		case 1: 
			//n=(int) (Math.ceil(Math.random()*((6-8)+1))+6);
			n=7;
			this.n=n;
			return n;
		case 2:
			//n=(int) (Math.ceil(Math.random()*((9-10)+1))+9);
			n=9;
			this.n=n;
			return n;
		}
		
		//tama.setMaxPietreInTama(n);
		//g.setTamagolemTotali(n, tama.getMaxPietreInTama());
		//tama.setPietreTotali(n, g.getTamagolemTotali(),tama.getMaxPietreInTama());
		
		System.out.println(n);
		//System.out.println(tama.getMaxPietreInTama());
		//System.out.println(g.getTamagolemTotali());
		//System.out.println(tama.getPietreTotali());
		return n;
	}
	
	

}
