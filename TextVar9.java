public class TextVar9{
	public static void main(String[] args){
		double d = 6;  //自动类型转换
		System.out.println(d);
		int a=(int)6.3;  //强制类型转换
		System.out.println(a);
		
		double d2 = 12+1238L+2.34F+3.23+'a';
		System.out.println(d2);
		
		int i2 = (int)(12+1238L+2.34F+3.23+'a');
		System.out.println(i2);
		
		}
}