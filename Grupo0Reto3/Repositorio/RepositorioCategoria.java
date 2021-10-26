/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo0Reto3.Repositorio;

import java.util.List;
import java.util.Optional;

import Grupo0Reto3.Interfase.InterfaceCategoria;
import Grupo0Reto3.Modelo.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioCategoria {
    @Autowired
    private InterfaceCategoria crud;
    public List<Categoria> getAll(){
        return (List<Categoria>) crud.findAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return crud.findById(id);
    }

    public Categoria save(Categoria categoria){
        return crud.save(categoria);
    }
    public void delete(Categoria categoria){
       crud.delete(categoria);
    }
}
