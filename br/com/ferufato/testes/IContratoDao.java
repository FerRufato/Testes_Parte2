package br.com.ferufato.testes;

public interface IContratoDao {
    String salvar();
    String buscar(String id);
    boolean excluir(String id);
    boolean atualizar(String id, String novoDado);
}
