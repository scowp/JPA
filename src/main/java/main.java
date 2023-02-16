import br.com.toyota.repository.VeiculoRepository;
import br.com.toyota.view.VeiculoView;

public class main {
    public static void main(String[] args) {

        var veiculoView = VeiculoView.form();
        var veiculoRepository = new VeiculoRepository();

        veiculoRepository.salvarVeiculo(veiculoView);
    }
}
