package org.rchani.optional.ejemplo.models.repositorio;

import org.rchani.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{
    Optional<Computador> filtrar(String nombre);

}
