public class MainActivity extends AppCompatActivity {

String CITY;

String API = “Your API Key”;

ImageView search;

EditText etCity;

TextView city,country,time,temp,forecast,humidity,min_temp,max_temp,sunrises,sunsets;

@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

{

etCity = (EditText) findViewById(R.id.Your_city);

search = (ImageView) findViewById(R.id.search);

// CALL ALL ANSWERS :

city = (TextView) findViewById(R.id.city);

country = (TextView) findViewById(R.id.country);

time = (TextView) findViewById(R.id.time);

temp = (TextView) findViewById(R.id.temp);

forecast = (TextView) findViewById(R.id.forecast);

humidity = (TextView) findViewById(R.id.humidity);

min_temp = (TextView) findViewById(R.id.min_temp);

max_temp = (TextView) findViewById(R.id.max_temp);

sunrises = (TextView) findViewById(R.id.sunrises);

sunsets = (TextView) findViewById(R.id.sunsets);

}

}
