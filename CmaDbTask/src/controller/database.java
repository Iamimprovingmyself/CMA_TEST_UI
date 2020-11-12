    package controller;



/**
 *
 * @author Jarvis
 */
    //Здесь я пытался проверить что не так работает,на этом участке кода 
    //Драйвер не отваливался
public class database {
    public static void main(String[] args) {
        String className="com.mysql.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("succes");
            Student student = new Student();
            student.setVisible(true);
        } catch (ClassNotFoundException ex) {
            System.out.println("Failed");
            System.out.println(ex.getMessage());
        }
    }
}
        

