
public class Main { //파일명과 같은 클래스 , public
    public static void main(String[] args) { //메인 치고 탭치면 낭옴
       // 자동차 car = new 자동차();
        자동차 car1;  //객체를 담을 변수 생성
        car1= new 자동차(); //객체를 만들고 변수에 담기
        car1.번호 =1;
        car1.최고속력 = 200;

        자동차 car2;  //객체를 담을 변수 생성
        car2= new 자동차(); //객체를 만들고 변수에 담기
        car2.번호 =2;
        car2.최고속력 = 500;

       // System.out.println("Hello world!"); //sout 엔터치면 나옴 //빌드 단축키 -> ctrl+shift+F10
        car1.run ();
        car2.run();
    }
}

class 자동차 {
    int 최고속력;
    int 번호 ;
    void run() { //달리는 메소드
        System.out.println(this.번호 + "번 자동차가 최고속력 " + this.최고속력 + "km로 달립니다.");
    }

}