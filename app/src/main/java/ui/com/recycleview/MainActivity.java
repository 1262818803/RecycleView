package ui.com.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);//瀑布流布局/3列
        /*LinearLayoutManager layoutManager=new LinearLayoutManager(this);*/
        /*layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);*/ //横向布局显示
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    public void initFruits(){
        for (int i=0;i<2;i++){
            Fruit apple=new Fruit(getRandomLengthName("Apple"),R.drawable.apple);
            fruitList.add(apple);
            Fruit banana=new Fruit(getRandomLengthName("Banana"),R.drawable.banana);
            fruitList.add(banana);
            Fruit organe=new Fruit(getRandomLengthName("Orange"),R.drawable.orange);
            fruitList.add(organe);
            Fruit watermelon=new Fruit(getRandomLengthName("Watermelon"),R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear=new Fruit(getRandomLengthName("Pear"),R.drawable.pear);
            fruitList.add(pear);
            Fruit grape=new Fruit(getRandomLengthName("Grape"),R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple=new Fruit(getRandomLengthName("Pineapple"),R.drawable.pineaoole);
            fruitList.add(pineapple);
            Fruit strawberry=new Fruit(getRandomLengthName("Starwbeery"),R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit mango=new Fruit(getRandomLengthName("Mango"),R.drawable.mango);
            fruitList.add(mango);
        }
    }

    private String getRandomLengthName(String name) {
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<length;i++){
            builder.append(name);
        }
        return  builder.toString();
    }

}
