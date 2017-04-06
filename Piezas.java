public class Piezas extends Thread{
	int[][] mat,B;
	int piezas, empleados;
	public Piezas(int [][] B,int[][] mat,int empleados,int piezas){
		this.mat=mat;
		this.empleados= empleados;
		this.piezas = piezas;
		this.B = B;
	}
	public void run(){	
	int j;			
		 for (j=0; j < empleados; j++) {
                B[piezas][j]=mat[j][piezas];	            
        }        
		System.out.println("Soy hilo: "+getName()+" hice la columna "+piezas);
		Main.m.show(Main.B,Main.piezas,Main.empleados);
		System.out.println();
	}
}