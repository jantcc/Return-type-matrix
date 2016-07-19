import java.util.Scanner;


public class N {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入螺旋矩阵的长度:");
		int n = in.nextInt();
		//设置螺旋矩阵
		get(n);
		
	}

	private static void get(int n) {
		int a[][] = new int[n][n];
		int i=0,j=0,m=0;
		int num=1;
		if(n%2==0){
			m=n/2;
		}else{
			m=(n/2)+1;
		}
		//2次回环
		for(i=0;i<=m-1;i++){
			//上外围
			for(j=i;j<=n-i-1;j++){
				a[i][j]=num;
				num++;
			}
			//右外围
			for(j=i+1;j<=n-i-1;j++){
				a[j][n-i-1]=num;
				num++;
			}
			//下外围
			for(j=n-i-2;j>=i;j--){
				a[n-i-1][j]=num;
				num++;
			}
			//左外围
			for(j=n-i-2;j>=i+1;j--){
				a[j][i]=num;
				num++;
			}
		}
		
		for(i=0;i<=n-1;i++){
			for(j=0;j<=n-1;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
