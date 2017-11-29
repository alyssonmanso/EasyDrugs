/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados.repositorio.interfaces;

import java.util.List;

/**
 *
 * @author Alana Tenório
 */
public interface InterfaceRepositorio <T>{
    public void inserir(T t);
    
    public void atualizar(T t);
    
    public void deletar(T t);
    
    public T recuperar(String cadastro);
    
    public List<T> listarTodos();
}
