import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Main m = new Main();
		int empleados,piezas;
		Scanner tec = new Scanner(System.in);
		System.out.println("Dame el numero de empleados: ");
		empleados=tec.nextInt();		
		System.out.println("Dame el numero de piezas: ");
		piezas= tec.nextInt();
		int[][] A = new int[empleados][piezas];
		int[][] B = new int[piezas][empleados];
		m.show(A,empleados,piezas);
		m.show(B,piezas,empleados);

	}
	public void show(int[][] r,int ren,int col){
		for (int i=0;i<ren;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(r[i][j]+" ");
			}			
			System.out.println();
		}

	}
}