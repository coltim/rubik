package hu.unideb.inf;


public class Cube {
    private char element[] = new char[54];


    public Cube(){
    }

    public char getElement(int index) {
        return element[index];
    }

    public void setElement(int index, char element) {
        this.element[index] = element;
    }

    public void set(char inputElement[]){
        for (int i = 0; i<inputElement.length; i++) {
            element[i] = inputElement[i];
        }
    }

    public boolean isSolved(Cube cube){
        boolean solved = true;
        for(int j = 0; j <= 45; j+=9 ){
            for(int i = 0; i <= 8; i++){
                if(cube.getElement(i + j) != cube.getElement(4 + j)){
                    solved = false;
                    break;
                }

        }

        }
        return solved;
    }

    public void print(){
        System.out.println("         |" + "-------|");
        System.out.println(
                "         | " + element[36] + " " + element[37] + " " + element[38] + " |");
        System.out.println(
                "         | " + element[39] + " " +element[40] + " " +element[41] + " |");
        System.out.println(
                "         | " +element[42] + " " +element[43] + " " +element[44] + " |");
        System.out.println(" |-------|" + "-------|" + "-------|" + "-------|");
        System.out.println(" | " + element[0]  + " " + element[1] + " " + element[2] + " | "
                                 + element[9] + " " + element[10] + " " + element[11] + " | "
                                 + element[18] + " " + element[19] + " " + element[20] + " | "
                                 + element[27] + " " + element[28] + " " + element[29] + " | ");
        System.out.println(" | " + element[3] + " " + element[4] + " " + element[5] + " | "
                                 + element[12] + " " + element[13] + " " + element[14] + " | "
                                 + element[21] + " " + element[22] + " " + element[23] + " | "
                                 + element[30] + " " + element[31] + " " + element[32] + " | ");
        System.out.println(" | " + element[6] + " " + element[7] + " " + element[8] + " | "
                                 + element[15] + " " + element[16] + " " + element[17] + " | "
                                 + element[24] + " " + element[25] + " " + element[26] + " | "
                                 + element[33] + " " + element[34] + " " + element[35] + " | ");
        System.out.println(" |-------|" + "-------|" + "-------|" + "-------|");
        System.out.println(
                "         | " + element[45] + " " + element[46] + " " + element[47] + " |");
        System.out.println(
                "         | " + element[48] + " " + element[49] + " " + element[50] + " |");
        System.out.println(
                "         | " + element[51] + " " + element[52] + " " + element[53] + " |");
        System.out.println("         |" + "-------|\n");
    }

}
