/**
 * Fig. 3.1: Account.java
 * Account class that contains a name instance variable
 * and methpds to set and get value.ß
 */

public class Account {
    private String name; //instance variable

    //method to set the name in the object
    public void setName(String name)
    {
        this.name=name;
    }

    //method to retrieve the name from the object
    public String getName(){
        return name;
    }
} //end class account
