public class P0203 {
    public static void main(String[] args) {
        byte b = 127;
        int i =100;
        System.out.println(b+i);
        System.out.println(10/4);   // 정수 나누기
        System.out.println(10.0/4);  // 실수 나누기
        System.out.println((char)0x12340041);  // char로 변환, 0x0041. 정수는 65
        System.out.println((byte)(b + i));    // 227의 16진수 0xE3*
        System.out.println((int)2.9 + 1.8);   // 2 + 1.8
        System.out.println((int)(2.9 + 1.8));   // 4.7의 정수
        System.out.println((int)2.9 + (int)1.8);
    }
    // 결과값 227, 2, 2.5, A, -29, 3.8, 4, 3
}