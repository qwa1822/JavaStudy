package 배열;

public class 로또 {

	public static void main(String[] args) {

		//index :0~45-1, 0~44개
		int[] ball=new int[45];   //45개으ㅟ 정수값을 저장하기위한
		
		for(int i=0; i<ball.length; i++)
			ball[i]=i+1;   //ball[o]에 1이 저장
		
		int tmp=0;		//두값을 바꾸는 데 사용할 변수
		int j=0;     //임의의 값을 얻어서 저장
		
		
		//배열의, i번째 요소와 임의의요소에 저장된값을 서로바꿔서 값을출력
		//0번쨰 부터 5번쨰 요소까지 모두 6개만 바꾼다.
		
		for(int i=0; i<6; i++) {
			j=(int)(Math.random()*45);    //0~44범위의 임의변수
			tmp=ball[i];
			ball[i]=ball[j];
			ball[j]=tmp;
		}
	}

}
