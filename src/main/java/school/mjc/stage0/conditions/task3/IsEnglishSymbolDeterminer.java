package school.mjc.stage0.conditions.task3;

import java.util.Locale;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (Locale.getDefault().getDisplayLanguage().equals("English")){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
