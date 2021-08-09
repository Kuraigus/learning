package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {
    public static void main(String[] args) {
        cadastrarProduto();
        buscarTodosProdutos();
    }

    private static void cadastrarProduto() {
        Categoria categoria = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"));

        EntityManager em = JPAUtil.getEntityManager();

        em.persist(categoria);

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }

    private static void buscarProduto() {
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto p = produtoDao.buscarPorId(1l);

        System.out.println(p.getPreco());
    }

    public static void buscarTodosProdutos() {
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        List<Produto> todas = produtoDao.buscarTodos();
        todas.forEach(p -> System.out.println(p.getNome()));
    }

    public static void buscarPorNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        List<Produto> todas = produtoDao.buscarPorNome(nome);
        todas.forEach(p -> System.out.println(p.getNome()));
    }
}
