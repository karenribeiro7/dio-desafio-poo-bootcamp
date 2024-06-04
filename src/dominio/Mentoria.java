package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    
    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", titulo=" + getTitulo() + ", descricao=" + getDescricao() + "]";
    }
}
