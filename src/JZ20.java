import java.util.HashMap;
import java.util.Map;

// 判断一个字符串是否为数字
public class JZ20 {
    enum State {
        State_Init,
        State_INT_SIGN,
        STATE_INT,
        STATE_POINT_INT,
        STATE_POINT_WITHOUT_INT,
        STATE_FRACTION,
        STATE_E,
        STATE_E_SIGN,
        STATE_E_NUMBER,
        STATE_END,
    }

    enum CharType {
        CHAR_SPACE,
        CHAR_SIGN,
        CHAR_DIGIT,
        CHAR_E,
        CHAR_POINT,
        CHAR_ILLEGAL,
    }
    public boolean isNumber(String s) {
        Map<State, Map<CharType, State>> transfer = new HashMap<>();

        Map<CharType, State> initMap = new HashMap<>() {{
            put(CharType.CHAR_SPACE, State.State_Init);
            put(CharType.CHAR_SIGN, State.State_INT_SIGN);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
            put(CharType.CHAR_DIGIT, State.STATE_INT);
        }};

        transfer.put(State.State_Init, initMap);

        Map<CharType, State> intSignMap = new HashMap<>() {{
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
            put(CharType.CHAR_DIGIT, State.STATE_INT);
        }};
        transfer.put(State.State_INT_SIGN, intSignMap);

        Map<CharType, State> intMap = new HashMap<>() {{
            put(CharType.CHAR_POINT, State.STATE_POINT_INT);
            put(CharType.CHAR_DIGIT, State.STATE_INT);
            put(CharType.CHAR_SPACE, State.STATE_END);
            put(CharType.CHAR_E, State.STATE_E);
        }};
        transfer.put(State.STATE_INT, intMap);

        Map<CharType, State> pointWithoutIntMap = new HashMap<>() {{
            put(CharType.CHAR_DIGIT, State.STATE_FRACTION);
        }};
        transfer.put(State.STATE_POINT_WITHOUT_INT, pointWithoutIntMap);


        Map<CharType, State> pointIntMap = new HashMap<>() {{
            put(CharType.CHAR_DIGIT, State.STATE_FRACTION);
            put(CharType.CHAR_SPACE, State.STATE_END);
            put(CharType.CHAR_E, State.STATE_E);
        }};
        transfer.put(State.STATE_POINT_INT, pointIntMap);

        Map<CharType, State> fractionMap = new HashMap<>() {{
            put(CharType.CHAR_DIGIT, State.STATE_FRACTION);
            put(CharType.CHAR_SPACE, State.STATE_END);
            put(CharType.CHAR_E, State.STATE_E);
        }};
        transfer.put(State.STATE_FRACTION, fractionMap);

        Map<CharType, State> eMap = new HashMap<>() {{
            put(CharType.CHAR_SIGN, State.STATE_E_SIGN);
            put(CharType.CHAR_DIGIT, State.STATE_E_NUMBER);
        }};
        transfer.put(State.STATE_E, eMap);

        Map<CharType, State> eSignMap = new HashMap<>() {{
            put(CharType.CHAR_DIGIT, State.STATE_E_NUMBER);
        }};
        transfer.put(State.STATE_E_SIGN, eSignMap);

        Map<CharType, State> eNumberMap = new HashMap<>() {{
            put(CharType.CHAR_DIGIT, State.STATE_E_NUMBER);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_E_NUMBER, eNumberMap);

        Map<CharType, State> endMap = new HashMap<>() {{
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_END, endMap);

        int length = s.length();
        State state = State.State_Init;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (!transfer.get(state).containsKey(toCharType(ch))) {
                // 在当前状态下对于该字符没有对应的转移规则，所以接收失败
                return false;
            } else {
                // 进行状态转移
                state = transfer.get(state).get(toCharType(ch));
            }
        }

        // 接收完全部字符后，判断当前是否处于接收状态
        return state == State.STATE_INT || state == State.STATE_FRACTION || state == State.STATE_POINT_INT || state == State.STATE_E_NUMBER || state == State.STATE_END;
    }

    public CharType toCharType(char ch) {
        if (ch >= '0' && ch <= '9') {
            return CharType.CHAR_DIGIT;
        } else if (ch == 'e' || ch == 'E') {
            return CharType.CHAR_E;
        } else if (ch == '.') {
            return CharType.CHAR_POINT;
        } else if (ch == ' ') {
            return CharType.CHAR_SPACE;
        } else if (ch == '+' || ch == '-') {
            return CharType.CHAR_SIGN;
        } else {
            return CharType.CHAR_ILLEGAL;
        }
    }
}
