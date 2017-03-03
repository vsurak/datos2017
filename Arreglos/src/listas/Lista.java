package listas;

public class Lista 
{
	private Nodo Inicio;
	private int Cantidad;
	private Nodo Final;
	
	public Lista()
	{
		Inicio = null;
		Final = null;
		Cantidad = 0;
	}
	
	public boolean vacia()
	{
		return Cantidad==0;
	}
	
	public int longitud()
	{
		return Cantidad;
	}
	
	private void agregar(Nodo pNodo)
	{
		if (vacia()) 
		{
			Inicio = pNodo;
			Final = pNodo;
			Cantidad++;
		} else
		{
			pNodo.setSiguiente(Inicio);
			Inicio = pNodo;
			Cantidad++;
		}
	}

	/*
	 * Agrega un nodo al inicio de la lista
	 */
	private void agregarCool(Nodo pNodo)
	{
		if (!vacia()) 
		{
			pNodo.setSiguiente(Inicio);
		} else 
		{
			Final = pNodo;
		}
		Inicio = pNodo;
		Cantidad++;
	}
	
	/*
	 * Agrega un nodo al final de la lista
	 */
	private void agregarAlFinal(Nodo pNodo)
	{
		if (!vacia())
		{
			Final.setSiguiente(pNodo);
			Final=pNodo;
			Cantidad++;
		} else 
		{
			agregarCool(pNodo);
		}
	}
	
	public void agregar(Nodo pNodo, PosicionInsercion pPos)
	{
		if (pPos==PosicionInsercion.FINAL) 
		{
			agregarAlFinal(pNodo);
		} else
		{
			agregarCool(pNodo);
		}
	}

	public Nodo getNodo(int pPos)
	{
		Nodo resultado = null;
		int currentPos = 0;
		Nodo indice = Inicio;
		while (currentPos!=pPos && currentPos<Cantidad) 
		{
			indice = indice.getSiguiente();
			currentPos++;
		}
		if (currentPos==pPos)
		{
			resultado = indice;
		}
		return resultado;
	}
}
