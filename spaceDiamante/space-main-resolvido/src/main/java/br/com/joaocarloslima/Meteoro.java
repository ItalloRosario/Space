package br.com.joaocarloslima;

import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {
    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);

        Random rand = new Random();
        this.tamanho = rand.nextInt(8) + 1;
        this.poder = this.tamanho;
        String path = "images/meteoro/meteoro" + tamanho + ".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);
    }

    public void tomarTiro(Tiro tiro) {
        this.poder -= tiro.getPoder();
    }

    public boolean estaDestruido() {
        return this.poder <= 0;
    }

    public int getPoder() {
        return poder;
    }

    public int getTamanho() {
        return tamanho;
    }
}
