<!-- omit in toc -->
# Kotlin - Default Empty Activity

<!-- omit in toc -->
## Table of contents

- [Code Snippet](#code-snippet)
- [Resources](#resources)

## Code Snippet

``` kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinDefaultEmptyActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
```

## Resources
