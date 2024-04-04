package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
@Entity
@PrimaryKeyJoinColumn(name = "ID_USUARIO")
public class Cliente extends Usuario implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
    private Date dataNascimento;
    private List<Compra> comprasRealizadas;

    public Cliente() {
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.setLenient(false);
            this.dataNascimento = sdf.parse(dataNascimento);
        }catch (ParseException ex){
            System.out.println("Data em formato errado!");
        }
    }

    public List<Compra> getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(List<Compra> comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }

    public int calcularIdade(){
        if (this.dataNascimento!=null){
            Calendar dtNasc = new GregorianCalendar();
            dtNasc.setTime(this.dataNascimento);
            Calendar hoje = Calendar.getInstance();
            int idade = hoje.get(Calendar.YEAR)- dtNasc.get(Calendar.YEAR);
            //trazendo a data de nasc para o ano atual
            dtNasc.add(Calendar.YEAR, idade);
            if(hoje.before(dtNasc)){
                idade--;
            }
            return idade;
        } else {
            return 0;
        }
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
