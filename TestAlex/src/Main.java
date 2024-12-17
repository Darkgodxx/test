import java.util.Scanner;


public class Main {
    static String nameStudent = "Aleksandr";
    static String surnameStudent = "Pronushkin";
    static String workStudent = "QA Engineer";
    static byte typeBytePrint = 127;
    static short typeShortPrint = 200;
    static int typeIntPrint = 1000;
    static float typeFloatPrint = 1366.4F;
    static double typeDoublePrint = 2566.6;
    static long typeLongPrint = 500000;
    static String textForAnalysis = "Test";
    static String textKeywords1 = "Text";
    static String textKeywords2 = "Pass";
    static String textKeywords3 = "Verification";
    static int addIntValueAtText = 5;
    static String addStringValueAtText = "Ueeeee!";
    static String printAddText;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer testStringModefied = new StringBuffer("11. Entered text: " + textForAnalysis + " And Checking");
        testStringModefied.append(" String");
        testStringModefied.append(" Modified");
        System.out.println();
        System.out.println("Byte value: " + typeBytePrint);
        System.out.println("Short value: " + typeShortPrint);
        System.out.println("Int value: " + typeIntPrint);
        System.out.println("Float value: " + typeFloatPrint);
        System.out.println("Double value: " + typeDoublePrint);
        System.out.println("Long value: " + typeLongPrint);
        System.out.println();
        System.out.println("Name Student: " + nameStudent);
        System.out.println("Surname Student: " + surnameStudent);
        System.out.println("Work Student: " + workStudent);
        System.out.println();
        for (int i = 0; i <= i; i++) {
            System.out.println("Text keywords: " + '\n' + textKeywords1 + '\n' + textKeywords2 + '\n' + textKeywords3);
            System.out.println();
            System.out.println("Words in the data base: " + '\n' + textForAnalysis + '\n' + "Input your text for analysis: ");
            System.out.println();
            String inputText = scanner.nextLine();
            System.out.println();
            System.out.println("Result:");
            System.out.println("1. Received text: " + inputText);
            System.out.println("2. Length text: " + inputText.length());
            System.out.println("3. Letter number: ");
            for (int j = 0; j < inputText.length(); j++) {
                System.out.println("Letter number " + j + " in text: " + inputText.charAt(j));
            }
            System.out.println("4. Text match check: " + inputText.equals(textForAnalysis));
            System.out.println("5. Checking for an empty string: " + inputText.isEmpty());
            System.out.println("6. Upper case is ignored: " + inputText.equalsIgnoreCase(textForAnalysis));
            System.out.println("7. Checking entered keywords: " + '\n' + inputText.startsWith(textKeywords1) + '\n' + inputText.contains(textKeywords2) + '\n' + inputText.endsWith(textKeywords3));
            System.out.println("8. Replace words: " + inputText.replace("", "_"));
            System.out.println("9. Converting text to lower case: " + inputText.toLowerCase());
            System.out.println("10. Format text: " + printAddText.format(inputText + " +add new value: %d, and text: %s", addIntValueAtText, addStringValueAtText));
            System.out.println(testStringModefied);
            System.out.println();
        }
    }
}