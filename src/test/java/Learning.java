public class Learning{

    public static void combineStrings1(String name, String action){
        System.out.println(name + " " + action);
        System.out.println(name + " " + action);
    }

    public static String combineStrings2(String name, String action){
        String sentence;
        sentence = name + " " + action;
        //System.out.println(name + " " + action);
        return sentence;
    }

    public static void calculete(int digit1, int digit2, String phrase){
        int sum;
        sum = digit1 * digit2 / digit2 + digit1;
        System.out.println(phrase + " " + sum);
    }

    public static void completeCondition(){
        boolean requirement = false;
        System.out.println(requirement);

    }

    public static void typeChars(){
        char latter1 = 'c';
        char letter2 = 'a';
        System.out.println(latter1 + letter2);
    }


    public static void main(String[] args){
        int digit1 = 123;
        int digit2 = 1000;
        String name = "Billy";
        String action = "is moving";
        String result = combineStrings2(name, action);
        //System.out.println(result);
        calculete(digit1,digit2, result);

    }
}
