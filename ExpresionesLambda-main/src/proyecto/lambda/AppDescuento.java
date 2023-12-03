package proyecto.lambda;

import proyecto.lambda.interfaces.Descuento;

public class AppDescuento {

	public static void main(String[] args) {
		
		Descuento descuentoFijo = monto -> 
		{
			if(monto> 500)
				return monto - 500;
			else
				return 0.0;
		};
		
		//(CONDICION) ? CUANDO ES TRUE : CUANDO ES FALSE;
		Descuento descuentoFijo1 = monto -> (monto > 500) ? monto - 500 : 0.0;
		
		Descuento descuentoPorPorcentaje = monto -> (monto - monto*0.3);
		
		System.out.println(descuentoFijo.aplicar(1000.0));
		System.out.println(descuentoPorPorcentaje.aplicar(1000.0));

	}

}
