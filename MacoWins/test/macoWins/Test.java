package macoWins;

import java.util.Date;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Date hoy = new Date();

		Negocio nuestroLocal = new Negocio();
		nuestroLocal.setPrecioFijo(50);

		Sarkany sarkany = new Sarkany();
		Armani armani = new Armani();

		Importado importado = new Importado();
		Nacional nacional = new Nacional();

		Sombrero galera = new Sombrero();
		galera.setCoeficienteMetrosexualidad(50);
		galera.setMarca(sarkany);
		galera.setNegocio(nuestroLocal);
		galera.setOrigen(importado);

		Camisa camisaHawaiana = new Camisa();
		camisaHawaiana.setMarca(armani);
		camisaHawaiana.setNegocio(nuestroLocal);
		camisaHawaiana.setOrigen(nacional);

		Zapato mocasinesBlancos = new Zapato();
		mocasinesBlancos.setMarca(armani);
		mocasinesBlancos.setNegocio(nuestroLocal);
		mocasinesBlancos.setOrigen(importado);
		mocasinesBlancos.setTalle(42);

		Saco saquito = new Saco();
		saquito.setBotones(8);
		saquito.setMarca(armani);
		saquito.setNegocio(nuestroLocal);
		saquito.setOrigen(nacional);

		Pantalon balis = new Pantalon();
		balis.setMarca(sarkany);
		balis.setNegocio(nuestroLocal);
		balis.setOrigen(importado);
		balis.setTelaUsada(200.5);

		Venta primerVenta = new Venta();
		primerVenta.setCantidad(5);
		primerVenta.setFecha(hoy);
		primerVenta.setPrenda(galera);

		Venta segundaVenta = new Venta();
		segundaVenta.setCantidad(1);
		segundaVenta.setFecha(hoy);
		segundaVenta.setPrenda(camisaHawaiana);

		Venta tercerVenta = new Venta();
		tercerVenta.setCantidad(1);
		tercerVenta.setFecha(hoy);
		tercerVenta.setPrenda(mocasinesBlancos);

		Venta cuartaVenta = new Venta();
		cuartaVenta.setCantidad(2);
		cuartaVenta.setFecha(hoy);
		cuartaVenta.setPrenda(saquito);

		Venta quintaVenta = new Venta();
		quintaVenta.setCantidad(1);
		quintaVenta.setFecha(hoy);
		quintaVenta.setPrenda(balis);

		ArrayList<Venta> ventasDelDia = new ArrayList<Venta>();
		ventasDelDia.add(primerVenta);
		ventasDelDia.add(segundaVenta);
		ventasDelDia.add(tercerVenta);
		ventasDelDia.add(cuartaVenta);
		ventasDelDia.add(quintaVenta);

		nuestroLocal.setVentas(ventasDelDia);

		System.out.println("Nuestra ganancia en este día es:"
				+ nuestroLocal.gananciaDelDia(hoy));

	}
}
