package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Pedido;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

public class PedidoDao {
    private EntityManager em;

    public PedidoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido Pedido) {
        this.em.persist(Pedido);
    }
    
    public BigDecimal valorTotalVendido() {
    	String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
    	return em.createQuery(jpql, BigDecimal.class).getSingleResult();
    }
}
