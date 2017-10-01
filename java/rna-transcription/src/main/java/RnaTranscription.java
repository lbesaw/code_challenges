class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();
        dnaStrand.chars().forEach((a) -> {
            switch(a) {
                case 67:
                    result.append("G");
                    break;
                case 71:
                    result.append("C");
                    break;
                case 65:
                    result.append("U");
                    break;
                case 84:
                    result.append("A");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid input");
            }
        });
        return result.toString();

    }

}
