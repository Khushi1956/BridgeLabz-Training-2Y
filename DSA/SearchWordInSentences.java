public class SearchWordInSentences {
    public static String search(String[] sentences, String word) {
        for (String s : sentences) {
            if (s.contains(word)) return s;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful",
            "Python is easy",
            "I love programming"
        };

        System.out.println(search(sentences, "Python"));
    }
}
