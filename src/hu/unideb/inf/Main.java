package hu.unideb.inf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Cube cube = new Cube();
        Rotations rotations = new Rotations();
        Solver solver = new Solver();
        Scramble scramble;
        char inputElement[] = new char[54];


        for (int i = 0; i <= 8; i++){
            inputElement[i] = 'b';
        }
        for (int i = 9; i <= 17; i++){
            inputElement[i] = 'o';
        }
        for (int i = 18; i <= 26; i++){
            inputElement[i] = 'g';
        }
        for (int i = 27; i <=35; i++){
            inputElement[i] = 'r';
        }
        for (int i = 36; i <= 44; i++){
            inputElement[i] = 'w';
        }
        for (int i = 45; i <= 53; i++){
            inputElement[i] = 'y';
        }



      /*  Scanner in = new Scanner(System.in);
        String input = "";
        System.out.println("add meg a kek oldalt");
        for (int i = 0; i <= 8; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a narancs oldalt");
        for (int i = 9; i <= 17; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a zold oldalt");
        for (int i = 18; i <= 26; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a piros oldalt");
        for (int i = 27; i <=35; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a feher oldalt");
        for (int i = 36; i <= 44; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);

        }System.out.println("add meg a citrom oldalt");
        for (int i = 45; i <= 53; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }*/


        cube.set(inputElement);
        System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        cube.print();
        new Scramble(20, cube);
        
        /*rotations.R(cube);
        rotations.D(cube);
        rotations.U(cube);
        rotations.R(cube);
        rotations.D(cube);
        rotations.U(cube);
        rotations.Freverse(cube);
        rotations.Breverse(cube);
        rotations.Dreverse(cube);
        rotations.D(cube);
        rotations.U(cube);
        rotations.Freverse(cube);*/


        System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        cube.print();

        solver.whiteCross(cube);

        System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        cube.print();


    }
}
