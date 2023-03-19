package sv.edu.utec.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private ArrayList<Frutas> listafrutas;
    ListView lv1;
    Integer[]ImgFfruta={
            R.drawable.aceituna,
            R.drawable.aguacate,
            R.drawable.arandanorojo,
            R.drawable.arandanos,
            R.drawable.banana,
            R.drawable.cerezas,
            R.drawable.durian,
            R.drawable.frambuesa,
            R.drawable.fresas,
            R.drawable.granada,
            R.drawable.guanaba,
            R.drawable.guayaba,
            R.drawable.limon,
            R.drawable.mandarina,
            R.drawable.mango,
            R.drawable.manzana,
            R.drawable.maracuya,
            R.drawable.melon,
            R.drawable.moras,
            R.drawable.naranja,
            R.drawable.papaya,
            R.drawable.pinia,
            R.drawable.sandia,
            R.drawable.toronja,
            R.drawable.uvas
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listafrutas = new ArrayList<Frutas>();

        listafrutas.add(new Frutas("Aceituna","Fuente de calcio, vitamina E, hierro y cobre"));
        listafrutas.add(new Frutas("Aguacate","Contiene vitaminas K, C, B5, B6 y E, potasio y acido folico"));
        listafrutas.add(new Frutas("Arandano rojo","Es rico en vitamina C y polifenoles antioxidantes"));
        listafrutas.add(new Frutas("Arandanos","Son de los alimentos mas antioxidantes, protegen de infecciones y mejoran la circulacion"));
        listafrutas.add(new Frutas("Bananas","Aportan vitaminas A, C B1, B2, B6, B9, E y acido folico"));
        listafrutas.add(new Frutas("Cerezas","Tiene un alto contenido en potasio, fibra, vitaminas A, B1, B3, B6, C, D y E, acido folico, provitamina A, antocianinas y acido elagico."));
        listafrutas.add(new Frutas("Durian","Conocida como la fruta mas apestosa del mundo, refuerza el sistema inmunologico, mejora la digestion y ayuda a fortalecer los huesos."));
        listafrutas.add(new Frutas("Frambuesa","Son ricas en antioxidantes, ácido fólico y vitamina C."));
        listafrutas.add(new Frutas("Fresas","Ayudan a disminuir el nivel de colesterol malo en sangre, son una fuente de vitaminas del grupo B, como la vitamina B6, la niacina, la riboflavina, el ácido pantoténico o el ácido fólico"));
        listafrutas.add(new Frutas("Granada","Esta fruta también ayuda a prevenir el cáncer, protege el corazón, es ligera, digestiva y depurativa, ayuda en caso de diarrea, es afrodisíaca y mejora la fertilidad."));
        listafrutas.add(new Frutas("Guanaba","Es fuente de vitaminas C y A, así como de potasio, zinc, hierro, magnesio y calcio. Mejora la digestión, aumenta la energía, es buena para evitar las hemorroides y aliviar el dolor."));
        listafrutas.add(new Frutas("Guayaba","Contiene mucha agua y pocas calorías y es rica en vitamina A, E, D12, hierro, cobre, calcio, magnesio, potasio, manganeso y fósforo."));
        listafrutas.add(new Frutas("Limon","Además de vitamina C, el limón aporta vitamina A, fibra y minerales como el calcio, el fósforo, el magnesio y el potasio. Su valor calórico es bajo, ya que su contenido es mayoritariamente agua."));
        listafrutas.add(new Frutas("Mandarina","Este cítrico se destaca por su elevada concentración de agua en un 90% y de Vitamina C. También posee otras vitaminas, la A, B1 y B2, así como sales minerales, potasio y ácido fólico"));
        listafrutas.add(new Frutas("Mango","El mango contiene carotenoides, ácido ascórbico, terpenoides y polifenoles: todos responsables de las propiedades preventivas del cáncer."));
        listafrutas.add(new Frutas("Manzana","Son uno de los alimentos con más propiedades beneficiosas para el organismo. Las manzanas son buenas para la digestión, la salud cardiovascular y tienen un gran efecto antiinflamatorio."));
        listafrutas.add(new Frutas("Maracuya","Es una buena fuente de provitamina A, vitamina C y minerales como potasio, fósforo y magnesio."));
        listafrutas.add(new Frutas("Melon","Nos aporta agua, vitaminas A, B, C y E, ácido fólico, fibra, además de minerales como calcio, hierro y potasio; ayuda a mantener hidratado nuestro el cuerpo, elimina toxinas, evita dolores de estómago y neutraliza la acidez estomacal."));
        listafrutas.add(new Frutas("Moras","Ofrece beneficios cognitivos y ayuda a mejorar la memoria, el control del peso corporal, mantener los huesos fuertes, el cuidado de la piel, mejorar la visión y mantener una coagulación sanguínea normal."));
        listafrutas.add(new Frutas("Naranja","La naranja es una de las frutas más saludables y con mayor aporte en vitamina C, además de vitamina A, folatos, fibra y potasio. Es buena para el estreñimiento y ayuda a combatir la anemia."));
        listafrutas.add(new Frutas("Papaya","Las papayas son una excelente fuente de vitamina C. También tiene vitaminas B, alfa y betacaroteno, luteína y zeaxantina, vitamina E, calcio, potasio, vitamina K y licopeno (antioxidante)."));
        listafrutas.add(new Frutas("Piña","La piña es abundante en potasio, yodo y vitaminas A, B y C. Contiene un 85% de agua, hidratos de carbono y fibra, y provee grandes beneficios nutricionales y de salud. Es excelente para las dietas adelgazantes."));
        listafrutas.add(new Frutas("Sandia","Es baja en grasa, y supone un gran aliado para las dietas de adelgazamiento, es antioxidante, cuenta con vitamina A beneficiosa para la salud ocular, aporta hidratación (es 90% agua) ayudando a tener una piel más sana e hidratada."));
        listafrutas.add(new Frutas("Toronja","Por todas sus propiedades y por ser una fruta saludable y naturalmente antiviral, antimicrobiana y antiinflamatoria, la toronja es un buen alimento para fortalecer el sistema inmunológico."));
        listafrutas.add(new Frutas("Uvas","Las uvas tienen importantes beneficios para la salud, gracias a su riqueza en antioxidantes. Por décadas, han sido aliadas contra el envejecimiento, el cáncer y otras enfermedades."));

        AdaptadorFrutas adaptador = new AdaptadorFrutas(this);
        lv1 = findViewById(R.id.lsvFrutas);
        lv1.setAdapter(adaptador);
    }

    class AdaptadorFrutas extends ArrayAdapter<Frutas> {

        AppCompatActivity appCompatActivity;

        AdaptadorFrutas (AppCompatActivity context) {
            super(context, R.layout.fruta, listafrutas);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.fruta, null);

            TextView textView1 = item.findViewById(R.id.tvNombre);
            textView1.setText(listafrutas.get(position).getNombre());

            TextView textView2 = item.findViewById(R.id.tvDescripcion);
            textView2.setText(listafrutas.get(position).getDescripcion());

            ImageView imageView1 = item.findViewById(R.id.imvFruta);
            imageView1.setImageResource(ImgFfruta[position]);
            return(item);
        }
    }
}