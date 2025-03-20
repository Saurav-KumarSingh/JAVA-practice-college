package strings;
class RemoveDuplicate{
    void Remove1(String str){
        StringBuilder builder=new StringBuilder();
        str.chars().distinct().forEach(data->builder.append((char)data));
        System.out.println(builder);
    }
    void Remove2(String str){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int idx=str.indexOf(ch,i+1);
            if (idx==-1) {
                builder.append(ch);
            }

        }
        System.out.println(builder);
    }
    void Remove3(String str){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean repeat=false;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    repeat=true;
                    break;
                }
            }
            if(!repeat){
                builder.append(str.charAt(i));
            }

        }
        System.out.println(builder);
    }
}
public class remove_duplicate {
    public static void main(String[] args) {

        RemoveDuplicate ob= new RemoveDuplicate();
        ob.Remove1("Saurav");
        ob.Remove2("Saurav");
        ob.Remove3("Saurav");
    }
}
