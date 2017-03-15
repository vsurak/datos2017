package listas.generic;

public class Lista<T>
{
	private Nodo<T> Inicio;
	private int Cantidad;
	private Nodo<T> Final;
	
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
	
	private void agregar(Nodo<T> pNodo)
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
	private void agregarCool(Nodo<T> pNodo)
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
	private void agregarAlFinal(Nodo<T> pNodo)
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
	
	public void agregar(Nodo<T> pNodo, PosicionInsercion pPos)
	{
		if (pPos==PosicionInsercion.FINAL) 
		{
			agregarAlFinal(pNodo);
		} else
		{
			agregarCool(pNodo);
		}
	}
	
	public int insertar(Nodo<T> pNodo, int pPosition)
	{
		int result = -1;
		int casilla = 0;
		
		Nodo<T> recorrido = Inicio;
		if (!(vacia() || pPosition==0)) 
		{
			while (recorrido.getSiguiente()!=null && casilla+1<pPosition) 
			{
				casilla++;
				recorrido = recorrido.getSiguiente();
			}
			pNodo.setSiguiente(recorrido.getSiguiente());
			recorrido.setSiguiente(pNodo);
			result = casilla+1;
		} else 
		{
			result = 0;
			pNodo.setSiguiente(Inicio);
			Inicio = pNodo;
		}
		
		
		return result;
	}

	/*
	 * Quiz #2, implementar las siguientes funciones de borrado. Enviar solo este archivo Lista.java al correo
	 * bollackdgt@gmail.com a mas tardar jueves 09 de marzo a las 9pm.
	 * 
	 */
	
	/*
	 * Recibe la referencia al objeto Nodo a borrar, y returna true si efectivamente existia y lo borro, de lo
	 * contrario retorna false
	 */
	public boolean Eliminar(Nodo<T> pNodo)
	{
		boolean result = false;
		
		return result;
	}

	/*
	 * Busca en la lista de nodos aquel que contiene al Jugador con el mismo nombre, revisar el metodo de String.Equals,
	 * Si lo encuentra, elimina el nodo, retorna el puntero al nodo eliminado y lo saca de la lista. Si no lo encuentra retorna null.
	 */
	public Nodo<T> Eliminar(String pNombreJugador)
	{
		Nodo<T> result = null;
		
		return result;
	}

	/*
	 * Busca en la lista si existe la posicion numeral, si no existe retorna null. Si si existe lo elimina de la lista y 
	 * retorna el puntero al nodo eliminado. 
	 */
	public Nodo<T> Eliminar(int pPosition)
	{
		Nodo<T> result = null;
		
		return result;
	}

	public Nodo<T> getNodo(int pPos)
	{
		Nodo<T> resultado = null;
		int currentPos = 0;
		Nodo<T> indice = Inicio;
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
