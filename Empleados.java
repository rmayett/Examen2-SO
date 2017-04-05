public class Empleados extends Thread{
	int[][] A;
	int renglones,columnas;
	public Empleados(int[][] A,int empleados,int piezas){
		this.A=A;
		this.renglones=empleados;
		this.columnas=piezas;
	}
	public void run(){
		Main.A=Emp();
	}
	public int[][] Emp(){
		for (int j=0;j<columnas;j++) {
			A[renglones][j]=(int) (Math.random()*15);
			System.out.println("A[" + renglones + "]" + "[" + j + "] =" + A[renglones][j]);			
		}
		return A;
	}

}