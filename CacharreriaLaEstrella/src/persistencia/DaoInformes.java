/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * .
 *
 * @author dcorr
 */
public class DaoInformes {

  public static Connection conexion = null;
  public static Statement sentencia = null;
  static ResultSet resultado = null;
  static ResultSet resultado2 = null;
  static String cadenaDriver = "org.postgresql.Driver";

  /**
     * .
     * @clave @url @usuario
     */
  public static void conexion() {

    String clave = "1234";
    String url = "jdbc:postgresql://localhost:5432/CacharreriaLaEstrella";
    String usuario = "postgres";

    try {

      Class.forName(cadenaDriver);
      conexion = DriverManager.getConnection(url, usuario, clave);
      sentencia = conexion.createStatement();

        } catch (Exception e) {
      //TODO: HANDLE EXCEPTION
      JOptionPane.showMessageDialog(null, "error al conectar" + e);

    }

  }
  /**
 * 
 * @param fecha1 la fecha 1
 * @param fecha2 la fecha 2
 * @return 
 */
  
  public static ArrayList consultainformecategorias(String fecha1, String fecha2) {

    String text;

    ArrayList<Integer> ventas = new ArrayList<>();
    ArrayList<String> categoria = new ArrayList<>();
    ArrayList<Object> Resultado = new ArrayList<>();

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultanumerofilas = "SELECT Count(*) FROM productos "
              + "INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto "
              + "INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa "
              + "where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'";
      String consultaSql;
      consultaSql = "SELECT productos.categoria, SUM(ventaproducto.totalventaproducto) "
                + "as TotalCategoria FROM productos "
                + "INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto "
                + "INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa "
                + "where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'"
                + "group by productos.categoria";

      resultado = sentencia.executeQuery(consultaSql);
      resultado2 = sentencia.executeQuery(consultanumerofilas);
      resultado2.next();
      int i;

      for (i = 0; i < resultado2.getInt(1); i++) {

        if (resultado.next()) {

          categoria.add(resultado.getString(1));
          ventas.add(resultado.getInt(2));
          resultado.next();
        } else {

        }

      }

      Resultado.add(categoria);
      Resultado.add(ventas);

    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println(e);

      JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

    }
    return Resultado;

  }
  
  /**.
   * 
   * @param fecha1 fecha desde donde se va a consultar
   * @param fecha2 fecha hasta la cual se consulta
   * @return  retorna toda la info regresada por la consulta
   */
  
  public static ArrayList consultarInformeCostos(String fecha1, String fecha2) {

    String text;

    ArrayList<Integer> ventas = new ArrayList<>();
    ArrayList<String> categoria = new ArrayList<>();
    ArrayList<Object> resultadoArray = new ArrayList<>();

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultanumerofilas;
      consultanumerofilas = "SELECT Count(*) FROM productos "
                + "INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto "
                + "INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa "
                + "where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'";
      String consultaSql;
      consultaSql = "SELECT productos.categoria, SUM(ventaproducto.cppcostos) as TotalCategoria "
              + "FROM productos INNER JOIN ventaproducto "
              + "ON productos.codigo = ventaproducto.codigoproducto "
              + "INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa "
              + "where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'"
              + "group by productos.categoria";

      resultado = sentencia.executeQuery(consultaSql);
      resultado2 = sentencia.executeQuery(consultanumerofilas);
      resultado2.next();
      int i;

      for (i = 0; i < resultado2.getInt(1); i++) {

        if (resultado.next()) {

          categoria.add(resultado.getString(1));
          ventas.add(resultado.getInt(2));
          resultado.next();
        } else {
        }

      }

      resultadoArray.add(categoria);
      resultadoArray.add(ventas);

    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println(e);

      JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

    }
    return resultadoArray;

  }
  
  /**.
   * 
   * @param fecha1 fecha desde donde se va a consultar
   * @param fecha2 fecha hasta la cual se consulta
   * @return  retorna toda la info regresada por la consulta
   */
  public static ArrayList consultarinformecompra(String fecha1, String fecha2) {

    String text;

    ArrayList<Integer> compra = new ArrayList<>();
    ArrayList<String> categoria = new ArrayList<>();
    ArrayList<Object> resultadoArray = new ArrayList<>();

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultanumerofilas;
      consultanumerofilas = "SELECT Count(*) FROM productos "
                + "INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto "
                + "INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa "
                + "where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'";
      String consultaSql = "SELECT productos.nombreproducto, SUM(compraproducto.totalcompra) "
              + "as TotalCategoria FROM productos INNER JOIN compraproducto "
              + "ON productos.codigo = compraproducto.codigoproducto "
              + "INNER JOIN compra on compraproducto.codigocompra = compra.codigocompra "
              + "where compra.fecha between'" + fecha1 + "'and'" + fecha2 + "'"
              + "group by productos.nombreproducto";

      resultado = sentencia.executeQuery(consultaSql);
      resultado2 = sentencia.executeQuery(consultanumerofilas);
      resultado2.next();

      int i;

      for (i = 0; i < resultado2.getInt(1); i++) {

        if (resultado.next()) {

          categoria.add(resultado.getString(1));
          compra.add(resultado.getInt(2));
          resultado.next();
        } else {
        }

      }

      resultadoArray.add(categoria);
      resultadoArray.add(compra);

    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println(e);

      JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

    }
    return resultadoArray;

  }

    public static ArrayList ConsultarInformeMasVendidos(String fecha1, String fecha2) {

        String text;

        ArrayList<Integer> MasVendidos = new ArrayList<>();
        ArrayList<String> NombreProducto = new ArrayList<>();
        ArrayList<Object> Resultado = new ArrayList<>();

        try {

            // ARMA LA SENTENCIA DE INSERCCION
            String Consultanumerofilas = "SELECT Count(*) FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'";
            String consultaSQL = "SELECT productos.nombreproducto, SUM(ventaproducto.cantidad) as TotalCategoria "
                    + "FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN "
                    + "venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha "
                    + "between'" + fecha1 + "' and '" + fecha2 + "' group by productos.nombreproducto order by TotalCategoria desc";

            resultado = sentencia.executeQuery(consultaSQL);
            resultado2 = sentencia.executeQuery(Consultanumerofilas);
            resultado2.next();
            int i;

            for (i = 0; i < resultado2.getInt(1); i++) {

                if (resultado.next()) {

                    NombreProducto.add(resultado.getString(1));
                    MasVendidos.add(resultado.getInt(2));
                    resultado.next();
                } else {

                }

            }

            Resultado.add(NombreProducto);
            Resultado.add(MasVendidos);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);

            JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

        }
        return Resultado;

    }

    public static ArrayList ConsultarStock() {

        String text;

        ArrayList<String> NombreProductos = new ArrayList<>();
        ArrayList<Integer> CantidadProducto = new ArrayList<>();
        ArrayList<Object> ResultadoTotal = new ArrayList<>();

        try {

            // ARMA LA SENTENCIA DE INSERCCION
            String consultaSQL = "select nombreproducto,cantidadproducto from productos";
            String consultaSQL2 = "SELECT COUNT(*) from productos";

            resultado = sentencia.executeQuery(consultaSQL);
            resultado2 = sentencia.executeQuery(consultaSQL2);

            resultado2.next();
            int i;
            int tamano = resultado2.getInt(1);

            for (i = 0; i < tamano; i++) {
                resultado.next();
                NombreProductos.add(resultado.getString(1));
                CantidadProducto.add(resultado.getInt(2));
            }

            ResultadoTotal.add(NombreProductos);
            ResultadoTotal.add(CantidadProducto);

        } catch (SQLException e) { 
            e.printStackTrace();
            System.out.println(e);

            JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

        }
        return ResultadoTotal;

    }

}
