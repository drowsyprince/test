
import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args){
		String newLine = System.getProperty("line.separator");
		Scanner scan = new Scanner(System.in);
		float est=1,qou,mean,x;
		System.out.print("Func Sqrt(x)"+newLine);
		System.out.print("input number: ");
		x = scan.nextFloat();
		while(true){
			qou=x/est;
			mean=(est+qou)/2;
			float check= Math.abs(est*est-x)/x;
			if(check<0.001)break;
			est=mean;
		}
		System.out.printf("Sqrt of %.0f is %.3f",x,mean);
	}
}
