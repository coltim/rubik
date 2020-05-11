package hu.unideb.inf;

import java.util.ArrayList;
import java.util.List;

public class Scramble {
	
	Rotations rotation = new Rotations();
	Cube cube = new Cube();
	int selectedRotation;
	int numberOfRotations;
	
	public Scramble() {
		
	}
	
	public Scramble(int numberOfRotations, Cube cube) {
		for(int i = 0; i < numberOfRotations; i++) {
			
			int selectedRotation = (int) (Math.random() * (12 - 1 + 1) + 1);
			
			switch(selectedRotation) {
			  case 1:
			    rotation.B(cube);
			    break;
			  case 2:
				  rotation.Breverse(cube);
			    break;
			  case 3:
				  rotation.D(cube);
				    break;
			  case 4:
				  rotation.Dreverse(cube);
				    break;
			  case 5:
				  rotation.F(cube);
				    break;
			  case 6:
				  rotation.Freverse(cube);
				    break;
			  case 7:
				  rotation.L(cube);
				    break;
			  case 8:
				  rotation.Lreverse(cube);
				    break;
			  case 9:
				  rotation.R(cube);
				    break;
			  case 10:
				  rotation.Rreverse(cube);
				    break;
			  case 11:
				  rotation.U(cube);
				    break;
			  case 12:
				  rotation.Ureverse(cube);
				    break;
			  
			}
		}

	}

}
