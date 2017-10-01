import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String num = new StringBuilder(Integer.toBinaryString(number)).reverse().toString();
        ArrayList<Signal> result = new ArrayList<>();
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1') {
                switch(i) {
                    case 0:
                        result.add(Signal.WINK);
                        break;
                    case 1:
                        result.add(Signal.DOUBLE_BLINK);
                        break;
                    case 2:
                        result.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 3:
                        result.add(Signal.JUMP);
                        break;
                    case 4:
                        Collections.reverse(result);
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }

}
