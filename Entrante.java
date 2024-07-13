package com.midominio.restaurante;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EntrantesActivity extends AppCompatActivity {

    ListView listaEntrantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_entrantes);

        listaEntrantes = findViewById(R.id.lista_entrantes);

        Entrante [] entr = {

                new Entrante("Bruschetta de Tomate y Albahaca", "Pan tostado, tomate fresco picado, albahaca, aceite de oliva, sal", 6.5),
                new Entrante("Ceviche de Camarones", "Camarones, limón, cebolla morada, cilantro, ají, aguacate opcional", 9),
                new Entrante("Tartaletas de Champiñones y Queso de Cabra", "Masa quebrada, champiñones, queso de cabra", 7),
                new Entrante("Croquetas de Jamón Ibérico", "Jamón ibérico, bechamel, huevo, pan rallado", 8),
                new Entrante("Hummus con Pan Pita", "Garbanzos, tahini, aceite de oliva, limón, ajo, pan pita", 5),
                new Entrante("Antipasto de Verduras a la Parrilla", "Berenjena, calabacín, pimientos, aceite de oliva, hierbas", 6),
                new Entrante("Rollitos de Primavera con Salsa de Maní", "Vegetales, carne opcional, masa de rollitos, salsa de maní", 7),
                new Entrante("Empanadas de Espinacas y Queso", "Espinacas, queso feta o mozzarella, masa de empanada", 6),
                new Entrante("Gazpacho Andaluz", "Tomate, pimiento, pepino, cebolla, ajo, aceite de oliva, vinagre, pan duro", 4),
                new Entrante("Patatas Bravas", "Patatas, salsa brava, alioli", 5),
                new Entrante("Tartar de Salmón y Aguacate", "Salmón, aguacate, cebolla morada, cilantro, limón, aceite de oliva", 10),
                new Entrante("Quesadillas de Pollo", "Tortillas, pollo desmenuzado, queso, guarniciones", 8),
                new Entrante("Gyozas de Cerdo", "Carne de cerdo picada, verduras, masa de gyoza", 7),
                new Entrante("Carpaccio de Res", "Carne de res, aceite de oliva, limón, parmesano, alcaparras", 9),
                new Entrante("Mozzarella Caprese", "Tomate, mozzarella fresca, albahaca fresca, aceite de oliva, vinagre balsámico", 6),
                new Entrante("Camarones al Ajillo", "Camarones, aceite de oliva, ajo, guindilla, perejil", 11),
                new Entrante("Pulpo a la Gallega", "Pulpo, aceite de oliva, pimentón dulce, sal gorda", 12),
                new Entrante("Mini Quiches de Espinacas", "Espinacas, cebolla, queso, crema de leche, masa de quiche", 6),
                new Entrante("Calamares a la Romana", "Calamares, harina, aceite de oliva, limón, salsa tártara", 9),
                new Entrante("Alcachofas con Jamón", "Alcachofas, jamón serrano, ajo, aceite de oliva", 8)


        };
        ArrayAdapter <Entrante> adaptadorEntrantes = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, entr);
        listaEntrantes.setAdapter(adaptadorEntrantes);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }



    }
}
