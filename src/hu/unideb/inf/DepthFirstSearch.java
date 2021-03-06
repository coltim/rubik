package hu.unideb.inf;

import java.util.*;

public class DepthFirstSearch {

    Rotations rotation = new Rotations();
    Cube cube = new Cube();
    Scramble scramble;
    Cube tempCube = new Cube();
    private int maxDepth = 6;
    private String solution;
    String randomScrambleMoves;
    /*List<String> solutionsList = new ArrayList<>();
    List<String> shortestSolutionsList = new ArrayList<>();*/
    HashSet<String> solutionsSet = new HashSet<>();
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

        //System.out.println(moves);
        //tempCube.print();
        if (tempCube.isSolved(tempCube)) {
            //tempCube.print();
            solution = moves;
            solutionsSet.add(solution);
           // System.out.println("megoldas: " + solution);
           // System.out.println(solutionsSet.size());

        }
    }

    public List<String> shortestSolutions() {
        String shortest = "";

        List<String> solutionList = new ArrayList<String>(solutionsSet);

        String shortestSolution = solutionList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .findFirst()
                .orElse(null);

        //shortestSolutionsList.add(shortestSolution);

        for(String str : solutionList) {
            if(str.length() == shortestSolution.length()) {
                shortestSolutionsList.add(str);
            }
        }

        /*for (String str : solutionsSet) {
            if (str.length() < maxDepth) {
                shortest = str;
            }
        }
        for (String str : solutionsSet) {
            if (str.length() == shortest.length()) {
                shortestSolutionsList.add(str);

            }
        }*/
        return shortestSolutionsList;
    }
}
