public class TestOpe6{
        public static void main(String[] args){
                // �߼��� ��& ���ɣ�ֻҪ��һ����������false����ô���һ����false
                System.out.println(true&true); //true 
                System.out.println(true&false);//false
                System.out.println(false&false);//false
                System.out.println(false&true);//false
                
                // ��·�룺&& ���ɣ�Ч�ʸ�һЩ��ֻҪ��һ�����ʽ��false����ô�ڶ������ʽ�Ͳ��ü����ˣ����һ����false
                System.out.println(true&&true);//true
                System.out.println(true&&false);//false
                System.out.println(false&&false);//false
                System.out.println(false&&true);//false
                
                // �߼���| ���ɣ�ֻҪ��һ����������true����ô���һ����true
                System.out.println(true|true);//true
                System.out.println(true|false);//true
                System.out.println(false|false);//false
                System.out.println(false|true);//true
                
                // ��·��|| ���ɣ�Ч�ʸ�һЩ��ֻҪ��һ�����ʽ��true����ô�ڶ������ʽ�Ͳ��ü����ˣ����һ����true
                System.out.println(true||true);//true
                System.out.println(true||false);//true
                System.out.println(false||false);//false
                System.out.println(false||true);//true
                
                //�߼��ǣ�   !  ���ɣ��෴���
                System.out.println(!true);//false
                System.out.println(!false);//true
                
                //�߼���� ^  ���ɣ�������������ͬ�����Ϊfalse������ͬ�����Ϊtrue
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