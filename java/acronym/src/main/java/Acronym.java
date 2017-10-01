import java.util.regex.Pattern;

class Acronym {
    private String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder result = new StringBuilder();
        phrase = Pattern.compile("[.!?\\-]").matcher(phrase).replaceAll(" ");
        String[] stringArr = phrase.split(" ");
        for( String s : stringArr )
            result.append(s.trim().charAt(0));

        return result.toString().toUpperCase();
    }

}
