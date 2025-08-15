import java.util.Scanner;
import java.util.Random;

public class h9ii_build_a_respons {

    private static final String[] automationScripts = {"Python", "JavaScript", "Java", "C++"};
    private static final String[] automationTypes = {"Web", "Mobile", "Desktop", "API"};
    private static final String[] automationResponses = {"OK", "Error", "Success", "Failed"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Automation Script Generator!");
        System.out.print("Enter automation script type (1-" + automationScripts.length + "): ");
        int scriptType = scanner.nextInt();
        System.out.print("Enter automation type (1-" + automationTypes.length + "): ");
        int automation = scanner.nextInt();

        String script = generateScript(automationScripts[scriptType - 1], automationTypes[automation - 1]);
        System.out.println("Generated Script: \n" + script);

        System.out.print("Do you want to generate response? (y/n): ");
        char response = scanner.next().charAt(0);
        if (response == 'y') {
            String respons = generateResponse(automationResponses[random.nextInt(automationResponses.length)]);
            System.out.println("Generated Response: " + respons);
        }
    }

    private static String generateScript(String scriptType, String automationType) {
        // TO DO: implement script generation logic based on scriptType and automationType
        return "Generated Script for " + scriptType + " " + automationType;
    }

    private static String generateResponse(String response) {
        // TO DO: implement response generation logic based on response
        return "Generated Response: " + response;
    }
}