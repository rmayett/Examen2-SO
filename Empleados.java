public class Empleados extends Thread{
	int[][] A;
	int renglones,columnas;
	public Empleados(int[][] A,int empleados,int piezas){
		this.A=A;
		this.renglones=empleados;
		this.columnas=piezas;
	}
	public void run(){
		int a=(int) (Math.random()*15);
		for (int j=0;j<columnas;j++) {
			A[renglones][j]=a;		
		}		
	}
}