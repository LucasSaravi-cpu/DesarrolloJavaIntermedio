package argProg.modelos;

import argProg.persistencia.ClienteDAO;

import java.util.List;

public class AreaComercial {
    //Se encarga de incorporar nuevos clientes a la empresa
    //Hace altas,bajas,modificaciones de Clientes -> Accede a la tabla Cliente
    private ClienteDAO clienteDAO = new ClienteDAO();
    public void crear(Cliente cliente){
        clienteDAO.guardar(cliente);
    }
    public void modificar(Cliente cliente){
        clienteDAO.actualizar(cliente);
    }
    public void eliminar(Cliente cliente){
        clienteDAO.eliminar(cliente);
    }
    public Cliente buscarPorID(int idCliente){
        return clienteDAO.buscar(idCliente);
    }
    public Cliente buscarPorCUIT(String cuit){
        return clienteDAO.buscarPorCuit(cuit);
    }
    public List<Cliente> buscarTodosLosClientes(){
        return clienteDAO.buscarTodos();
    }
}
