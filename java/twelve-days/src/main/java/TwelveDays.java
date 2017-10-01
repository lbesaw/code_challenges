class TwelveDays {

    String[][] verses = {
            {"first", "a Partridge in a Pear Tree"},
            {"second", "two Turtle Doves"},
            {"third", "three French Hens"},
            {"fourth", "four Calling Birds"},
            {"fifth", "five Gold Rings"},
            {"sixth", "six Geese-a-Laying"},
            {"seventh", "seven Swans-a-Swimming"},
            {"eighth", "eight Maids-a-Milking"},
            {"ninth", "nine Ladies Dancing"},
            {"tenth", "ten Lords-a-Leaping"},
            {"eleventh", "eleven Pipers Piping"},
            {"twelfth", "twelve Drummers Drumming"}
    };

    String verse(int verseNumber) {
        StringBuilder result = new StringBuilder("On the "+ verses[verseNumber-1][0] +" day of Christmas my true love gave to me, ");

        for(int i = verseNumber - 1; i >= 0; i--) {
            if(i == 0 && verseNumber != 1)
                result.append("and ");
            result.append(verses[i][1]);
            if(i > 0) {
                result.append(", ");
            }
        }

        return result.append(".\n").toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder result = new StringBuilder();
        for(int i = startVerse; i <= endVerse; i++) {
            result.append(verse(i));
            if(i != endVerse)
                result.append("\n");
        }
        return result.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
}
