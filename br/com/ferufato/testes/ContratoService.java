package br.com.ferufato.testes;

public class ContratoService {

    private IContratoDao clienteDao;

    public ContratoService(IContratoDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        return clienteDao.salvar();
    }

    public String buscar(String id) {
        return clienteDao.buscar(id);
    }

    public boolean excluir(String id) {
        return clienteDao.excluir(id);
    }

    public boolean atualizar(String id, String novoDado) {
        return clienteDao.atualizar(id, novoDado);
    }
}
