/*
1*9=9   2*9=18  3*9=27  4*9=36  5*9=45  6*9=54  7*9=63  8*9=72  9*9=81
1*8=8   2*8=16  3*8=24  4*8=32  5*8=40  6*8=48  7*8=56  8*8=64
1*7=7   2*7=14  3*7=21  4*7=28  5*7=35  6*7=42  7*7=49
1*6=6   2*6=12  3*6=18  4*6=24  5*6=30  6*6=36
1*5=5   2*5=10  3*5=15  4*5=20  5*5=25
1*4=4   2*4=8   3*4=12  4*4=16
1*3=3   2*3=6   3*3=9
1*2=2   2*2=4
1*1=1
*/

public class TextFor10{
	public static void main(String[] args){
/*		System.out.print("1*5=5\t");
		System.out.print("2*5=10\t");
		System.out.print("3*5=15\t");
		System.out.print("4*5=20\t");
		System.out.print("5*5=25\t");
		
		for(int i = 1;i<=5;i++){
			System.out.print(i+"*5="+i*5+"\t");			
		}
		System.out.println();
		
		for(int i = 1;i<=4;i++){
			System.out.print(i+"*4="+i*4+"\t");			
		}
		System.out.println();
		
		for(int i = 1;i<=3;i++){
			System.out.print(i+"*3="+i*3+"\t");			
		}
		System.out.println();
		
		for(int i = 1;i<=2;i++){
			System.out.print(i+"*2="+i*2+"\t");			
		}
		System.out.println();
*/		
		
		for(int j = 9;j>=1;j--){
			for(int i = 1;i<=j;i++){
			System.out.print(i+"*"+j+"="+i*j+"\t");			
		}
			System.out.println();
		}
	}
}