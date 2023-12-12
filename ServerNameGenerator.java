public class ServerNameGenerator {
    static String[] adjectives={
            "Breathtaking",
            "Enchanting",
            "Majestic",
            "Spectacular",
            "Radiant",
            "Captivating",
            "Serene",
            "Whimsical",
            "Ethereal",
            "Harmonious"
    };

    static String[] nouns = {
            "apple",
            "car",
            "mountain",
            "book",
            "computer",
            "ocean",
            "dog",
            "city",
            "music",
            "sunflower"
    };

    public static void main(String[] args) {
        int adjIndex = (int)( Math.random() * adjectives.length);
        int nounIndex = (int)( Math.random() * nouns.length);

        String serverName = adjectives[adjIndex] + "-" + nouns[nounIndex];
        System.out.println("Here is your server name:\n" + serverName);
    }

}
