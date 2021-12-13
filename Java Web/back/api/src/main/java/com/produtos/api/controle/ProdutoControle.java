package com.produtos.api.controle;

import java.util.List;

import com.produtos.api.modelo.Modelo;
import com.produtos.api.modelo.ProdutoModelo;
import com.produtos.api.repositorio.ProdutoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoControle {

    //Obter todas as fucionalidades do repositorio
    @Autowired
    private ProdutoRepositorio acao;

    //Listar todos produtos
    @GetMapping("/api")
    public @ResponseBody List<ProdutoModelo> listar(){
    return acao.findAll();
    }

    //Filtrar produtos atraves do codigo
    @GetMapping ("/api/{codigo}")
    public @ResponseBody ProdutoModelo filtrar(@PathVariable int codigo){
        return acao.findByCodigo(codigo);
    }
    
    //Cadastrar produtos
    @PostMapping("/api")
    public @ResponseBody ProdutoModelo cadastrar(@RequestBody ProdutoModelo obj){
        return acao.save(obj);
    }
    //Alterar dados
    @PutMapping("/api")
    public @ResponseBody ProdutoModelo alterar(@RequestBody ProdutoModelo obj){
        return acao.save(obj);

    }
    //remover produtos atraves do codigo
    @DeleteMapping ("/api/{codigo}")
    public void remover (@PathVariable int codigo){
        ProdutoModelo obj = acao.findByCodigo(codigo);
        acao.delete(obj);
    }

    //rota de boas vindas
    @GetMapping("/")
    public String mensagens(){
        return "Hello Sprig!";
    }
    //Rota contendo um amensagem e um  nome
    @GetMapping("/{texto}")
    public String parametro(@PathVariable String texto){
        return "Bom dia,"+ texto;

    }

    //Rota mensagem, nome e idade
    @GetMapping("/{nome}/{idade}")
    public String parametro2(@PathVariable String nome, @PathVariable int idade){
        return "bom dia"+ nome +" Você tem "+ idade+ "anos.";
    }

    //Rota spara efetuar uma media
    @GetMapping("/{nome}/{nota1}/{nota2}")
    public String media(@PathVariable String nome, @PathVariable Double nota1, @PathVariable Double nota2){
        Double media = (nota1+nota2)/2;
        return nome +"obteve média"+ media+ "e sua situação é "+(media>=7 ? "Aprovado":"Reprovado");
    }
    //Rota para obter o nome via post
    @PostMapping("/")
    public String metodoPost(@RequestBody Modelo modelo){
        return "O nome informado é "+modelo.getNome()+"e tem "+modelo.getIdade()+ " anos";

    }
    

}
