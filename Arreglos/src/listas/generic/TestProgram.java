package listas.generic;

import java.util.Random;
import java.util.Date;

public class TestProgram 
{
	public static void main(String args[])
	{
		Nodo<String> nuevo = new Nodo<String>();
		Nodo<Random> nuevo1 = new Nodo<Random>();
		Nodo<Integer>  nuevo2 = new Nodo<Integer>();
		
		
		Lista<String> miLista = new Lista<String>();
		Lista<Date> otraLista = new Lista<Date>();
		
		miLista.agregar(nuevo, PosicionInsercion.FINAL);
	}
}
