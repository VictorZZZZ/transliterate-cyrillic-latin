# Transliteration on Java

Transliteration using icu4j libs 
Maven dependency:
```
        <dependency>
            <groupId>com.ibm.icu</groupId>
            <artifactId>icu4j</artifactId>
            <version>69.1</version>
        </dependency>
```

To do transliteration just call static method:

```
TranslitUtil.transliterate("Съешь ещё этих мягких булок")
```
