public class Classroom {

    public static void main(String[] args) {

        Wilder wilder1 = new Wilder("Jonathan", true);
        Wilder wilder2 = new Wilder("Claire", true);
        Wilder wilder3 = new Wilder("Emma", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());

    }
}
