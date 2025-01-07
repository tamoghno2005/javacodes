class q2 {
    public static void main(String[] args) {
        countVowelsAndConsonants(args); 
    }

    static void countVowelsAndConsonants(String[] args) {
        if (args.length == 0) {
            System.out.println("No input given.");
            return;
        } 

        String name = args[0];
        int vowelCount = 0;
        int consonantCount = 0;
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isLetter(c)) { 
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}