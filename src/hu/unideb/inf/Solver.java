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

    boolean whiteCornersAreReady(Cube cube) {
        boolean solved = true;
        char center = cube.getElement(40);
        if (cube.getElement(36) != center ||
                cube.getElement(38) != center ||
                cube.getElement(42) != center ||
                cube.getElement(44) != center ||
                cube.getElement(0) != cube.getElement(4) ||
                cube.getElement(2) != cube.getElement(4) ||
                cube.getElement(9) != cube.getElement(13) ||
                cube.getElement(11) != cube.getElement(13) ||
                cube.getElement(18) != cube.getElement(22) ||
                cube.getElement(20) != cube.getElement(22) ||
                cube.getElement(27) != cube.getElement(31) ||
                cube.getElement(29) != cube.getElement(31)) {
            solved = false;

        }

        return solved;

    }

    void whiteCross(Cube cube) {
        char whiteEdge = 'w';
        int count = 0;
        while (!whiteCrossIsReady(cube)) {
            if (count > 4) {
                System.out.println("sok");
                rotation.U(cube);
                //break;
            }
            if (cube.getElement(1) == whiteEdge) {
                rotation.L(cube);
                rotation.F(cube);
            } else if (cube.getElement(3) == whiteEdge) {
                rotation.Breverse(cube);
            } else if (cube.getElement(5) == whiteEdge) {
                rotation.F(cube);
            } else if (cube.getElement(7) == whiteEdge) {
                rotation.L(cube);
                rotation.Breverse(cube);
            } else if (cube.getElement(10) == whiteEdge) {
                rotation.F(cube);
                rotation.R(cube);
            } else if (cube.getElement(12) == whiteEdge) {
                rotation.Lreverse(cube);
            } else if (cube.getElement(14) == whiteEdge) {
                rotation.R(cube);
            } else if (cube.getElement(16) == whiteEdge) {
                rotation.F(cube);
                rotation.Lreverse(cube);
            } else if (cube.getElement(19) == whiteEdge) {
                rotation.R(cube);
                rotation.B(cube);
            } else if (cube.getElement(21) == whiteEdge) {
                rotation.Freverse(cube);
            } else if (cube.getElement(23) == whiteEdge) {
                rotation.B(cube);
            } else if (cube.getElement(25) == whiteEdge) {
                rotation.R(cube);
                rotation.Freverse(cube);
            } else if (cube.getElement(28) == whiteEdge) {
                rotation.B(cube);
                rotation.L(cube);
            } else if (cube.getElement(30) == whiteEdge) {
                rotation.Rreverse(cube);
            } else if (cube.getElement(32) == whiteEdge) {
                rotation.L(cube);
            } else if (cube.getElement(34) == whiteEdge) {
                rotation.B(cube);
                rotation.Rreverse(cube);
            } else if (cube.getElement(46) == whiteEdge) {
                rotation.F(cube);
                rotation.F(cube);
            } else if (cube.getElement(48) == whiteEdge) {
                rotation.L(cube);
                rotation.L(cube);
            } else if (cube.getElement(50) == whiteEdge) {
                rotation.R(cube);
                rotation.R(cube);
            } else if (cube.getElement(52) == whiteEdge) {
                rotation.B(cube);
                rotation.B(cube);
            }
            count++;
            //cube.print();
        }
        //feher el bent van, de rossz helyen
        while (!(cube.getElement(1) == 'b' && cube.getElement(10) == 'o' && cube.getElement(19) == 'g' && cube.getElement(28) == 'r')) {
            if (cube.getElement(1) == 'o') {
                rotation.L(cube);
                rotation.L(cube);
                rotation.D(cube);
                rotation.F(cube);
                rotation.F(cube);
                rotation.Dreverse(cube);
                rotation.L(cube);
                rotation.L(cube);

            } else if (cube.getElement(1) == 'g') {
                rotation.L(cube);
                rotation.L(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.R(cube);
                rotation.R(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.L(cube);
                rotation.L(cube);
            } else if (cube.getElement(1) == 'r') {
                rotation.L(cube);
                rotation.L(cube);
                rotation.Dreverse(cube);
                rotation.B(cube);
                rotation.B(cube);
                rotation.D(cube);
                rotation.L(cube);
                rotation.L(cube);
            }//narancs-feher
            if (cube.getElement(10) == 'b') {
                rotation.F(cube);
                rotation.F(cube);
                rotation.Dreverse(cube);
                rotation.L(cube);
                rotation.L(cube);
                rotation.D(cube);
                rotation.F(cube);
                rotation.F(cube);
            } else if (cube.getElement(10) == 'g') {
                rotation.F(cube);
                rotation.F(cube);
                rotation.D(cube);
                rotation.R(cube);
                rotation.R(cube);
                rotation.Dreverse(cube);
                rotation.F(cube);
                rotation.F(cube);
            } else if (cube.getElement(10) == 'r') {
                rotation.F(cube);
                rotation.F(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.B(cube);
                rotation.B(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.F(cube);
                rotation.F(cube);
            }//zold-feher
            if (cube.getElement(19) == 'b') {
                rotation.R(cube);
                rotation.R(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.L(cube);
                rotation.L(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.R(cube);
                rotation.R(cube);
            } else if (cube.getElement(19) == 'o') {
                rotation.R(cube);
                rotation.R(cube);
                rotation.Dreverse(cube);
                rotation.F(cube);
                rotation.F(cube);
                rotation.D(cube);
                rotation.R(cube);
                rotation.R(cube);
            } else if (cube.getElement(19) == 'r') {
                rotation.R(cube);
                rotation.R(cube);
                rotation.D(cube);
                rotation.B(cube);
                rotation.B(cube);
                rotation.Dreverse(cube);
                rotation.R(cube);
                rotation.R(cube);
            }//piros-feher
            if (cube.getElement(28) == 'b') {
                rotation.B(cube);
                rotation.B(cube);
                rotation.D(cube);
                rotation.L(cube);
                rotation.L(cube);
                rotation.Dreverse(cube);
                rotation.B(cube);
                rotation.B(cube);
            } else if (cube.getElement(28) == 'o') {
                rotation.B(cube);
                rotation.B(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.F(cube);
                rotation.F(cube);
                rotation.D(cube);
                rotation.D(cube);
                rotation.B(cube);
                rotation.B(cube);
            } else if (cube.getElement(28) == 'g') {
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
        //cube.print();

    }

    void whiteCorners(Cube cube) {
        char whiteEdge = 'w';
        int count = 0;
        int upCounter = 0;


        System.out.println(count);
        while (!whiteCornersAreReady(cube)) {
            if (count == 7) {
                System.out.println("negyet fordult az alja");
                break;
            }
            //count++;
            //feher a kek oldalon van
            if (cube.getElement(6) == whiteEdge) {
                if (cube.getElement(35) == 'b') {
                    rotation.D(cube);
                    rotation.D(cube);
                    rotation.L(cube);
                    rotation.Dreverse(cube);
                    rotation.Lreverse(cube);
                } else if (cube.getElement(35) == 'o') {
                    rotation.Dreverse(cube);
                    rotation.F(cube);
                    rotation.Dreverse(cube);
                    rotation.Freverse(cube);
                } else if (cube.getElement(35) == 'g') {
                    rotation.R(cube);
                    rotation.Dreverse(cube);
                    rotation.Rreverse(cube);
                } else if (cube.getElement(35) == 'r') {
                    rotation.D(cube);
                    rotation.B(cube);
                    rotation.Dreverse(cube);
                    rotation.Breverse(cube);

                }
                System.out.println("keknel van a feher");
                cube.print();


            }
            //feher a piros oldalon van
            if (cube.getElement(35) == whiteEdge) {
                if (cube.getElement(6) == 'b') {
                    rotation.Dreverse(cube);
                    rotation.Lreverse(cube);
                    rotation.D(cube);
                    rotation.L(cube);
                } else if (cube.getElement(6) == 'o') {
                    rotation.Freverse(cube);
                    rotation.D(cube);
                    rotation.F(cube);
                } else if (cube.getElement(6) == 'g') {
                    rotation.D(cube);
                    rotation.Rreverse(cube);
                    rotation.D(cube);
                    rotation.R(cube);
                } else if (cube.getElement(6) == 'r') {
                    rotation.D(cube);
                    rotation.D(cube);
                    rotation.Breverse(cube);
                    rotation.D(cube);
                    rotation.B(cube);

                }
                System.out.println("pirosnal van a feher");
                cube.print();
            }
            //alsosorban van feher, megfelelo helyre forgatja
            if (cube.getElement(8) == whiteEdge ||
                    cube.getElement(15) == whiteEdge ||
                    cube.getElement(17) == whiteEdge ||
                    cube.getElement(24) == whiteEdge ||
                    cube.getElement(26) == whiteEdge ||
                    cube.getElement(33) == whiteEdge) {
                rotation.D(cube);
                System.out.println("forgattam az aljan mert van ott feher");
                cube.print();
            } else {
                System.out.println("mashol van a feher, alul?, vagy kesz a sor");
                /*if (whiteCornersAreReady(cube)) {
                    System.out.println("kesz az elso sor");
                    break;
                }*/

                //az aljan a lyukba helyezem a feheret
                //a sarga oldalon van a feher
                if (cube.getElement(45) == 'w' ||
                        cube.getElement(47) == 'w' ||
                        cube.getElement(51) == 'w' ||
                        cube.getElement(53) == 'w') {
                    while (cube.getElement(45) != 'w') {
                        rotation.D(cube);
                        System.out.println("forgattam az aljan hogy a lyukba legyen a feher");
                        cube.print();
                    }
                    if (cube.getElement(42) == 'w') {
                        while (cube.getElement(42) == 'w') {
                            rotation.U(cube);
                            upCounter++;
                            System.out.println("tetejet forgatom a lyukhoz");
                            cube.print();
                        }
                    }
                    System.out.println("alulrol felhoz a feher");
                    //break;
                    rotation.L(cube);
                    rotation.Dreverse(cube);
                    rotation.Lreverse(cube);
                    cube.print();
                    for (int i = 0; i < upCounter; i++) {
                        rotation.Ureverse(cube);
                        System.out.println("tetejet visszaforgatom");
                        cube.print();
                    }
                    upCounter = 0;
                }
                //elso sorban van a feher
                //TODO:ne vegye eszre hamarabb hogy a felso sorba van feher, ha az also sorban is van
                else if (cube.getElement(0) == whiteEdge ||
                        cube.getElement(2) == whiteEdge ||
                        cube.getElement(9) == whiteEdge ||
                        cube.getElement(11) == whiteEdge ||
                        cube.getElement(18) == whiteEdge ||
                        cube.getElement(20) == whiteEdge ||
                        cube.getElement(27) == whiteEdge ||
                        cube.getElement(29) == whiteEdge) {
                    System.out.println("elso sorban van a feher");
                    if(cube.getElement(0) == 'w' || cube.getElement(29) == 'w'){
                        rotation.Lreverse(cube);
                        rotation.Dreverse(cube);
                        rotation.L(cube);
                    }else if (cube.getElement(9) == 'w' || cube.getElement(2) == 'w'){
                        rotation.Freverse(cube);
                        rotation.Dreverse(cube);
                        rotation.F(cube);
                    }
                    else if (cube.getElement(18) == 'w' || cube.getElement(11) == 'w'){
                        rotation.Rreverse(cube);
                        rotation.Dreverse(cube);
                        rotation.R(cube);
                    }
                    else if (cube.getElement(27) == 'w' || cube.getElement(20) == 'w'){
                        rotation.Breverse(cube);
                        rotation.Dreverse(cube);
                        rotation.B(cube);
                    }
                    cube.print();
                    //break;
                }
                //rossz helyen van egy feher sarok
                if ((cube.getElement(36) == whiteEdge &&
                        cube.getElement(38) == whiteEdge &&
                        cube.getElement(42) == whiteEdge &&
                        cube.getElement(44) == whiteEdge) && whiteCornersAreReady(cube) == false) {
                    System.out.println("rossz helyen van egy feher sarok");
                    if(cube.getElement(0) != 'b'){
                        rotation.Lreverse(cube);
                        rotation.Dreverse(cube);
                        rotation.L(cube);
                    }else if (cube.getElement(9) != 'o'){
                        rotation.Freverse(cube);
                        rotation.Dreverse(cube);
                        rotation.F(cube);
                    }
                    else if (cube.getElement(18) != 'g'){
                        rotation.Rreverse(cube);
                        rotation.Dreverse(cube);
                        rotation.R(cube);
                    }
                    else if (cube.getElement(27) != 'r'){
                        rotation.Breverse(cube);
                        rotation.Dreverse(cube);
                        rotation.B(cube);
                    }
                    cube.print();

                }

            }

            //count++;

        }


    }

}
