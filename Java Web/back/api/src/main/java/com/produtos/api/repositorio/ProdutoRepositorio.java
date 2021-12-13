package com.produtos.api.repositorio;

import java.util.List;

import com.produtos.api.modelo.ProdutoModelo;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer>{

    //Listar todos os produtos
    List<ProdutoModelo>findAll(); //equivalente ao select*from produtos

    // //Filtrar dados atraves do codigo
    ProdutoModelo findByCodigo(int codigo); //select *from produtos where codigo=??

    // //Remover 
    void delete(ProdutoModelo obj); //delete from produtos where codigo =?

    // //Cadastrar ou alterar
    ProdutoModelo save (ProdutoModelo obj);
    
}
