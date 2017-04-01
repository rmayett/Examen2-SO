import java.util.Scanner;
public class Main{
	public static int[][] A;
	public static int[][] B;
	public static void main(String[] args) {
		Main m = new Main();
		int empleados,piezas;
		Scanner tec = new Scanner(System.in);
		System.out.println("Dame el numero de empleados: ");
		empleados=tec.nextInt();		
		System.out.println("Dame el numero de piezas: ");
		piezas= tec.nextInt();
		A = new int[empleados][piezas];
		B = new int[piezas][empleados];
		Empleados[] E = new Empleados[empleados];
		for (int i =0;i<empleados;i++) {
			E[i] = new Empleados(A,i,piezas);			
		}
		for (int j=0;j<empleados;j++) {
			E[j].start();
		}
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