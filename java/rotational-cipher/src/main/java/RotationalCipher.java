public class RotationalCipher {
    int key;
    final int capA = 65;
    final int capZ = 90;
    final int lowA = 97;
    final int lowZ = 122;

    public RotationalCipher(int key) {
        this.key = key;
    }

    public String rotate(String str) {
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= capA && chars[i] <= capZ) {
                if(chars[i] + key > capZ)
                    chars[i] = (char) (capA + ((chars[i]+key)-91));
                else
                    chars[i] = (char) (chars[i]+key);
            }
            else if(chars[i] >= lowA && chars[i] <= lowZ) {
                if (chars[i] + key > lowZ)
                    chars[i] = (char) (lowA + ((chars[i] + key) - 123));
                else
                    chars[i] = (char) (chars[i] + key);
            }
            else chars[i] = chars[i];
            }

        return String.valueOf(chars);
    }
}
