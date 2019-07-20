package ch4.item19;


// 생성자에서 호출하는 메서드를 재정의했을 때의 문제를 보여준다. (126쪽)
public class Super {

    public Super() {
        overrideMe();
    }

    public void overrideMe() {

    }

}
