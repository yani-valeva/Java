import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int index = text.indexOf("://");
        String protocol = "";

        if (index != -1){
            protocol = text.substring(0, index);
            text = text.substring(index + 3);
        }

        index = text.indexOf("/");
        String server = "";
        String resource = "";

        if (index != -1){
            server = text.substring(0, index);
            resource = text.substring(index + 1);
        } else {
            server = text;
        }
        System.out.println(String.format("[protocol] = \"%s\"", protocol));
        System.out.println(String.format("[server] = \"%s\"", server));
        System.out.println(String.format("[resource] = \"%s\"", resource));
    }
}