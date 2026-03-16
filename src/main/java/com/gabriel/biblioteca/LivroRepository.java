package com.gabriel.biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroRepository {

    public void salvarLivro(Livro livro) {

        String sql = "INSERT INTO livros (titulo, autor, ano, disponivel) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.setBoolean(4, livro.isDisponivel());

            stmt.executeUpdate();

            System.out.println("Livro salvo no banco com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarLivros() {

        String sql = "SELECT * FROM livros";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             java.sql.ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int ano = rs.getInt("ano");
                boolean disponivel = rs.getBoolean("disponivel");

                System.out.println(
                        "Título: " + titulo +
                                " | Autor: " + autor +
                                " | Ano: " + ano +
                                " | Disponível: " + disponivel
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarLivro(String titulo){

    String sql  ="DELETE  FROM livros WHERE titulo = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titulo);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Livro removido com sucesso!");
            } else {
                System.out.println("Livro não encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}