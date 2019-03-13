# mockspresso-reflect-guava

A repackaging of [Guava](https://github.com/google/guava)'s TypeToken and associated classes for use in Mockspresso.

This repo contains no code, we are just repackaging, relocating and trimming guava directly in order to use it in mockspresso without conflicting with existing dependencies of our users.

## Usage
```
repositories { maven { url 'https://oss.sonatype.org/content/repositories/snapshots/' } }
dependencies {
    implementation 'com.episode6.hackit.mockspresso:mockspresso-reflect-guava:27.1-android-r2-SNAPSHOT'
}
```

## LICENSE
Guava is licensed under [The Apache Software License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)
