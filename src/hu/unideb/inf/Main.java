package hu.unideb.inf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Cube cube = new Cube();
        Rotations rotations = new Rotations();
        Solver solver = new Solver();
        DepthFirstSearch dfs;
        Scramble scramble;
        char inputElement[] = new char[54];
        int scramblesNumber = 8;






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


        //cube.set(inputElement);
        /*System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        System.out.println(solver.whiteCornersAreReady(cube) + " white Corners");
        System.out.println(solver.secondLayerIsReady(cube) + " secondLayer");
        cube.print();
        new Scramble(scramblesNumber, cube);*/

        /*rotations.Rreverse(cube);
        rotations.Dreverse(cube);
        rotations.R(cube);
        rotations.D(cube);
        rotations.Breverse(cube);
        rotations.D(cube);
        rotations.B(cube);
        rotations.F(cube);
        rotations.Dreverse(cube);
        rotations.Freverse(cube);*/
       /* rotations.B(cube);
        rotations.L(cube);
        rotations.F(cube);
        rotations.B(cube)*/
        ;


       /*System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        System.out.println(solver.whiteCornersAreReady(cube) + " white Corners");
        System.out.println(solver.secondLayerIsReady(cube) + " secondLayer");
        cube.print();

        solver.whiteCross(cube);

        System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        System.out.println(solver.whiteCornersAreReady(cube) + " white Corners");
        System.out.println(solver.secondLayerIsReady(cube) + " secondLayer");

        cube.print();

        solver.whiteCorners(cube);

        System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        System.out.println(solver.whiteCornersAreReady(cube) + " white Corners");
        System.out.println(solver.secondLayerIsReady(cube) + " secondLayer");

        cube.print();

        solver.secondLayer(cube);

        System.out.println(cube.isSolved(cube) + " ");
        System.out.println(solver.whiteCrossIsReady(cube) + " cross");
        System.out.println(solver.whiteCornersAreReady(cube) + " white Corners");
        System.out.println(solver.secondLayerIsReady(cube) + " secondLayer");*/

       // cube.print();
       scramble = new Scramble(scramblesNumber, cube);

       // System.out.println("mainben a getrandomscramble: " + scramble.getRandomMoves());

        cube.print();

        String randomSrambleMoves = scramble.getRandomMoves();
        dfs = new DepthFirstSearch(randomSrambleMoves, cube);
        dfs.search();

        System.out.println("Legrovidebb megoldasok: " + dfs.shortestSolutions());

    }
}
