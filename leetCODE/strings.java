public class strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your name:");
        // String name = sc.nextLine();
        // System.out.println("your name is:" + name);
        String firstname = "Shikhar";
        String lastname = " Singh";
        String fullname = firstname + lastname;
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}