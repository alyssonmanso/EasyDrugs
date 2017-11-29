/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dados.repositorio.implementações.RepositorioFuncionario;

/**
 *
 * @author Alana Tenório
 */
public class Fachada {
    private static Fachada myself = null;
    
    private RepositorioFuncionario repositorioFunc = null;
    
    private Fachada(){
        repositorioFunc = new RepositorioFuncionario();
    }
    
    public static Fachada getInstance(){
        if(myself == null)
            myself = new Fachada();
        return myself;
    }
}
