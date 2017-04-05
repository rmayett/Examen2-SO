public class Piezas extends Thread{
	int[][] mat,B;
	int piezas, empleados;
	public Piezas(int [][] B,int[][] mat,int empleados,int piezas){
		this.mat=mat;
		this.empleados= empleados;
		this.piezas = piezas;
		this.B = B;
	}
        @Override
	public void run(){		
		Main.B=Emp();
	}
	public int [][] Emp(){
  	    for (int j=0; j < empleados; j++) {
                B[piezas][j]=mat[j][piezas];
		System.out.println(getName()+" B[" + piezas + "]" + "[" + j + "] =" + B[piezas][j]);			            
        }
		return B;
	}
}