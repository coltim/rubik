package hu.unideb.inf;

import java.util.ArrayList;
import java.util.List;

public class Scramble {

    Rotations rotation = new Rotations();
    Cube cube = new Cube();
    int selectedRotation;
    int numberOfRotations;
    private String randomMoves = "";

    public String getRandomMoves() {
        return this.randomMoves;
    }

    public Scramble() {

    }

    public Scramble(int numberOfRotations, Cube cube) {

        for (int i = 0; i < numberOfRotations; i++) {
            int selectedRotation = (int) (Math.random() * (12 - 1 + 1) + 1);

            if (selectedRotation == 1) {
                rotation.L(cube);
                randomMoves = randomMoves.concat("L");
            }
            if (selectedRotation == 2) {
                rotation.Lreverse(cube);
                randomMoves = randomMoves.concat("l");
            }
            if (selectedRotation == 3) {
                rotation.R(cube);
                randomMoves = randomMoves.concat("R");
            }
            if (selectedRotation == 4) {
                rotation.Rreverse(cube);
                randomMoves = randomMoves.concat("r");
            }
            if (selectedRotation == 5) {
                rotation.U(cube);
                randomMoves = randomMoves.concat("U");
            }
            if (selectedRotation == 6) {
                rotation.Ureverse(cube);
                randomMoves = randomMoves.concat("u");
            }
            if (selectedRotation == 7) {
                rotation.D(cube);
                randomMoves = randomMoves.concat("D");
            }
            if (selectedRotation == 8) {
                rotation.Dreverse(cube);
                randomMoves = randomMoves.concat("d");
            }
            if (selectedRotation == 9) {
                rotation.F(cube);
                randomMoves = randomMoves.concat("F");
            }
            if (selectedRotation == 10) {
                rotation.Freverse(cube);
                randomMoves = randomMoves.concat("f");
            }
            if (selectedRotation == 11) {
                rotation.B(cube);
                randomMoves = randomMoves.concat("B");
            }
            if (selectedRotation == 12) {
                rotation.Breverse(cube);
                randomMoves = randomMoves.concat("b");
            }


            /*switch (selectedRotation) {
                case 1:
                    rotation.B(cube);
                    System.out.print("B");
                    break;
                case 2:
                    rotation.Breverse(cube);
                    System.out.print("b");
                    break;
                case 3:
                    rotation.D(cube);
                    System.out.print("D");
                    break;
                case 4:
                    rotation.Dreverse(cube);
                    System.out.print("d");
                    break;
                case 5:
                    rotation.F(cube);
                    System.out.print("F");
                    break;
                case 6:
                    rotation.Freverse(cube);
                    System.out.print("f");
                    break;
                case 7:
                    rotation.L(cube);
                    System.out.print("L");
                    break;
                case 8:
                    rotation.Lreverse(cube);
                    System.out.print("l");
                    break;
                case 9:
                    rotation.R(cube);
                    System.out.print("R");
                    break;
                case 10:
                    rotation.Rreverse(cube);
                    System.out.print("r");
                    break;
                case 11:
                    rotation.U(cube);
                    System.out.print("U");
                    break;
                case 12:
                    rotation.Ureverse(cube);
                    System.out.print("u");
                    break;

            }*/

        }

        System.out.print("keveres: " + randomMoves);
        System.out.println();

    }

}
