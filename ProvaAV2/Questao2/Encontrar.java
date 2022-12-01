package br.com.ProvaAv2;

public class Encontrar {

        public static void main(String[] args) {

            Usuario usuario = new Usuario("Beca", "Emailabacaxi", "Cachorro");
            AchadoPerdido achadoPerdido = new AchadoPerdido("tituloBruna", "descriçãoRebeca", "tipoRebeca", "statusbeca");
            achadoPerdido.buscarTitulo("titulo");
            achadoPerdido.visualizarDetalhes();
        }
    }

