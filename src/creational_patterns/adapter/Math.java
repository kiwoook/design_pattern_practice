package creational_patterns.adapter;

public class Math {

    public float twoTimes(float num){
        System.out.println("실수 2배 적용");
        return num*2;
    }

    public float halfTime(float num){
        System.out.println("실수 1/2배 적용");
        return num/2;
    }
}
