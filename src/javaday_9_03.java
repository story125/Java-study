// �迭 ������׷� ä���
public class javaday_9_03 {

	public static void main(String[] args) {
		
		int [][] a = new int[4][5];
		int count = 0;
		
		for(int i =0; i<4;i++) {	// ��
//			¦������ ���ڰ� ���ʿ��� ���������� ä������ Ȧ������ ���ڰ� �����ʿ��� �������� ä������.
			if(i%2 == 0) {
				for(int j=0;j<5;j++) {	// ��(���� -> ������)
					a[i][j] = ++count;
				}
			}else {
				for(int j=4;j>=0;j--) { // ��(������ -> ����)
					a[i][j] = ++count;
				}
			}
		}	
			for(int i=0;i<4;i++) {
				for(int j=0;j<5;j++) {	
					System.out.printf("%2d ",a[i][j]);
				}
				System.out.println();
			}
			
		
	}
}
