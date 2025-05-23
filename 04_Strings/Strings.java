public class Strings {

    public static void printLetters(String str){
        for(int i =0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        String fullNam = "Tony Stark";
        System.out.println(fullNam.length());

        // Concatenation
        String firstName = "Shradha";
        String lastName = "Kapra";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(8));
        printLetters(fullName);

        String s1 = "Tony";
        String s2 = new String("Tony");

        if(s1.equals(s2)){
            System.out.println("Both are equal");
        }
    }

}
