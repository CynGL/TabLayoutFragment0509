package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class CachorroFragment extends Fragment {

    ListView lstChorro;]

    //Criar dados
    String nomeChorro[] = {"Mike", "Pulga", "Silvio", "Lulu"};

    String descricaoChorro[] = {
            "Quero ser adotado alguém ai se disponibiliza...",
            "Alguém gosta de Cachorro feio? estou aqui...",
            "Gosto de humano, sou muito carinhoso...",
            "Estou disponível para ser adotado..."
    };
    String numChorro[] = {"5.0", "8.0", "9.0", "9.5"};
    int imgChorro[] = {
            R.drawable.mike, R.drawable.chorroB,
            R.drawable.silvio,R.drawable.lulu
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cachorro, container, false);

        lstChorro = view.findViewById(R.id.lstChorro);

        //Instanciando a classe adaptadora
        CachorroFragment.AdapterChorro adapterChorro = new HomeFragment.AdapterGatos();


        //Carregar a lista com o adaptador
        lstChorro.setAdapter(adapterChorro);

        return view;
    }
}