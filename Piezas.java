public class Piezas extends Thread{
	int[][] mat;
	int empleados;
	public Piezas(int[][] mat,int empleados){
		this.mat=mat;
		this.empleados= empleados;
	}
	public void run(){		
		Main.B=Emp();
	}
	public int[][] Emp(){
		
	}
}