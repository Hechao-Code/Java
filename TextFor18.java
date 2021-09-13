/*百钱买百鸡：
公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，
用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。
*/
public class TextFor18{
	public static void main(String[] args){
		/*for(int x = 1;x<=100;x++){
			for(int y = 1;y<=100;y++){
				for(int z = 1;z<=100;z++){
					if((5*x+3*y+1/3*z==100)&&(z%3==0)&&(x+y+z==100)){
						System.out.println("公鸡个数："+x+"母鸡个数："+y+"小鸡个数："+z);ja
					}
				}
			}
		}*/
		
		for(int x = 1;x<=19;x++){
			for(int y = 1;y<=31;y++){
				int z = 100-x-y;
				if((5*x+3*y+1/3*z==100)&&(z%3==0)){
					System.out.println("公鸡个数："+x+"母鸡个数："+y+"小鸡个数："+z);
				}
			}
		}			
	}
}