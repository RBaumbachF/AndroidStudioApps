package android.ejemplo.submenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final int days = 1;
    private static final int monday = 11;
    private static final int tuesday = 12;
    private static final int wednesday = 13;
    private static final int thursday = 14;
    private static final int friday = 15;
    private static final int saturday = 16;
    private static final int sunday = 17;
    private static final int months = 2;
    private static final int january = 21;
    private static final int february = 22;
    private static final int march = 23;
    private static final int april = 24;
    private static final int may = 25;
    private static final int june = 26;
    private static final int july = 27;
    private static final int august = 28;
    private static final int september = 29;
    private static final int october = 210;
    private static final int november = 211;
    private static final int december = 212;

    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu smnuDays = menu.addSubMenu(Menu.NONE, days, Menu.NONE, "Días de la semana");
        smnuDays.add(Menu.NONE, monday, Menu.NONE, "Lunes");
        smnuDays.add(Menu.NONE, tuesday, Menu.NONE, "Martes");
        smnuDays.add(Menu.NONE, wednesday, Menu.NONE, "Miércoles");
        smnuDays.add(Menu.NONE, thursday, Menu.NONE, "Jueves");
        smnuDays.add(Menu.NONE, friday, Menu.NONE, "Viernes");
        smnuDays.add(Menu.NONE, saturday, Menu.NONE, "Sábado");
        smnuDays.add(Menu.NONE, sunday, Menu.NONE, "Domingo");
        SubMenu smnuMonths = menu.addSubMenu(Menu.NONE, months, Menu.NONE, "Meses del año");
        smnuMonths.add(Menu.NONE, january, Menu.NONE, "Enero");
        smnuMonths.add(Menu.NONE, february, Menu.NONE, "Febrero");
        smnuMonths.add(Menu.NONE, march, Menu.NONE, "Marzo");
        smnuMonths.add(Menu.NONE, april, Menu.NONE, "Abril");
        smnuMonths.add(Menu.NONE, may, Menu.NONE, "Mayo");
        smnuMonths.add(Menu.NONE, june, Menu.NONE, "Junio");
        smnuMonths.add(Menu.NONE, july, Menu.NONE, "Julio");
        smnuMonths.add(Menu.NONE, august, Menu.NONE, "Agosto");
        smnuMonths.add(Menu.NONE, september, Menu.NONE, "Septiembre");
        smnuMonths.add(Menu.NONE, october, Menu.NONE, "Octubre");
        smnuMonths.add(Menu.NONE, november, Menu.NONE, "Noviembre");
        smnuMonths.add(Menu.NONE, december, Menu.NONE, "Diciembre");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mensaje = "";
        TextView tvDays = findViewById(R.id.textView);
        switch (item.getItemId()) {
            case monday:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case tuesday:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case wednesday:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case thursday:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case friday:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case saturday:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case sunday:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case january:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case february:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case march:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case april:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case may:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case june:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case july:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case august:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case september:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case october:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case november:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            case december:
                mensaje = (String)item.getTitle();
                tvDays.setText("Pulsado " + mensaje);
                return true;
            default:
                return super.onOptionsItemSelected((MenuItem) item);
        }
    }

}