public class App {
    static boolean IwillGraduate = true;
    static boolean IwillBehave = true;


    public static void main(String[] args) throws Exception{
        
        //precondition
        assert IwillBehave == true: "Inom ng Inom";

        College();

        //postcondition
        assert IwillGraduate == true: "Hope So!";

        System.out.println("Ralph Ibn Jheio Bugarin");
    }

    static void College() {
        IwillGraduate = false;
        System.out.println("College life!");
    }
 }

