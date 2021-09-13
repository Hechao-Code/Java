/*打印三角形
    *
   ***
  *****
 *******
*/
public class TextFor14{
	public static void main(String[] args){
		for(int j = 1;j<=4;j++){ 			//控制行数
			for(int i = 1;i<=(5-j);i++){    	//控制空格数
				System.out.print(" ");
			}   
											
			for(int i = 1;i<=(2*j-1);i++){ 		//控制列数
			System.out.print("*");
		    }	
			
			System.out.println();
		}
		
	}
}