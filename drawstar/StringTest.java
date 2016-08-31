
import java.util.Scanner;

public class StringTest {


	String answers[] =new String[3073];

	void drawStar(StringTest st,int n){

		if(n==3){  
			answers[1]= "*";
			answers[2]= "* *";
			answers[3]= "*****";
			return;
		}
		drawStar(st, n/2);
		int space=n-1;
		for(int i=(n/2)+1; i<=n;i++){

			answers[i]=answers[i-n/2]+st.makevoid(space)+answers[i-n/2];
			space-=2;
		} 
		return;



	}

	String makevoid(int n){
		int tmp=0;
		String space=" ";
		while(tmp<n-1){
			space+=" ";
			tmp ++;
		}

		return space;
	}


	public static void main (String args[]){

		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();


		StringTest st = new StringTest();
		st.drawStar(st,input);
		for(int i=1; i<=input ; i++){

			for (int k=i;k<input;k++){

				System.out.print(" ");

			}
			System.out.println(st.answers[i]);


		}
		sc.close();

	}

}
