package com.merlin.bright.cory.cena

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class RecipeListActivity : AppCompatActivity() {

    val mRecipes = ArrayList<Recipe>()

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_list)

        mRecipes.add(Recipe("Pancakes",
                "1 cup all-purpose flour`1 tsp baking powder`dash of salt`1 tbsp sugar`1 egg`1 cup milk`2 tbsp cooking oil",
                "Heat a pan over medium-low heat. In a bowl, mix together the dry ingredients. In another bowl mix together the wet ingredients. Add wet ingredients to dry ingredients; the batter should be lumpy.`Scoop batter onto pan, and flip when you see bubbles.`Flip and cook the other side. Serve hot.",
                R.drawable.pancakes))
        mRecipes.add(Recipe("Scones",
                "2 cups all-purpose flour`1/3 cup sugar`1 tsp baking powder`1/4 tsp baking soda`dash of salt`1/2 cup unsalted butter, frozen`1/2 cup raisins`1/2 cup sour cream`1 large egg`additional 1 tsp sugar",
                "Preheat oven to 400 degrees.`In a bowl, mix flour, 1/3 cup sugar, baking powder, baking soda, and salt. Grate butter into flour mixture and use your fingers to work in butter, mixture should be coarse.`Stir in raisins.`In another bowl, whisk sour cream and egg.`Add sour cream mixture to flour mixture until large dough clumps form. Shape the dough into a ball.`Place on a lightly floured surface and pat into a 7 inch circle roughly 3/4-inch thick. Sprinkle with additional 1 tsp sugar. Cut dough into 8 triangles; place on a cookie sheet lined with parchment paper. Bake until golden brown, about 15 to 17 minutes. Let cool for 5 minutes and serve warm or at room temperature.",
                R.drawable.scones))
        mRecipes.add(Recipe("French Toast",
                "1 loaf of thick sliced bread`6 large eggs`1/4 cup buttermilk`1/2 tsp vanilla extract`dash of cinnamon",
                "Heat pan over medium high heat.`Combine all ingredients in a bowl wide enough to dip bread in.`Dip in one slice of bread in the mixture and flip to coat the other side.`Place bread in pan and flip once browned, usually about a minute.`Repeat for remaining slices.",
                R.drawable.french_toast))
        mRecipes.add(Recipe("Creeps",
                "1/2 cup all-purpose flour`1 egg`1/4 cup milk`1/4 cup water`1 tbsp melted butter`dash of salt",
                "Whisk together the flour and eggs. Then stir in the milk and water, and add salt and butter; mix thoroughly.`Lightly oil your cooking surface and bring to a medium high heat. Scoop the batter onto the griddle; 1/4 cup per crepe. Tilt the pan so that the batter coats the surface evenly.`Cook the crepe for ~2 minutes, until the bottom is light brown. Loosen with a spatula, flip and cook the other side. Serve hot.",
                R.drawable.crepes))
        viewManager = LinearLayoutManager(this)
        viewAdapter = RecipeAdapter(this, mRecipes)
        recyclerView = findViewById<RecyclerView>(R.id.recipe_list).apply {

            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

}