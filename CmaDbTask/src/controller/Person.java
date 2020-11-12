
package controller;

import java.util.Date;

/**
 *
 * @author Jarvis
 */
class Person {
    private String secondName;
    private String firstName;
    private String surName;
    private String group;
    private String DoB;
    private int iD;
    
    public Person(String secondName, String firstName, 
            String surName,String group, String DoB, int iD) {
        this.secondName=secondName;
        this.firstName=firstName;
        this.surName=surName;
        this.group=group;
        this.DoB=DoB;
        this.iD=iD;
    }
    public String getsecondName(){
        return secondName;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getsurName(){
        return surName;
    }
    public String getgroup(){
        return group;
    }
    public String getDoB(){
        return DoB;
    }
    public int getiD() {
        return iD;
    }
    
}
