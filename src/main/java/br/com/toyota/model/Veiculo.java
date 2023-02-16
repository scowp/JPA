package br.com.toyota.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "sq_veiculos")
    @SequenceGenerator(name = "sq_veiculos", sequenceName = "sq_veiculos", initialValue = 1, allocationSize = 1)
    private long id;
    private String modelo;
    private LocalDate anoFabricacao;
    private int peso;

    public Veiculo(){
    }

    public Veiculo(long id, String modelo, LocalDate anoFabricacao, int peso) {
        this.id = id;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public Veiculo setId(long id) {
        this.id = id;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public Veiculo setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
        return this;
    }

    public int getPeso() {
        return peso;
    }

    public Veiculo setPeso(int peso) {
        this.peso = peso;
        return this;
    }
}
