@FunctionalInterface
interface Calc { // �Լ��� �������̽��� ����
    public int min(int x, int y); //�޼��� �ΰ� �̻�� ����
} 

public class Java100Q_47{
	public static void main(String[] args){
        Calc minNum = (x, y) -> x < y ? x : y; // �߻� �޼ҵ��� ����
        System.out.println(minNum.min(3, 4));  // �Լ��� �������̽��� ���
    }
}