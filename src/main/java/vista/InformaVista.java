package vista;

import modelo.clientes.Cliente;

import java.util.LinkedList;

/**
 * Created by ouron on 01/05/2017.
 */
public interface InformaVista {
    void muestraCliente(Cliente cAct);

    void noCli();

    void getClientes(Cliente[] clientes);
}