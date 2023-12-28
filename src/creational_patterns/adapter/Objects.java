package creational_patterns.adapter;

public class Objects implements Adapter{

    private  Math adapter;

    public Objects() {
        this.adapter = new Math();
    }

    @Override
    public int twiceOf(int num) {
        System.out.println("정수 2배 적용");
        return (int)this.adapter.twoTimes((float)num);


    }

    @Override
    public int halfOf(int num) {
        System.out.println("정수 1/2배 적용");
        return (int)this.adapter.halfTime((float)num);
    }
}
