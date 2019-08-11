/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;

/**
 *
 * @author HP
 */
public class human {
    public String name;
    public String family;
    public String birthdate;
    public void print(){
        System.out.println("name: "+name+""+family+" birthdate: "+birthdate+"\t");

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the family
     */
    public String getFamily() {
        return family;
    }

    /**
     * @param family the family to set
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * @return the birth date
     */
    public String getBirthdate() {
       
        return birthdate;
    }

    /**
     * @param birthdate the birth date to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    
}
