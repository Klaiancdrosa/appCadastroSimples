package br.ulbra.appcadastrosimples;

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {
    MainActivity act;
    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;

    public TelaPrincipal(MainActivity act) {
        this.act = act;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.tela_principal);
        btcadastrar_usuario = (Button)
                act.findViewById(R.id.btcadastrar_usuario);
        bt_listar_usuarios_cadastrados = (Button)
                act.findViewById(R.id.bt_listar_usuarios_cadastrados);

        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }
        });
        bt_listar_usuarios_cadastrados.setOnClickListener(new
                                                                  View.OnClickListener() {
                                                                      @Override
                                                                      public void onClick(View view) {
                                                                          tela_listagem.CarregarTela();
                                                                      }
                                                                  });
    }
    public void setTela_cadastro(TelaCadastroUsuario telaCadastro) {
        this.tela_cadastro = telaCadastro;
    }

    public void setTela_listagem(TelaListagemUsuarios telaListagem) {
        this.tela_listagem = telaListagem;
    }
}