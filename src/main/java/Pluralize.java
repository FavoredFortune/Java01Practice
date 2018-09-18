public class Pluralize {
    public static void main(String[] args) {

    }

    public static String pluralize(String string, int number){
        if(string == ""){
            return "I own no animals";
        }
        if(number <= 0){
            return "I own " + number +" "+ string+"s";
        }
        if(number == 1){
            return "I own " + number +" "+ string;
        }
        if(number > 1){
            return "I own " + number +" "+ string+"s";
        }
        return "I own no animals";
    }
}
