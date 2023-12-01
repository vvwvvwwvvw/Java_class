package ch02_operator;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		
		//증감 연산사
		int num1 = 10, num2 = 0, num3 = 0;
		System.out.println("num1: " + num1 + "num2: "+ num2 + "num3: " + num3);
		num2 = ++num1;
		System.out.println("num1: " + num1 + "num2: "+ num2 + "num3: " + num3);
		num2 = ++num1;
		num3 = num1++;
		System.out.println("num1: " + num1 + "num2: "+ num2 + "num3: " + num3);
		
		// num1 12 num2 12 num3 0
		// num1 12 num2 12 num3 12
		
		int result1 = num1++ + ++num2;
		System.out.println("num1: " + num1 + "num2: "+ num2 + "num3: " + num3);
		System.out.println(result1);
		// 계산전
		
		// num1 13 num2 13
		
		// 계산 후
		
		// nu1 = 14 + num2 13 + num3= 0
		//result1= 26
		
		
		//논리 연산사
//		System.out.println(true && true);
//		System.out.println(false && false);
//		System.out.println(true || true);
//		
//		boolean bool1 = true;
//		boolean bool2 = false;
//		boolean bool3 = true;
//		
//		System.out.println(bool1 && bool2);
//		//boo12, bool3의 OR 연산 결과를 result 라는 변수에 담고 result 변수값 출력
//		
//		boolean result = bool2 || bool3;
//		System.out.println(result);
//		
//		//num1, num2 정수형 변수에 각각 10, 20을 대입하여 선언하고
//		//num1 > num2 결과를 result1 에 저장하고
//		//num1 != num2 결과를 result2 값에 저장해서
//		// result1 && result2 결과를 result3 에 저장한뒤
//		// result3 의 값을 출력
//		
//		int num1 = 10;
//		int num2 = 20;
//		boolean result1 = num1 > num2;
//		boolean result2 = num1 != num2;
//		boolean result3 = result1 && result2;
//		System.out.println(result3);
//		
//		boolean result4 = (num1 > num2) && (num1 != num2);
//		System.out.println(result4);
//		
//		System.out.println(bool1); // t
//		System.out.println(!bool1); //f
//		System.out.println(bool1 && bool2); //f
//		System.out.println(!bool1 && bool2); //t
//		
//		System.out.println("Not 연산 수행전" + bool2);
//		bool2 = !bool2;
//		System.out.println("Not 연산 수행후" + bool2);
		
		
		
		
		

		
		//대입 연산자
//		int num1 = 10, num2 =7;
//		System.out.println("num1: "+ num1 + "num2: " + num2);
//		// 대입 연산자의 활용
//		num1 += num2; // num1= num1 + num2
//		System.out.println("num1: "+ num1 + "num2: " + num2); //num1:17 , num2:7
//		num1 += num2; // num1= num1 + num2
//		System.out.println("num1: "+ num1 + "num2: " + num2); //num1:24 , num2:7 
//		num1 -= num2; // num1= num1 + num2
//		System.out.println("num1: "+ num1 + "num2: " + num2); //num1:17 , num2:7 
//		num1 *= num2; // num1= num1 + num2
//		System.out.println("num1: "+ num1 + "num2: " + num2); //num1:119 , num2:7 
//		num1 /= num2; // num1= num1 + num2
//		System.out.println("num1: "+ num1 + "num2: " + num2); //num1:17 , num2:7 
		
		
		//비교 연산자
		
//		System.out.println(10>5);
//		System.out.println(10<5);
//		boolean result = 77<=60;
//		System.out.println(result);
//		result = (8 ==100);
//		System.out.println(result);
//		result = false;
//		boolean bool1 = true;
//		//변수값을 다른 변수에 대입하는 것은 복사 개념
//		result = bool1;
//		System.out.println(result);
//		System.out.println(bool1);
		
		
		// 산술연산자
//        /**
//         * num1, num2 두개의 정수형 변수를 선언하고 값은 마음대로
//         * 두 변수의 +,-,*,/,% 연산결과를 print() 를 활용하여 출력해 봅시다
//         * 출력방법
//         * System.out.println(num1 + num2)
//         */
//		int num1 = 15;
//		int num2 = 3;
//		System.out.println("덧셈결과: " +num1+num2); // 앞쪽에 string 변수가 오면 연결에 의미로 받아들임
//		System.out.println("덧셈결과: " +(num1+num2));  // 앞쪽에 string 변수가 오게 하려면 ()를 사용하여 따로 계산하게 만들어 주어야함
//		System.out.println(num1+num2);
//		System.out.println(num1-num2);
//		System.out.println(num1*num2);
//		System.out.println(num1/num2);
//		System.out.println(num1%num2);
//		
//		// 계산 결과를 담을 변수 활용
//		int result = 0;
//		result = num1 + num2;
//		System.out.println(result);
//		result = num1 - num2;
//		System.out.println(result);
//		result = num1 * num2;
//		System.out.println(result);
//		result = num1 / num2;
//		System.out.println(result);
//		result = num1 % num2;
//		System.out.println(result);
//		
//		// 계산 결과 변수를 따로 선언
//		
//		int sumResult = num1 + num2;
//		System.out.println(sumResult);
//		int subResult = num1 - num2;
//		System.out.println(subResult);
//		int mulResult = num1 * num2;
//		System.out.println(mulResult);
//		int divResult = num1 / num2;
//		System.out.println(divResult);
//		int remainResult = num1 % num2;
//		System.out.println(remainResult);
		
		
			

	}

}
