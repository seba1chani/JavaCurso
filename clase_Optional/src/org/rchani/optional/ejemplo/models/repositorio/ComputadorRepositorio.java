package org.rchani.optional.ejemplo.models.repositorio;

import org.rchani.optional.ejemplo.models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{

   private List<Computador>dataSource;

    public ComputadorRepositorio() {
        dataSource= new ArrayList<>();
        dataSource.add(new Computador("Asus Rog","Strix G512"));
        dataSource.add(new Computador("MacBook Pro","MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        for(Computador c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }
}
