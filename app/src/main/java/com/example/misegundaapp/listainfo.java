package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ListView;

public class listainfo extends AppCompatActivity {

    ListView lista;
    String [][] datos = {

            {"info1","Definicion de Celiacos","Reacción inmunológica ante la ingesta de gluten, una proteína presente en el trigo, la cebada y el centeno.\n\n" +
                    "Con el tiempo, la reacción inmunológica al ingerir gluten genera una inflamación que daña el revestimiento del intestino delgado y produce complicaciones médicas. También dificulta la absorción de algunos nutrientes (malabsorción).\n\n" +
                    "El síntoma típico es la diarrea. Otros síntomas incluyen distensión abdominal, fatiga, niveles bajos de hemoglobina (anemia) y osteoporosis. Muchas personas no presentan síntomas.\n\n" +
                    "El tratamiento principal consiste en una dieta estricta libre de gluten que pueda controlar los síntomas y promover la curación del intestino.\n\n"},
            {"info1","Contaminacion Cruzada","La contaminación cruzada -de manera general- se produce cuando los alimentos entran en contacto con agentes ajenos, por lo general nocivos para nuestra salud. \n\n " +
                    "En el caso en el que nos ocupa, este agente es el gluten. Por tanto, para los celiacos y para los sensibles al gluten/trigo,  la contaminación cruzada es el proceso por el cual nuestros alimentos entran en contacto con el gluten. \n\n " +
                    "Pero no solo nuestros alimentos, sino cualquier utensilio, superficie, ingrediente o plato que ha estado en contacto con el gluten, aunque sea minímamente, no puede ser utilizado para cocinar sin gluten o no puede ser ingerido por un celiaco.\n\n " +
                    "Así lo definimos en Celicidad."},
            {"info1","Cuidados del Hogar Celiaco","1. Es indispensable tener un nutricionista de cabecera que esté bien enterado del tema para que le ayude sobretodo al principio.\n\n" +
                    "2. La regla de “todo doble”: si las posibilidades económicas se lo permiten, tener 2 refrigeradoras (una específicamente para que el familiar celíaco mantenga su comida), 2 despensas, 2 vajillas, 2 microondas, 2 fregaderos, 2 juegos de ollas, 2 juegos de tablas para picar, 2 juegos de recipientes o tarros para guardar comida.\n\n" +
                    "3. No permita que la comida de cada día quede librada a la improvisación. Planifique la compra de alimentos y la elaboración de recetas básicas.\n\n" +
                    "4. Realice un correcto almacenamiento de los productos, rotulándolos y destinándoles lugares exclusivos.\n\n" +
                    "5. Jamás compartir: la esponja de lavar platos, los individuales para comer en la mesa o la mantequilla para untar al pan (un cuchillo con boronas de pan la puede hacer tóxica).\n\n" +
                    "6. No porque el producto es natural significa que sea libre de gluten.\n" +
                    "7. Toda la comida empacada que compre debe decir \" libre de gluten, sin gluten o gluten-free\".\n\n" +
                    "8. Los vegetales y frutas deben ser muy bien lavados, puede ser con una dilución exacta de agua con cloro. Cuando compra esos productos nunca hay garantía de que la lechuga no estuvo cerca de un pan.\n\n" +
                    "9. Prefiera los recipientes de vidrio que al no ser porosos dificultan la contaminación.\n\n" +
                    "10. Para la preparación de alimentos lávese las manos constantemente, mantenga las uñas cortas y utilice guantes desechables para manipular ciertos alimentos o recipientes.\n\n" +
                    "11. Los familiares cercanos deben aprender a respetar y hacer respetar ante otros las necesidades de su pariente celíaco de forma que si llegan visitas a la casa, no corten pan o galletas cerca.\n\n" +
                    "12. No presionar o hacer creer al familiar que “por comer un pedacito no le va a pasar nada” hay que respetar que no pueden comer.\n\n" +
                    "13. Hay que tener especial cuidado con ciertos condimentos y especies, o espesantes como el almidón modificado (se excluye el maíz), edulcorantes, muchos dicen: \"advertencia este producto fue elaborado en máquinas que procesan...” y todo lo que tiene la condición de dar forma, color, puede contener gluten o alguna de sus partículas.\n\n" +
                    "14. Algunos condones contienen gluten en el látex y muchos anticonceptivos orales pueden contener entre sus coberturas.\n\n" +
                    "15. Los cosméticos y productos de cuidado personal pueden contener la proteína hidrolizada del trigo (que logra la espuma del champú). Por lo que hay que asegurarse de comprar el producto sin gluten.\n"},
            {"info1","Cuidado con Niños(as)","1. ¡Jamás aisle al niño! lo que hay que hacer es enseñarle a vivir, educarlo muy bien al respecto de su enfermedad.\n\n" +
                    "\n" +
                    "2. Los niños son muy disciplinados y los mismos chiquitos aprenden a reconocer “el símbolo del no en el trigo”.\n\n" +
                    "\n" +
                    "3. Es necesario visitar la escuela y explicar a los maestros, en la soda o comedor y por supuesto a todos los compañeritos la importancia que tiene contribuir y cuidar al paciente. A los niños hay que explicarles que ciertos materiales muy comunes como la plastilina (plasticina) puede ser un veneno porque contiene harina de trigo. Por tal razón la Asociación Pro Personas Celíacas ha visitado algunas escuelas del país para capacitar sobre este tema, con el permiso del Ministerio de Educación Pública. Inclusive hay un cuento infantil escrito por Ani Brenes, que narra “La historia de Tino Delgado” un niño celíaco.\n\n" +
                    "4.“Es muy duro hacer entender a la gente que no se trata de una exageración o una payasada sino de un riesgo de supervivencia y en el caso de niños pequeños el manejo adecuado que de la enfermedad determinará la calidad futura en la vida de ese niño”, explica Viviana Vargas, maestra de preescolar y paciente celíaca diagnosticada desde hace cinco años.\n"},
            {"info1","¿En que consiste el Tratamiento?","Importante:\n\n" +
                    "La celiaquía no se puede curar. El tratamiento a seguir es realizar una dieta libre de gluten de por vida; esto ayuda a que los síntomas desaparezcan y a que sanen las vellosidades en el revestimiento de los intestinos.\n" +
                    "\n\n" +
                    "Si no se realiza el tratamiento adecuado, se pueden dar determinadas complicaciones como trastornos autoinmunitarios, enfermedad ósea, cáncer intestinal, anemia, infertilidad o enfermedad hepática."}
    };

    int[] datosImg = {R.drawable.info1,R.drawable.info1,R.drawable.info1,R.drawable.info1,R.drawable.info1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listainfo);
        //Poner Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        lista = (ListView) findViewById(R.id.lvListinfo);
        lista.setAdapter(new Adaptadorinfo(this, datos, datosImg));



    }
}