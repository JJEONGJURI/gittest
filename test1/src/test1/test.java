package test1;

public class test {

	public static void main(String[] args) {
		//�ѱ�
		String str1 = "�ȳ�";
		String str2 = "�ȳ�";
		String str3 = new String("�ȳ�");
		String str4 = new String("�ȳ�");
		String str5 = "abcd";
		String str6 = str4;
		

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		
		System.out.println();
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str6));
		
		System.out.println();
		
		System.out.println("str1 == str2 :" + (str1 == str2));
		System.out.println("str1 == str2 :" + str1 == str2);
		System.out.println(str1 == str3);
		System.out.println("str3 == str4 = " + str3 == str4);
		System.out.println("str3.equals(str4) = "+str3.equals(str4));
		System.out.println("str6 == str : " + (str6==str4));
		
		int a = 1;
		int b = 1;
		System.out.println(a == b);
		
		
	}
}
