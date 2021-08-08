package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Categoria categoria = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "smarthPhone android", new BigDecimal("800"), categoria);

        EntityManager em = JPAUtil.getEntityManager();
        CategoriaDao cDao = new CategoriaDao(em);
        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        cDao.cadastrar(categoria);
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}
