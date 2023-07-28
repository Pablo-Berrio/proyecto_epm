package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. DECLARANDO LAS VARIABLES DE ENTRADA
        long contratocliente;
        Integer estratoSocioeconomico;
        Integer totalEnergia;
        Integer totalAgua;
        Integer totalSaneamiento;
        Double totalGas;
        Integer totalEmpresasvarias;

        //2.INICIALIZANDO LAS VARIABLES
        Scanner entradaTeclado=new Scanner(System.in);
        System.out.println("*****EPM ESTAMOS AHI*****");
        System.out.println("*************************");
        System.out.print("Ingrese el numero de su contrato: ");
        contratocliente=entradaTeclado.nextLong();

        System.out.print("ingrese su estrato socioeconomico: ");
        estratoSocioeconomico=entradaTeclado.nextInt();

        System.out.print("ingrese su total de energia durante el ultimo mes: ");
        totalEnergia=entradaTeclado.nextInt();

        System.out.print("ingrese su total de agua durante el ultimo mes: ");
        totalAgua=entradaTeclado.nextInt();

        System.out.print("ingrese su total de saneamiento durante el ultimo mes: ");
        totalSaneamiento=entradaTeclado.nextInt();

        System.out.print("ingrese su total de gas durante el ultimo mes: ");
        totalGas=entradaTeclado.nextDouble();

        System.out.print("ingrese su total de empresas varias durante el ultimo mes: ");
        totalEmpresasvarias=entradaTeclado.nextInt();

        Double totalCuentaDeServicios=totalGas+totalEnergia+totalAgua+totalEmpresasvarias+totalSaneamiento;
        //Integer estrato=Integer.parseInt(estratoSocioeconomico);

        if (estratoSocioeconomico==1){
            Double valorDescuento=totalCuentaDeServicios*(0.2);
            Double totalCuentaConDescuento=totalCuentaDeServicios-valorDescuento;
            System.out.println("su total a pagar con descuento es: "+totalCuentaConDescuento);
        } else if (estratoSocioeconomico==2) {
            Double valorDescuento=totalCuentaDeServicios*(0.1);
            Double totalCuentaConDescuento=totalCuentaDeServicios-valorDescuento;
            System.out.println("su total a pagar con descuento es: "+totalCuentaConDescuento);
        } else if (estratoSocioeconomico==3) {
            Double valorDescuento=totalCuentaDeServicios*(0.05);
            Double totalCuentaConDescuento=totalCuentaDeServicios-valorDescuento;
            System.out.println("su total a pagar con descuento es: "+totalCuentaConDescuento);
        } else if (estratoSocioeconomico==4||estratoSocioeconomico==5||estratoSocioeconomico==6) {
            System.out.println("no necesitas un descuento, cuentas con suficiente poder adquisitivo para pagar tus servicios.");
        }else {
            System.out.println("el estrato ingresado no existe o tu no existes, no sabemos");
        }


    }
}