package br.com.toyota.repository;

import br.com.toyota.model.Veiculo;

public class VeiculoRepository extends Repository{

    public VeiculoRepository() {
        super();
    }

    public void salvarVeiculo(Veiculo veiculo){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(veiculo);
        this.entityManager.getTransaction().commit();
        this.fecharRepositorio();
    }
}
