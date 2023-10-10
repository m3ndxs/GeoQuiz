package com.example.geoquiz_v4_sqlite;

import java.util.UUID;
public class Respostas {
    private UUID Id;
    private int RespostaCorreta;
    private boolean RespostaOferecida;
    private boolean Colou;

    public Respostas(int RespostaCorreta, boolean RespostaOferecida, boolean Colou) {
        this.RespostaCorreta = RespostaCorreta;
        this.RespostaOferecida = RespostaOferecida;
        this.Colou = Colou;
        Id = UUID.randomUUID();
    }

    public int getRespostaCorreta() {
        return RespostaCorreta;
    }

    public void setRespostaCorreta(int respostaCorreta) {
        RespostaCorreta = respostaCorreta;
    }

    public boolean getRespostaOferecida() {
        return RespostaOferecida;
    }

    public void setRespostaOferecida(boolean RespostaOferecida) {
        RespostaOferecida = RespostaOferecida;
    }

    public boolean getColou() {
        return Colou;
    }

    public void setColou(boolean Colou) {
        Colou = Colou;
    }

    UUID getId(){return Id;};
}
