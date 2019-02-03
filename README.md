# release-plugin-test

This project is a test of [Maven Release Plugin](http://maven.apache.org/maven-release/maven-release-plugin/index.html).

## Perform a Release

Run a release via cmd line:

```
mvn --batch-mode release:prepare release:perform
```

## Problems encountered

- used maven-release-Plugin `2.4.2` instead of `2.5.3`
- plugin `2.4.2` did not warn about changes not commited
- plugin `2.4.2` did push only projects '0.0.1-SNAPSHOT' to Nexus
- currently only tested on branch master 
