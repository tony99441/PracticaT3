package com.example.practicat3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private MyStringAdapter mApadter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = findViewById(R.id.rv_string_list);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mApadter = new MyStringAdapter(Animes(),MainActivity.this);
        mRecyclerView.setAdapter(mApadter);
    }

    private List<String>dataset(){
        List<String>data = new ArrayList<>();
        data.add("Texto1");
        data.add("Texto2");
        data.add("Texto3");
        data.add("Texto4");
        data.add("Texto5");
        return data;
    }
public class Anime {

        public String nombreanime;
        public  String imagen;
        public boolean favorito;
        public String descripcion;



        public Anime (String nombreanime, String imagen, boolean favorito, String descripcion){
            this.nombreanime= nombreanime;
            this.descripcion = descripcion;
            this.imagen = imagen;
            this.favorito = favorito;


        }

}

public List<Anime> Animes (){
        List<Anime> informacion = new ArrayList<>();
   informacion.add(new Anime("Pokemon", "https://i1.wp.com/hipertextual.com/wp-content/uploads/2020/05/hipertextual-nuevo-pokemon-go-es-hacer-que-tus-pokemon-se-vean-mas-reales-2020697065.jpg?w=1560&ssl=1", false, "Las criaturas pokémon son monstruos que se encuentran en el mundo Pokémon (mezcla entre la Tierra y una versión caricaturizada de ella) que deben ser capturadas por los entrenadores para potenciar sus poderes y características."));
    informacion.add(new Anime("One Piece", "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/one-piece-luffy-1589967502.jpg?crop=1xw:0.888728323699422xh;center,top&resize=640:*", false, "s el legendario tesoro de un valor incalculable que resulta ser la suma del objeto que alguien dejó hace siglos y los tesoros del Rey de los Piratas Gol D."));
    informacion.add(new Anime("Beastars", "data:image/jpeg;base64,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", false, "La historia se desarrolla en un mundo de animales antropomórficos con una división cultural entre carnívoros y herbívoros."));
    informacion.add(new Anime("Naruto", "https://i.pinimg.com/originals/d8/e3/04/d8e3040372030c633df7f7ee5034dfef.png", false, "ompuesto por Sasuke Uchiha, Sakura Haruno y su líder y sensei, Kakashi Hatake. \u200B Más tarde, Sasuke abandona el equipo tras huir de la aldea en busca de Orochimaru"));
    informacion.add(new Anime("Goku", "https://static.wikia.nocookie.net/dragonball/images/c/ca/Son_Goku_dise%C3%B1o_DBS_Broly.png/revision/latest?cb=20180831182644&path-prefix=es", false, "Las criaturas pokémon son monstruos que se encuentran en el mundo Pokémon (mezcla entre la Tierra y una versión caricaturizada de ella) que deben ser capturadas por los entrenadores para potenciar sus poderes y características."));
    informacion.add(new Anime("Pokemon", "https://i1.wp.com/hipertextual.com/wp-content/uploads/2020/05/hipertextual-nuevo-pokemon-go-es-hacer-que-tus-pokemon-se-vean-mas-reales-2020697065.jpg?w=1560&ssl=1", false, "s un personaje ficticio, protagonista de la serie de manga y anime Dragon Ball. Fue creado por Akira Toriyama en 1984."));
    informacion.add(new Anime("Pokemon", "https://i1.wp.com/hipertextual.com/wp-content/uploads/2020/05/hipertextual-nuevo-pokemon-go-es-hacer-que-tus-pokemon-se-vean-mas-reales-2020697065.jpg?w=1560&ssl=1", false, "Las criaturas pokémon son monstruos que se encuentran en el mundo Pokémon (mezcla entre la Tierra y una versión caricaturizada de ella) que deben ser capturadas por los entrenadores para potenciar sus poderes y características."));
    informacion.add(new Anime("Pokemon", "https://i1.wp.com/hipertextual.com/wp-content/uploads/2020/05/hipertextual-nuevo-pokemon-go-es-hacer-que-tus-pokemon-se-vean-mas-reales-2020697065.jpg?w=1560&ssl=1", false, "Las criaturas pokémon son monstruos que se encuentran en el mundo Pokémon (mezcla entre la Tierra y una versión caricaturizada de ella) que deben ser capturadas por los entrenadores para potenciar sus poderes y características."));
    informacion.add(new Anime("Pokemon", "https://i1.wp.com/hipertextual.com/wp-content/uploads/2020/05/hipertextual-nuevo-pokemon-go-es-hacer-que-tus-pokemon-se-vean-mas-reales-2020697065.jpg?w=1560&ssl=1", false, "Las criaturas pokémon son monstruos que se encuentran en el mundo Pokémon (mezcla entre la Tierra y una versión caricaturizada de ella) que deben ser capturadas por los entrenadores para potenciar sus poderes y características."));
    informacion.add(new Anime("Pokemon", "https://i1.wp.com/hipertextual.com/wp-content/uploads/2020/05/hipertextual-nuevo-pokemon-go-es-hacer-que-tus-pokemon-se-vean-mas-reales-2020697065.jpg?w=1560&ssl=1", false, "Las criaturas pokémon son monstruos que se encuentran en el mundo Pokémon (mezcla entre la Tierra y una versión caricaturizada de ella) que deben ser capturadas por los entrenadores para potenciar sus poderes y características."));

}


}