/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttest;

/**
 *
 * @author cmneville
 */
public class FirstTest {

    public static String hello(int i){
        if(i > 1000)
            return "Hello World!";
        return hello(i + 1);
    }
    public static void main(String[] args) {
        System.out.println(hello(0));
    }
    
}
