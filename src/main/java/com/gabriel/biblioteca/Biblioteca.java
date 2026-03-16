package com.gabriel.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(
                    "Título: " + livro.getTitulo() +
                            " | Autor: " + livro.getAutor() +
                            " | Ano: " + livro.getAno() +
                            " | Disponível: " + livro.isDisponivel()
            );
        }
    }

    public Livro buscarPorTitulo(String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(String titulo){

        Livro livro = buscarPorTitulo(titulo);

        if (livro != null && livro.isDisponivel() ){

            livro.setDisponivel(false);
            System.out.println("Livro emprestado com sucesso.");

        } else {
            System.out.println(" Livro não disponível !");
        }

    }

    public void devolverLivro(String titulo){

        Livro livro = buscarPorTitulo(titulo);

        if (livro != null && !livro.isDisponivel()){

            livro.setDisponivel(true);
            System.out.println("Livro devolvido com sucesso");
        }else{
            System.out.println("Livro não encontrado ou, já disponível");
        }


    }
}