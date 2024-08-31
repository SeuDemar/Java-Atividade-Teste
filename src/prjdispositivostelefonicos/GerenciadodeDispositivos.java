/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjdispositivostelefonicos;

/**
 *
 * @author Laboratorio
 */
public class GerenciadodeDispositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DispositivoTelefonico[] dispositivos = new DispositivoTelefonico{
            new TelefoneFixo("1234-5678", "Modelo A"),
            new Celular("98765-4321", "Modelo B", "operadora"),
            new Smartphone("112233-4455", "Modelo C", "operadora2");
        };    
            for (DispositivoTelefonico dispositivo : dispositivos){
                dispositivo.ligar();
                dispositivo.mostrarDetalhes();
                
                if (dispositivo instanceof Smartphone) {
                    Smartphone smartphone = (Smartphone) dispositivo;
                    smartphone.acessarInternet();
                    smartphone.enviarMensagem("Oi", "foto.jpg");
                } else if (dispositivo instanceof Celular){
                    ((Celular) dispositivo).enviarMensagem("Olá, tudo bem?");
                } else if (dispositivo instanceof TelefoneFixo){
                    ((TelefoneFIxo) dispositivo).verificarLinhaTelefonica();
                }
            }
            
    }
   
}
