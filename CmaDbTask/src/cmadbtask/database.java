package cmadbtask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarvis
 */
public class database {
    public static void main(String[] args) {
        String className="com.mysql.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("succes");
        } catch (ClassNotFoundException ex) {
            System.out.println("Failed");
            System.out.println(ex.getMessage());
        }
    }
    
}
