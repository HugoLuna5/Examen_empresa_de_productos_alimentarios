package excento.utils;

import excento.interfaces.congeladosAgua;
import excento.interfaces.congeladosAire;
import excento.interfaces.congeladosNitrogeno;
import excento.model.Congelados;
import excento.model.Frescos;
import excento.model.Producto;
import excento.model.Refrigerados;

import javax.swing.*;

public class ManagerInput {
    public static final String[] options = {"Fresco", "Refrigerado", "Congelado"};
    public static final String[] optionsCongelado = {"Congelado por agua", "Congelado por aire", "Congelado por nitrogeno"};


    public static void initViews(){

        initInput();





    }




    public static void initInput(){
        Frescos f1 =  new Frescos();
        Refrigerados r1 = new Refrigerados();
        Congelados c1 = new Congelados();

       try{


           JFrame frame = new JFrame("Productos");
           String productos = (String) JOptionPane.showInputDialog(frame,
                   "Elige un producto",

                   "Empresa Agroalimentaria",
                   JOptionPane.QUESTION_MESSAGE,
                   null,
                   options,
                   options[0]);

           System.out.println(productos);

           String  fecha;
           String fecha_ev;
           String  num_lote;
           String  pais;
           String codeOrganism;
           String temperatura;

           switch (productos.toLowerCase()){
               case "fresco":


                  fecha = JOptionPane.showInputDialog("Ingresa la fecha de caducidad");
                  fecha_ev = JOptionPane.showInputDialog("Ingresa la fecha de envasado");
                  num_lote = JOptionPane.showInputDialog("Ingresa el numero de lote");
                  pais = JOptionPane.showInputDialog("Ingresa el país de origen");




                   f1.setStatusProducto("fresco");
                   f1.setFecha_cad(fecha);
                   f1.setFechaEnva(fecha_ev);
                   f1.setNum_lote(num_lote);
                   f1.setPaisOR(pais);


                   break;
               case "refrigerado":

                   fecha = JOptionPane.showInputDialog("Ingresa la fecha de caducidad");
                   fecha_ev = JOptionPane.showInputDialog("Ingresa la fecha de envasado");
                   num_lote = JOptionPane.showInputDialog("Ingresa el numero de lote");
                   pais = JOptionPane.showInputDialog("Ingresa el país de origen");
                   codeOrganism = JOptionPane.showInputDialog("Ingresa el codigo del organismo");
                   temperatura = JOptionPane.showInputDialog("Ingresa la temperatura");



                   r1.setStatusProducto("refrigerado");
                   r1.setFecha_cad(fecha);
                   r1.setFechaEnva(fecha_ev);
                   r1.setNum_lote(num_lote);
                   r1.setCodOrganism(codeOrganism);
                   r1.setPaisOR(pais);
                   r1.setTemperatura(temperatura);

                   break;
               case "congelado":


                   fecha = JOptionPane.showInputDialog("Ingresa la fecha de caducidad");
                   fecha_ev = JOptionPane.showInputDialog("Ingresa la fecha de envasado");
                   num_lote = JOptionPane.showInputDialog("Ingresa el numero de lote");
                   pais = JOptionPane.showInputDialog("Ingresa el país de origen");
                   temperatura = JOptionPane.showInputDialog("Ingresa la temperatura");

                   JFrame frameCon = new JFrame("Productos");
                   String congelado = (String) JOptionPane.showInputDialog(frameCon,
                           "Elige el tipo de congelado del producto",

                           "Empresa Agroalimentaria",
                           JOptionPane.QUESTION_MESSAGE,
                           null,
                           optionsCongelado,
                           optionsCongelado[0]);




                   c1.setStatusProducto(congelado.toLowerCase());
                   c1.setFecha_cad(fecha);
                   c1.setFechaEnva(fecha_ev);
                   c1.setNum_lote(num_lote);
                   c1.setPaisOR(pais);
                   c1.setTemperatura(temperatura);


                   switch (congelado.toLowerCase()){
                       case "congelado por agua":
                           String sali = JOptionPane.showInputDialog("Ingresa la salinidad");
                           congeladosAgua(c1, sali);
                           break;
                       case "congelado por aire":
                           String porcentajeNitro = JOptionPane.showInputDialog("Ingresa el procentaje de nitrogeno");
                           String porcentajeOxi = JOptionPane.showInputDialog("Ingresa el procentaje de oxigeno");
                           String porcentajeDioxi = JOptionPane.showInputDialog("Ingresa el procentaje de dioxido de carbono");
                           String porcentajeVapor = JOptionPane.showInputDialog("Ingresa el procentaje de vapor");

                           String str = "Porcentaje de nitrogeno "+porcentajeNitro +"\nPorcentaje de oxigeno"+ porcentajeOxi +"\nPorcentaje de dioxido de cabono: "+ porcentajeDioxi +"\nPorcentaje de vapor: "+ porcentajeVapor;
                           congeladosAire(c1, str);
                           break;
                       case "congelado por nitrogeno":
                           String tiempo= JOptionPane.showInputDialog("Ingresa el tiempo en segundos");
                           String info= JOptionPane.showInputDialog("Ingresa la informacion del metodo de congelacion empleado");

                           congeladosNitrogeno(c1, info,tiempo);
                   }

                   break;
           }


       }catch (Exception e){

       }


       showData(f1,r1,c1);

    }


    public static void showData(Frescos f1,Refrigerados r1, Congelados c1){


        if (f1.getFecha_cad() != null){
            String fres =
                    "Fecha de caducidad: "+f1.getFecha_cad()+"\nFecha de envasado: "+f1.getFechaEnva()+"\nNumero de lote: "+f1.getNum_lote()+
                            "\nPais de origen: "+f1.getPaisOR();
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),fres);
        }

        if (r1.getFecha_cad() != null){
            String ref =
                    "Fecha de caducidad: "+r1.getFecha_cad()+"\nFecha de envasado: "+r1.getFechaEnva()+"\nNumero de lote: "+r1.getNum_lote()+
                            "\nPais de origen: "+r1.getPaisOR()+"\nCodigo de organismo: "+r1.getCodOrganism()+"\nTemperatura: "+r1.getTemperatura();
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),ref);
        }

        if (c1.getFecha_cad() != null){
            String con = "Fecha de caducidad: "+c1.getFecha_cad()+"\nFecha de envasado: "+c1.getFechaEnva()+"\nNumero de lote: "+c1.getNum_lote()+
                    "\nPais de origen: "+c1.getPaisOR()+"\nTemperatura: "+c1.getTemperatura();
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),con);
        }





    }



    public static void congeladosAgua(congeladosAgua ca, String salinidad){

    ca.congeladosAgua(salinidad);

    }

    public static void congeladosAire(congeladosAire ca, String infoComposicion){
    ca.congeladosAire(infoComposicion);
    }
    public static void congeladosNitrogeno(congeladosNitrogeno ca, String infoMetodoEmpleado, String tiempoExp){
        ca.congeladosNitrogeno(infoMetodoEmpleado,tiempoExp);

    }
}
