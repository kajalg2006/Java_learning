class M{
     public static void main(String[] args) {
        Pattern p = Pattern.compile("\d");
        Matcher m = p.matcher("om is in class 7th and he scored 82%");

        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }
}

// M.java:3: error: illegal escape character
//         Pattern p = Pattern.compile("\d");
//                                       ^
// 1 error