import java.util.Scanner;
public class Main{
	public static int[][] A;
	public static int[][] B;
	public static Main m = new Main();
	public static int empleados,piezas;
	public static void main(String[] args) {
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
		for (int k=0;k<empleados;k++) {
			E[k].start();
		}
		/*try {
      		  for (int k=0;k<empleados;k++) {
			E[k].join();}
                } catch (InterruptedException e) {}*/

		Piezas[] P = new Piezas[piezas];
		for(int i=0; i<piezas; i++){
		    P[i] =new Piezas(B,A,empleados,i);
		}
		System.out.println("trasponiendo matriz");	
		try {
      		  for (int k=0;k<piezas;k++) {
      		  	P[k].start();
				P[k].join();}
                } catch (InterruptedException e) {}
                System.out.println("La matriz");
		m.show(A,empleados,piezas);
                System.out.println("La matriz transpuesta");
		m.show(B,piezas,empleados);

	}
	public void show(int[][] r,int ren,int col){		
		for (int i=0;i<ren;i++) {
			for (int j=0;j<col;j++) {
				System.out.print("[" + r[i][j] + "]");
			}			
			System.out.println();
		}

	}
}