public class Removechar {
    public static String removeCharacter(String Str, char character) {
        return Str.replaceAll(Character.toString(character), "");
    }

    public static void main(String[] args) {
        String Str = "Hello World!";
        char characterToRemove = 'o';
        String result = removeCharacter(Str, characterToRemove);
        System.out.println(result);
    }
}