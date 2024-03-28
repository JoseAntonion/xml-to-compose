#  Xml to Compose Migration

This project is a simple demo to migrate from XML classic Android view system to COMPOSE view system

## Dependencies added and configurations

```
buildFeatures {
    compose true
}
```

```
composeOptions {
        kotlinCompilerExtensionVersion '1.3.2'
}
```

```
// COMPOSE MIGRATION
def composeBom = platform('androidx.compose:compose-bom:2022.10.00')
implementation(composeBom)
androidTestImplementation(composeBom)
implementation "androidx.compose.runtime:runtime"
implementation "androidx.compose.ui:ui"
implementation "androidx.compose.foundation:foundation"
implementation "androidx.compose.foundation:foundation-layout"
implementation "androidx.compose.material:material"
implementation "androidx.compose.runtime:runtime-livedata"
implementation "androidx.compose.ui:ui-tooling"
implementation "com.google.accompanist:accompanist-themeadapter-material:0.28.0"
implementation "androidx.activity:activity-compose:1.6.1"
```
