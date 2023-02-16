package br.com.toyota.view;

import br.com.toyota.model.Veiculo;

import javax.swing.*;
import java.time.LocalDate;

public abstract class VeiculoView {

    private VeiculoView() {
    }

    public static Veiculo form() {
        Veiculo veiculo = new Veiculo();

        Veiculo celular = new Veiculo();

        String modelo = JOptionPane.showInputDialog("Modelo do veiculo: ");
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso do veiculo"));

        return veiculo.setModelo(modelo).setPeso(peso).setAnoFabricacao(LocalDate.now());
    }
}
