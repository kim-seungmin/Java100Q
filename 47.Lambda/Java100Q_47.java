@FunctionalInterface
interface Calc { // 함수형 인터페이스의 선언
    public int min(int x, int y); //메서드 두개 이상시 에러
} 

public class Java100Q_47{
	public static void main(String[] args){
        Calc minNum = (x, y) -> x < y ? x : y; // 추상 메소드의 구현
        System.out.println(minNum.min(3, 4));  // 함수형 인터페이스의 사용
    }
}