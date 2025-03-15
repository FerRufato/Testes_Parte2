package br.com.ferufato.testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContratoServiceTest {

    private ContratoService service;
    private IContratoDao mockDao;

    @Before
    public void setup() {
        mockDao = new ContratoDaoMock();
        service = new ContratoService(mockDao);
    }

    @Test
    public void salvarTest() {
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        service.salvar();
        String cliente = service.buscar("1");
        Assert.assertEquals("Cliente Teste", cliente);
    }

    @Test
    public void excluirTest() {
        service.salvar();
        boolean resultado = service.excluir("1");
        Assert.assertTrue(resultado);
    }

    @Test
    public void atualizarTest() {
        service.salvar();
        boolean atualizado = service.atualizar("1", "Novo Cliente");
        Assert.assertTrue(atualizado);
        Assert.assertEquals("Novo Cliente", service.buscar("1"));
    }
}
