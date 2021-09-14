/*百钱买百鸡：
公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，
用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。
*/
public class ReviewFor11{
	public static void main(String[] args){
		for(int x = 1;x<=19;x++){
			for(int y = 1;y<=31;y++){
				int z = 100-x-y;
				if((5*x+3*y+1/3*z==100)&&(z%3==0)){
					System.out.println("公鸡，母鸡，小鸡分别要买的个数为："+x+"\t"+y+"\t"+z);
				}
			}
		}
	}
	
}