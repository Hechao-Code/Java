public class TestOpe6{
        public static void main(String[] args){
                // 逻辑与 ：& 规律：只要有一个操作数是false，那么结果一定是false
                System.out.println(true&true); //true 
                System.out.println(true&false);//false
                System.out.println(false&false);//false
                System.out.println(false&true);//false
                
                // 短路与：&& 规律：效率高一些，只要第一个表达式是false，那么第二个表达式就不用计算了，结果一定是false
                System.out.println(true&&true);//true
                System.out.println(true&&false);//false
                System.out.println(false&&false);//false
                System.out.println(false&&true);//false
                
                // 逻辑或：| 规律：只要有一个操作数是true，那么结果一定是true
                System.out.println(true|true);//true
                System.out.println(true|false);//true
                System.out.println(false|false);//false
                System.out.println(false|true);//true
                
                // 短路或：|| 规律：效率高一些，只要第一个表达式是true，那么第二个表达式就不用计算了，结果一定是true
                System.out.println(true||true);//true
                System.out.println(true||false);//true
                System.out.println(false||false);//false
                System.out.println(false||true);//true
                
                //逻辑非：   !  规律：相反结果
                System.out.println(!true);//false
                System.out.println(!false);//true
                
                //逻辑异或： ^  规律：两个操作数相同，结果为false，不相同，结果为true
                System.out.println(true^true);//false
                System.out.println(true^false);//true
                System.out.println(false^false);//false
                System.out.println(false^true);//true
				
				int i=8;
                System.out.println((5>7)&&(i++==2)); //false
                System.out.println(i);   //8
                
                
                int a=8;
                System.out.println((5>7)&(a++==2)); //false
                System.out.println(a); //9
                
                
                int m=8;
                System.out.println((5<7)&&(m++==2)); //false
                System.out.println(m); //9
                
                int b=2;
                System.out.println((5<7)&(b++==2)); //true
                System.out.println(b);  //3
                
                int c=2;
                System.out.println((5<7)&(++c==2)); //false
                System.out.println(c);  //3
        }
}