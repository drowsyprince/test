
import java.util.Scanner;

public class Adder {
	public static int a,b,fa,fb,Cin,s,C,Cout;
	public static void main(String[] args){
		String newLine = System.getProperty("line.separator");
		System.out.print("Please select 1, 2, 3"+ newLine +"1	: Half Adder"+ newLine +"2	: Full Adder"+ newLine +"3	: Truth table"+newLine); 
        Scanner scan = new Scanner(System.in);
        	while(true){
        	int x = scan.nextInt();
        		if(x==1){
					while(true){
						System.out.print("input a : ");
						a = scan.nextInt();
						if(a==0||a==1) break;
						System.out.print("try again"+ newLine);
					}while(true){
						System.out.print("input b : ");
						b = scan.nextInt();
						if(a==0||a==1) break;
						System.out.print("try again"+ newLine);
					}half();
					System.out.print("a	b	s	C"+newLine);
					System.out.print(a+"	"); 
					System.out.print(b+"	"); 
					System.out.print(s+"	"); 
					System.out.print(C);
					
					break;
        		}else if(x==2){
        			while(true){
						System.out.print("input A : ");
						fa = scan.nextInt();
						if(a==0||a==1) break;
						System.out.print("try again"+ newLine);
					}while(true){
						System.out.print("input B : ");
						fb = scan.nextInt();
						if(a==0||a==1) break;
						System.out.print("try again"+ newLine);
					}while(true){
						System.out.print("input Cin : ");
						Cin = scan.nextInt();
						if(a==0||a==1) break;
						System.out.print("try again"+ newLine);
					}full();
					System.out.print("A	B	Cin	S	Cout"+newLine);
					System.out.print(fa+"	"); 
					System.out.print(fb+"	"); 
					System.out.print(Cin+"	"); 
					System.out.print(s+"	"); 
					System.out.print(Cout);
					
					break;
        		}else if(x==3){
					table();
					break;
        		}else {	
					System.out.print("invalid, try again"+ newLine);
        		}
		}
	}
	
	public static void half(){
		int out1,out2;
		if(a==1||b==1){
			out1=1;
		}else{
			out1=0;
		}if(a==1&&b==1){
			C=1;
		}else{
			C=0;
		}if(C==1){
			out2=0;
		}else{
			out2=1;
		}if(out1==1&&out2==1){
			s=1;
		}else{
			s=0;
		}
	}
	
	public static void full(){
		int out3,out4,out5;
		a=Cin;
		b=fb;
		half();
		out3=s;
		out4=C;
		
		a=out4;
		b=fa;
		half();
		out5=s;
		s=C;  //edit w7o2245
		if(out3==1||out5==1){
			Cout=1;
		}else{
			Cout=0;
		}
	}
	
	public static void table(){
		String newLine = System.getProperty("line.separator");
		System.out.print("a	b	s	C"+newLine);
		for(a=1;a==1||a==0;a--){
			for(b=1;b==1||b==0;b--){
				half();
				System.out.print(a+"	"); 
				System.out.print(b+"	"); 
				System.out.print(s+"	"); 
				System.out.print(C+newLine); 
			}
		}
		System.out.print(newLine+"A	B	Cin	S	Cout"+newLine);
		for(fa=1;fa==1||fa==0;fa--){
			for(fb=1;fb==1||fb==0;fb--){
				for(Cin=1;Cin==1||Cin==0;Cin--){
					full();
					System.out.print(fa+"	"); 
					System.out.print(fb+"	"); 
					System.out.print(Cin+"	"); 
					System.out.print(s+"	"); 
					System.out.print(Cout+newLine); 
				}
			}
		}
	}
}
