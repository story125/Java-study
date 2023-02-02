import java.text.SimpleDateFormat;
import java.util.Date;

public class javaday_12_02 {
	
//		��� ������ ������ ����(static) ��� ������ �ν��Ͻ� ��� ������ �ִµ� �ν��Ͻ� ��� ������ ���� Ŭ������ �����Ǵ� ��� ��ü����
//		������ ��� ������ �������� ���� ��� ������ ���� Ŭ������ �����Ǵ� ��� ��ü���� �����ؼ� ����Ѵ�.
		public static int count;
		private int no;		// ��ü�� ������ �� ���� �ڵ����� 1�� ����	
		private String name;
		private boolean gender;
		private String memo;
		private Date writeDate;		//��ü�� �����Ǵ� ������ ��¥�� �ð�
		
		public javaday_12_02() {
			this("����",false,"����");
		}
		public javaday_12_02(String name, boolean gender, String memo) {
			no = ++count;
			this.name = name;
			this.gender = gender;
			this.memo = memo;
			writeDate = new Date();
		}
//		private �������� �ʱ�ȭ�� ��� ������ Ŭ���� �ܺο��� ������ �� ����.
//		�� ��Ģ�� �ʹ� ������ ���� �ǹǷ� �� ��Ģ�� ���� ���� ������ getter& setter �޼ҵ带 ����ؾ� �Ѵ�.
//		getter�� private ������ ������ ��� ������ ���� ���� �� ����Ѵ�.
//		setter�� private ������ ������ ��� ������ ���� ������ �� ����Ѵ�.

		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isGender() {
			return gender;
		}
		public void setGender(boolean gender) {
			this.gender = gender;
		}
		public String getMemo() {
			return memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public Date getWriteDate() {
			return writeDate;
		}
		public void setWriteDate(Date writeDate) {
			this.writeDate = writeDate;
		}

		
		
		
//		��ü�� ����� ������ ����ؾ� �Ѵٸ� toString() �޼ҵ带 override(������) �Ѵ�.
		 @Override
		 public String toString() {
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
			 return no + ", "+name + "("+(gender ? "��" : "��") +")���� " +sdf.format(writeDate)+" �� ���主 " +memo;
		 }
			}

