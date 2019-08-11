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
public class Sample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        student st1 = new student();
        st1.name= "joe";
        st1.family= "macbay";
        st1.number=2262;
        st1.birthdate= "2.2.1992";
        st1.print();
        st1.print1();
        
        student st2 = new student();
        st2.name="lisa";
        st2.family="lockwood";
        st2.birthdate="3.10.1991";
        st2.number=9413;
        st2.print();
        st2.print1();
        
        teacher te = new teacher();
        te.name="alec";
        te.family="madden";
        te.rank= 1223;
        te.birthdate="3.11.1975";
        te.print();
        te.print2();
        
        teacher te2 = new teacher();
        te2.name="tom";
        te2.family="sherwood";
        te2.birthdate="17.9.1958";
        te2.rank=647;
        te2.print();
        te2.print2();
        
    }
    
}
