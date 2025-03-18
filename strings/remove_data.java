package strings;
class Remove {
    void removeSpecialChar(String str) {
       String plainString=str.replaceAll("[^a-zA-z0-9]", "");
       System.out.println(plainString);
    }
    void removeWhiteSpace(String str) {
        String plainString=str.replaceAll("\\s", "");
        System.out.println(plainString);
     }
}

public class remove_data {    public static void main(String[] args) {
    Remove ob = new Remove();

    ob.removeSpecialChar("&Hello!$#World");
    ob.removeWhiteSpace(" Hello World ");

    
}
}
