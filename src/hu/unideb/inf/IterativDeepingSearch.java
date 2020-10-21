package hu.unideb.inf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class IterativDeepingSearch {

    Rotations rotation = new Rotations();
    Cube cube = new Cube();
    Scramble scramble;
    Cube tempCube = new Cube();
    private int maxDepth = 3;
    private String solution;
    String randomScrambleMoves;
    /*List<String> solutionsList = new ArrayList<>();
    List<String> shortestSolutionsList = new ArrayList<>();*/
    HashSet<String> solutionsSet = new HashSet<>();
    List<String> shortestSolutionsList = new ArrayList<>();
    ArrayList<String> list = new ArrayList<>();


    public IterativDeepingSearch(String randomScrambleMoves, Cube cube) {
        this.randomScrambleMoves = randomScrambleMoves;
        this.solution = "None";
        this.cube = cube;
    }

    public void search() {
        search(0, "");
    }

    public void search(int currentDepth, String moves) {


        //tempCube = cube;
        //cube.print();
        //tempCube.print();
        char possibleMoves[] = {'L', 'l', 'R', 'r', 'U', 'u', 'D', 'd', 'F', 'f', 'B', 'b'};

        for (Character c : possibleMoves) {
            list.add(c.toString());
        }

        System.out.println(list);
        for (String str : list) {
           // System.out.println(str);
            tempCube = new Cube();
            rotation.movesTranslate(randomScrambleMoves, tempCube);
            rotation.movesTranslate(str, tempCube);
            if (tempCube.isSolved(tempCube)) {
                solution = str;
                solutionsSet.add(solution);

            }
        }
        for (String str : list){
            for(Character c : possibleMoves){
                list.add(str.concat(c.toString()));
            }
        }
        System.out.println(list);




    }

    public List<String> shortestSolutions() {
        String shortest = "";

        List<String> solutionList = new ArrayList<String>(solutionsSet);

        String shortestSolution = solutionList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .findFirst()
                .orElse(null);

        //shortestSolutionsList.add(shortestSolution);

        for (String str : solutionList) {
            if (str.length() == shortestSolution.length()) {
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
