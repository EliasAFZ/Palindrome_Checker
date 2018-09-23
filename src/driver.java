/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Elias
 */
public class driver {

    /**
     * Driver starts up the program and begins the MVC style calls
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Initializing... driver");
        view v = new view();
        model m = new model();
        controller c = new controller(v, m);
    }
}
