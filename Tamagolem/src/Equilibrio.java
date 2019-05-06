import java.util.*;

public class Equilibrio {

	private int n=TamagolemMain.N_ELEMENTI;
	
	private int somma = 0;

	private int[][] equilibrio = new int[n][n];
	
	boolean check = false;
	
	public Equilibrio() {
		for(int i=0;i<n;i++) {
			somma=setSomma(equilibrio[i]);
			for(int j=0;j<n;j++) {
					if(i==j) {
						equilibrio[i][j]=0;
					}else if(j>i)
						if(j!=(n-1)) {
							while(equilibrio[i][j]==0) {
								if(somma==0 && check==false) {
									equilibrio[i][j]=(int) (Math.random()*10);
									equilibrio[j][i]=-equilibrio[i][j];
									somma=somma+equilibrio[i][j];
									check=true;
								}
								if(somma<0 && check==false) {
									equilibrio[i][j]=(int) (Math.random()*10);
									equilibrio[j][i]=-equilibrio[i][j];
									somma=somma+equilibrio[i][j];
									check=true;
								}
								if(somma>0 && check==false) {
									equilibrio[i][j]=-(int) (Math.random()*10);
									equilibrio[j][i]=-equilibrio[i][j];
									somma=somma+equilibrio[i][j];
									check=true;
								}
								check=false;
							}
						}else {
							equilibrio[i][j]=-somma;
							equilibrio[j][i]=somma;
					}
			}
		}
	}
	
	private int setSomma(int row[]) {
		int val=0;
		for(int i=0;i<n;i++) {
			val=val+row[i];
		}
		return val;
	}
	
	
	public void print() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(equilibrio[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public int getDanno(int a1, int a2) {
		int danno=equilibrio[a1][a2];
		return danno;
	}
}
