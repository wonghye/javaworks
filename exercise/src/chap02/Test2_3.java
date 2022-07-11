package chap02;

public class Test2_3 {

	public static void main(String[] args) {

		//1 -char가 short보다 큼
		
		//2 - char는 String형으로 변환할 수 없음
		
		//3 
		byte byteValue = 10;
		//byte res = byteValue + byteValue;
		
		//4.
		short s1 = 1, s2 = 2;
		int i3 = 3, i4 = 4;
		//short result = s1 + s2;  //int형으로 계산되므로 오류 발생
		int result = i3 + i4;  
		
		//5.
		char c1 = 'a';
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
		
		//6, 7
		int x = 5, y = 2;
		double result2 = x / (double)y;
		System.out.println(result2);
		
		//8
		double var1 = 3.5, var2 = 2.7;
		int res2 = (int)(var1 + var2);
		System.out.println(res2);
		
		//9
		long v1 = 2L;
		float v2 = 1.8f;
		double v3 = 2.5;
		String v4 = "3.9";
		int res3 = (int)v1 + (int)v2 + (int)(v3 + Double.parseDouble(v4));
		int res4 = (int)v1 + (int)(v2 + v3) + (int)(Double.parseDouble(v4));
		System.out.println(res3 + ", " + res4);
		
		//10
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3 ;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//11
		byte val1 = Byte.parseByte("10");
		int val2 = Integer.parseInt("1000");
		float val3 = Float.parseFloat("20.5");
		double val4 = Double.parseDouble("10");
		
		System.out.println(val1 + ", " + val2 + ", " + val3 + ", " + val4);

	}

}
