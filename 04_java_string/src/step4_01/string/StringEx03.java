package step4_01.string;

/* 
 * 
 * # 문자열 관련 메서드
 * 
 * 1. 문자열.length() 							: 문자열의 길이를 반환한다. (반환타입은 int)
 * 2. 문자열.indexOf("문자열") 					: 특정문자열이 포함된 위치를 반환한다.  (반환타입은 int)
 * 3. 문자열.charAt(?번째)      				: 문자열의 ?번째에에 포함된 데이터를 반환한다. (반환 타입은 char)
 * 4. 문자열.substring(index1이상, index2미만)  : 특정문자열의 index1이상 index2미만의 문자열을 잘라서 반환한다. (반환타입은 String)
 *    문자열.substring(index1)  				: 특정문자열의 index1이상부터 끝까지의 문자열을 잘라서 반환한다. (반환타입은 String)
 * 5. 문자열.split("구분자")					: 구분자로 문자열을 잘라서 반환한다. (반환타입은 String 배열)
 * 
 */

public class StringEx03 {

	public static void main(String[] args) {

		String str = "megait";
		System.out.println(str);
		System.out.println("\n=================\n");
		
		// [1] 문자열의길이 : length()
		System.out.println(str.length());
		int size = str.length();
		System.out.println(size);
		System.out.println("\n=================\n");
		
		// [2] 글자가 포함된 위치 확인 : indexOf("글자")
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("g"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("t"));
		System.out.println("\n=================\n");
		
		// [3] 문자 한개 추출 (인덱싱) : chartAt(index)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		char ch = str.charAt(2);	//(중요) charAt 메서드의 결과는 char자료형이다.
		System.out.println(ch);
		System.out.println(str.charAt(str.length() - 1));
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("\n=================\n");
		
		
		// [4] 문자열 추출 (슬라이싱) : substring()
		
		// 4-1) substring(index1이상 , index2미만)
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(4, 6));
		String subStr = str.substring(2, 4);
		System.out.println(subStr);
		System.out.println();
		
		// 4-2) substring(index1부터 끝까지)
		System.out.println(str.substring(2));
		System.out.println(str.substring(4));
		System.out.println("\n=================\n");
		
		
		// [5] 구분자로 잘라내기 : split("구분자")
		String str1 = "hello,java";
		String str2 = "hello java programing";
		String str3 = "hello@java@programing@megait";
		
		String[] temp = str1.split(",");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		temp = str2.split(" ");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		temp = str3.split("@");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		System.out.println("\n=================\n");
		
		// 참고) 문자열 비교 : compareTo()
		
		String testStr1 = "ac";
		String testStr2 = "dc";
		String testStr3 = "ac";
		
		System.out.println(testStr1.compareTo(testStr2)); // 왼쪽값(기준값)이 작을 경우 음수가 반환된다.
		System.out.println(testStr2.compareTo(testStr1)); // 왼쪽값(기준값)이 작을 경우 양수가 반환된다.
		System.out.println(testStr1.compareTo(testStr3)); // 양쪽값이         같을 경우    0이 반환된다.
		
		
		
	}

}
