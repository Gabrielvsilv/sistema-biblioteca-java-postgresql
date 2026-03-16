package com.gabriel.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        LivroRepository repository = new LivroRepository();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar livro");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Remover livro");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("Título:");
                    String titulo = scanner.nextLine();

                    System.out.println("Autor:");
                    String autor = scanner.nextLine();

                    System.out.println("Ano:");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Livro livro = new Livro(titulo, autor, ano);

                    repository.salvarLivro(livro);

                    break;

                case 2:
                    repository.listarLivros();
                    break;

                case 3:

                    System.out.println("Título:");
                    String busca = scanner.nextLine();

                    Livro encontrado = biblioteca.buscarPorTitulo(busca);

                    if (encontrado != null) {
                        System.out.println("Livro encontrado: " + encontrado.getTitulo());
                    } else {
                        System.out.println("Livro não encontrado");
                    }

                    break;

                case 4:

                    System.out.println("Título:");
                    String emprestar = scanner.nextLine();

                    biblioteca.emprestarLivro(emprestar);

                    break;

                case 5:

                    System.out.println("Título:");
                    String devolver = scanner.nextLine();

                    biblioteca.devolverLivro(devolver);

                    break;

                case 6:

                    System.out.println("Título do livro para remover:");
                    String remover = scanner.nextLine();

                    repository.deletarLivro(remover);

                    break;

            }

        } while (opcao != 0);

    }
}