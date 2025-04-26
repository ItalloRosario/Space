package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    Nave nave = new Nave (280, 400, 10, Direcao.DIREITA);
    ArrayList<Asset> assets;
    private int pontos = 0;
    private int nivel = 1;

    public Jogo() {
        this.assets = new ArrayList<>();
    }

    public Tiro atirar() {
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {
        Random rand = new Random();
        int x = rand.nextInt(640);
        int y = 0;
        Meteoro meteoro = new Meteoro(x, y, 1, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public void pontuar() {
        pontos++;
        if (pontos % 10 == 0 && nivel < 4) {
            nivel++;
        }
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public Nave getNave() {
        return nave;
    }
}
