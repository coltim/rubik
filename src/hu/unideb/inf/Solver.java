package hu.unideb.inf;

public class Solver {

    Rotations rotation = new Rotations();

    boolean whiteCrossIsReady(Cube cube) {
        boolean solved = true;
        char center = cube.getElement(40);
        if (cube.getElement(37) != center ||
                cube.getElement(39) != center ||
                cube.getElement(41) != center ||
                cube.getElement(43) != center) {
            solved = false;

        }

        return solved;

    }

    void whiteCross(Cube cube) {
        char whiteEdge = 'w';
        int count = 0;
        while(!whiteCrossIsReady(cube)){
            if(count>4){
                System.out.println("sok");
                rotation.U(cube);
                //break;
            }
            if(cube.getElement(1) == whiteEdge){
                rotation.L(cube);
                rotation.F(cube);
            }else if(cube.getElement(3) == whiteEdge){
                rotation.Breverse(cube);
            }else if(cube.getElement(5) == whiteEdge){
                rotation.F(cube);
            }else if(cube.getElement(7) == whiteEdge){
                rotation.L(cube);
                rotation.Breverse(cube);
            }else if(cube.getElement(10) == whiteEdge){
                rotation.F(cube);
                rotation.R(cube);
            }else if(cube.getElement(12) == whiteEdge){
                rotation.Lreverse(cube);
            }else if(cube.getElement(14) == whiteEdge){
                rotation.R(cube);
            }else if(cube.getElement(16) == whiteEdge){
                rotation.F(cube);
                rotation.Lreverse(cube);
            }else if(cube.getElement(19) == whiteEdge){
                rotation.R(cube);
                rotation.B(cube);
            }else if(cube.getElement(21) == whiteEdge){
                rotation.Freverse(cube);
            }else if(cube.getElement(23) == whiteEdge){
                rotation.B(cube);
            }else if(cube.getElement(25) == whiteEdge){
                rotation.R(cube);
                rotation.Freverse(cube);
            }else if(cube.getElement(28) == whiteEdge){
                rotation.B(cube);
                rotation.L(cube);
            }else if(cube.getElement(30) == whiteEdge){
                rotation.Rreverse(cube);
            }else if(cube.getElement(32) == whiteEdge){
                rotation.L(cube);
            }else if(cube.getElement(34) == whiteEdge){
                rotation.B(cube);
                rotation.Rreverse(cube);
            }else if(cube.getElement(46) == whiteEdge){
                rotation.F(cube);
                rotation.F(cube);
            }else if(cube.getElement(48) == whiteEdge){
                rotation.L(cube);
                rotation.L(cube);
            }else if(cube.getElement(50) == whiteEdge){
                rotation.R(cube);
                rotation.R(cube);
            }else if(cube.getElement(52) == whiteEdge){
                rotation.B(cube);
                rotation.B(cube);
            }
            count++;
        }

        while(!(cube.getElement(1)=='b' && cube.getElement(10)=='o' && cube.getElement(19)=='g' && cube.getElement(28)=='r')){
            if (cube.getElement(1)=='o'){
                rotation.L(cube);
                rotation.L(cube);
                rotation.D(cube);
                rotation.F(cube);
                rotation.F(cube);
                rotation.Dreverse(cube);
                rotation.L(cube);
                rotation.L(cube);

            } else if (cube.getElement(1)=='g'){
                rotation.L(cube);
                rotation.L(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.R(cube);
                rotation.R(cube);
                rotation.Dreverse(cube);
                rotation.L(cube);
                rotation.L(cube);
            }else if (cube.getElement(1)=='r'){
                rotation.L(cube);
                rotation.L(cube);
                rotation.Dreverse(cube);
                rotation.B(cube);
                rotation.B(cube);
                rotation.D(cube);
                rotation.L(cube);
                rotation.L(cube);
            }//narancs-feher
            if (cube.getElement(10)=='r'){
                rotation.F(cube);
                rotation.F(cube);
                rotation.Dreverse(cube);
                rotation.L(cube);
                rotation.L(cube);
                rotation.D(cube);
                rotation.F(cube);
                rotation.F(cube);
            } else if (cube.getElement(10)=='g'){
                rotation.F(cube);
                rotation.F(cube);
                rotation.D(cube);
                rotation.R(cube);
                rotation.R(cube);
                rotation.Dreverse(cube);
                rotation.F(cube);
                rotation.F(cube);
            }else if (cube.getElement(10)=='r'){
                rotation.F(cube);
                rotation.F(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.B(cube);
                rotation.B(cube);
                rotation.Dreverse(cube);
                rotation.F(cube);
                rotation.F(cube);
            }//zold-feher
            if (cube.getElement(19)=='b'){
                rotation.R(cube);
                rotation.R(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.L(cube);
                rotation.L(cube);
                rotation.Dreverse(cube);
                rotation.R(cube);
                rotation.R(cube);
            } else if (cube.getElement(19)=='o'){
                rotation.R(cube);
                rotation.R(cube);
                rotation.Dreverse(cube);
                rotation.F(cube);
                rotation.F(cube);
                rotation.D(cube);
                rotation.R(cube);
                rotation.R(cube);
            }else if (cube.getElement(19)=='r'){
                rotation.R(cube);
                rotation.R(cube);
                rotation.D(cube);
                rotation.B(cube);
                rotation.B(cube);
                rotation.Dreverse(cube);
                rotation.R(cube);
                rotation.R(cube);
            }//piros-feher
            if (cube.getElement(28)=='b'){
                rotation.B(cube);
                rotation.B(cube);
                rotation.D(cube);
                rotation.L(cube);
                rotation.L(cube);
                rotation.Dreverse(cube);
                rotation.B(cube);
                rotation.B(cube);
            } else if (cube.getElement(28)=='o'){
                rotation.B(cube);
                rotation.B(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.F(cube);
                rotation.F(cube);
                rotation.Dreverse(cube);
                rotation.B(cube);
                rotation.B(cube);
            }else if (cube.getElement(28)=='g'){
                rotation.B(cube);
                rotation.B(cube);
                rotation.Dreverse(cube);
                rotation.R(cube);
                rotation.R(cube);
                rotation.D(cube);
                rotation.B(cube);
                rotation.B(cube);
            }
        }

    }
}
