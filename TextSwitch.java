/*
实现一个功能：
根据给出的学生分数，判断学生的等级：
>=90  -----A
>=80  -----B
>=70  -----C
>=60  -----D
<60   -----E              
*/
public class TextSwitch{
	public static void main(String[] args){
		//给出学生的分数
		int score = 92;
			
		//根据分数，判断等级
		switch(score/10){
			case 10 : System.out.println("A级");break;
			case 9 : System.out.println("A级");break;
			case 8 : System.out.println("B级");break;
			case 7 : System.out.println("C级");break;
			case 6 : System.out.println("D级");break;
			case 5 : System.out.println("E级");break;
			case 4 : System.out.println("E级");break;
			case 3 : System.out.println("E级");break;
			case 2 : System.out.println("E级");break;
			case 1 : System.out.println("E级");break;
			case 0 : System.out.println("E级");break;
			default : System.out.println("输入错误");
		}
	}
	
}