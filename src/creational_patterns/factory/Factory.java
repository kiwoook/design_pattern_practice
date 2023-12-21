package creational_patterns.factory;

public class Factory {

    public static Language getInstance(LangEnum language){
        if (language == LangEnum.ENGLISH){
            return new English();
        } else if (language == LangEnum.KOREAN) {
            return new Korean();
        }
        return null;
    }
}
