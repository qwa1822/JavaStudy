package �迭;

public class �ζ� {

	public static void main(String[] args) {

		//index :0~45-1, 0~44��
		int[] ball=new int[45];   //45������ �������� �����ϱ�����
		
		for(int i=0; i<ball.length; i++)
			ball[i]=i+1;   //ball[o]�� 1�� ����
		
		int tmp=0;		//�ΰ��� �ٲٴ� �� ����� ����
		int j=0;     //������ ���� �� ����
		
		
		//�迭��, i��° ��ҿ� �����ǿ�ҿ� ����Ȱ��� ���ιٲ㼭 �������
		//0���� ���� 5���� ��ұ��� ��� 6���� �ٲ۴�.
		
		for(int i=0; i<6; i++) {
			j=(int)(Math.random()*45);    //0~44������ ���Ǻ���
			tmp=ball[i];
			ball[i]=ball[j];
			ball[j]=tmp;
		}
	}

}
