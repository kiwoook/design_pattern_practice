package creational_patterns.factory;

public class Hello {

    public String greeting(){
        Language language = Hello.factory();
        return language.text();
    }

    public static Language factory(){

        // 해당 객체를 교체해서 변경 가능
        return new Korean();
    }

}
