package com.merlin.bright.cory.cena

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RecipeAdapter(private val mContext: Context, private val mRecipes: ArrayList<Recipe>) :
        RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.recipe_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mRecipes.size
    }

    override fun onBindViewHolder(holder: RecipeAdapter.ViewHolder, position: Int) {
        holder.bindRecipe(mRecipes[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val recipeImage: ImageView = itemView.findViewById(R.id.recipe_image)
        private val recipeName: TextView = itemView.findViewById(R.id.recipe_name_text_view)
        fun bindRecipe(recipe: Recipe) {
            recipeName.text = recipe.name
        }

    }

}