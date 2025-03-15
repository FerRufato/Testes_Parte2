package br.com.ferufato.testes;

import java.util.HashMap;
import java.util.Map;

public class ContratoDaoMock implements IContratoDao {

    private Map<String, String> bancoDeDados = new HashMap<>();

    @Override
    public String salvar() {
        bancoDeDados.put("1", "Cliente Teste");
        return "Sucesso";
    }

    @Override
    public String buscar(String id) {
        return bancoDeDados.get(id);
    }

    @Override
    public boolean excluir(String id) {
        return bancoDeDados.remove(id) != null;
    }

    @Override
    public boolean atualizar(String id, String novoDado) {
        if (bancoDeDados.containsKey(id)) {
            bancoDeDados.put(id, novoDado);
            return true;
        }
        return false;
    }
}
