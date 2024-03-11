package stratagy;

import java.util.Scanner;

enum Week {
    SUNDAY{
        @Override
        public String get() {
            return "일요일";
        }
    },
    MONDAY {
        @Override
        public String get() {
            return "월요일";
        }
    },
    TUESDAY {
        @Override
        public String get() {
            return "화요일";
        }
    },
    WEDNESDAY {
        @Override
        public String get() {
            return "수요일";
        }
    },
    THURSDAY {
        @Override
        public String get() {
            return "목요일";
        }
    },
    FRIDAY {
        @Override
        public String get() {
            return "금요일";
        }
    },
    SATURDAY {
        @Override
        public String get() {
            return "토요일";
        }
    };

    public abstract String get();
}

public class Calender {
    public static String calender(Week opcode) {
        return opcode.get();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("오늘은 무슨 요일?");
        System.out.println(Calender.calender(Week.valueOf(sc.next())));
    }
}
