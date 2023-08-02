package com.example.lazyjetpackcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.lazyjetpackcomposable.ui.theme.LazyJetpackComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyJetpackComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var osList = listOf<String>(
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                        "Android","IOS","Windows","Linux","Unix",
                    )
                    PopulateItems(osList = osList)
                }
            }
        }
    }
}

/*
* The Lazy options lets you lay out the components when
* they're visible in the widget viewport.
*
* The available list of component includes lazyColumn,
* LazyRow and their grid alternatives.
*
* Lazy composables follow the smae set of principles as the RecyclerView.
* widget but remove all that annoying boilerplate code.
*
* */


@Composable
fun PopulateItems(osList: List<String>){
    // Iterating through every item in this list
    LazyColumn(){
        // Adding a single item
//        items(5){
//            Text(text = "Item: $it")
//        }

        items(osList){
            Text(text = "OS name : $it")
        }

    }

}

@Composable
fun CreateRowItem(osName: String){
    Row() {
        Text(text = osName, fontSize =  32.sp)
    }
}


