package tresEnRaya;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		char tablero[][];
		tablero = new char[3][3];
		int posicion1;
		int posicion2;

		for (int i = 1; i < 10; i++) {

			if (i == 1) {
				System.out.println("Empieza X");
			}
			System.out.println("¡Adelante!");
			System.out.println();

			System.out.println("|" + tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2] + "|");
			System.out.println("|" + tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2] + "|");
			System.out.println("|" + tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2] + "|");
			
			posicion1 = entrada.nextInt();
			posicion2 = entrada.nextInt();
			
			if (posicion1 < 3 && posicion2 < 3) {
				if (i % 2 != 0 && tablero[posicion1][posicion2] == '\u0000') {
					tablero[posicion1][posicion2] = 'X';
					System.out.println("Turno de O");
				}else if  (i % 2 != 0 && tablero[posicion1][posicion2] != '\u0000') {
					System.out.println("Ya hay una ficha ahi");
					i--;
				} else if (i % 2 == 0 && tablero[posicion1][posicion2] == '\u0000') {
					tablero[posicion1][posicion2] = 'O';
					System.out.println("Turno de X");
				}else if (i % 2 == 0 && tablero[posicion1][posicion2] != '\u0000') {
					System.out.println("Ya hay una ficha ahi");
					i--;
				}
			}else {
				System.out.println("Posicion incorrecta. Introduce la posición entre los numero 0 y 2");
				i--;
			}
			
			if (((tablero[0][0] == tablero [1][1]) && (tablero[1][1] == tablero [2][2])) || ((tablero[0][2] == tablero [1][1]) && (tablero[1][1] == tablero [2][0]))){
				if (tablero[1][1] == 'X'){
						System.out.println("Ganan las X");
				}else if (tablero[1][1] == 'O') {
					System.out.println("Ganan las O");
				}
			}
		}
			entrada.close();
	}

}

