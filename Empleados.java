public class Empleados extends Thread{
	int[][] A;
	int i,piezas;
	public Empleados(int[][] A,int i,int piezas){
		this.A=A;
		this.i=i;
		this.piezas=piezas;
	}
	public void run(){
		Main.A=Emp();
	}
	public int[][] Emp(){
		for (int j=0;j<piezas;j++) {
			A[i][j]=i;			
		}
		return A;
	}

}