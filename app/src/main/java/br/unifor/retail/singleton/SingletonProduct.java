package br.unifor.retail.singleton;

/**
 * Created by mafra on 09/11/16.
 */

public class SingletonProduct {
    private String nomeUsuario;
    private double nota;
    private String comentario;

    public SingletonProduct() {
    }


    public SingletonProduct(String nomeUsuario, double nota, String comentario) {
        this.nomeUsuario = nomeUsuario;
        this.nota = nota;
        this.comentario = comentario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
