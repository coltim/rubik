package hu.unideb.inf;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    Rotations rotation = new Rotations();
    Cube cube = new Cube();
    Scramble scramble;
    Cube tempCube = new Cube();
    private int maxDepth = 8;
    private String solution;
    String randomScrambleMoves;
    List<String> solutionsList = new ArrayList<>();
    List<String> shortestSolutionsList = new ArrayList<>();


    public DepthFirstSearch(String randomScrambleMoves, Cube cube) {
        this.randomScrambleMoves = randomScrambleMoves;
        this.solution = "None";
        this.cube = cube;
    }


    public void search() {
        search(0, "");
    }

    private void search(int currentDepth, String moves) {


        //tempCube = cube;
        //cube.print();
        //tempCube.print();
        char possibleMoves[] = {'L', 'l', 'R', 'r', 'U', 'u', 'D', 'd', 'F', 'f', 'B', 'b'};
        for (char c : possibleMoves) {
            if (currentDepth < maxDepth) {
                search(currentDepth + 1, moves.concat(Character.toString(c)));
            }
        }



        //new Scramble(1, tempCube);
        //tempCube.print();
        tempCube = new Cube();
        rotation.movesTranslate(randomScrambleMoves, tempCube);
        rotation.movesTranslate(moves, tempCube);
        //System.out.println("ez a melysegiben van");

        //System.out.println("proba - " + moves);
        //tempCube.print();
        if (tempCube.whiteCrossIsSolved(tempCube)) {
            solution = moves;
            solutionsList.add(solution);
            System.out.println("megoldas: " + solution);
            return;
        }
    }

    public List<String> shortestSolutions() {
        String shortest = "";

        for (String str : solutionsList) {
            if (str.length() < maxDepth) {
                shortest = str;
            }
        }
        for (String str : solutionsList) {
            if (str.length() == shortest.length()) {
                shortestSolutionsList.add(str);

            }
        }
        return shortestSolutionsList;
    }
}
