package org.example;


//Encapsulation - Binding of code and data together into a single unit

class Party_detail{
    private String name;  // Sensetive info are stored as private variables, This is Encapsulation
    private int age;
    private String aadhar_num;

    public String getName(){  // Used to retrieve the info
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAadhar_num(){
        return aadhar_num;
    }

    public void setName(String name) {  // Used to set the info/value
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAadhar_num(String aadhar_num) {
        this.aadhar_num = aadhar_num;
    }
}

public class Encapsulation_Examples {
    public static void main(String args[]){

        Party_detail pd = new Party_detail();
        pd.setAge(21);
        pd.setAadhar_num("8362873775267525");
        pd.setName("Karthick");

        System.out.println(pd.getName()+" : "+pd.getAge()+" : "+pd.getAadhar_num());

    }
}
