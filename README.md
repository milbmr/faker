# Java Faker (Modern Fork)

[![Maven Status](https://img.shields.io/maven-central/v/io.github.milbmr/faker?style=flat&color=green
)](http://mvnrepository.com/artifact/io.github.milbmr/faker)
[![License: Apache](http://img.shields.io/:license-apache-green.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

A modern, maintained fork of the original [`java-faker`](https://github.com/DiUS/java-faker) library — now updated for **Java 17+**, Gradle builds, and active maintenance.

Java Faker generates realistic fake data for testing, prototyping, and data anonymization.  
Easily create names, addresses, phone numbers, emails, dates, and thousands of other localized fake values.

---

## ✨ Features

- ✅ **Java 17+ compatible**
- ✅ Active maintenance and bug fixes
- ✅ Hundreds of faker categories (names, addresses, finance, internet, lorem, etc.)
- ✅ Compatible with **Maven** and **Gradle**
- ✅ Fully deterministic with seed support
- ✅ Modernized build (Gradle, modularized resources, JUnit 5 tests)

---

## 📦 Installation

### Maven
```xml
<dependency>
    <groupId>io.github.milbmr</groupId>
    <artifactId>faker</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle
```groovy
dependencies {
    implementation 'io.github:milbmr:1.0.0'
}
```

## 🚀 Quick Start
In your Java code

```java
Faker faker = new Faker();

String name = faker.name().fullName(); // Miss Samanta Schmidt
String firstName = faker.name().firstName(); // Emory
String lastName = faker.name().lastName(); // Barton

String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
```
Fakers
-----
* Address
* Ancient
* Animal
* App
* Aqua Teen Hunger Force
* Artist
* Avatar
* Back To The Future
* Aviation
* Basketball
* Beer
* Bojack Horseman
* Book
* Bool
* Business
* ChuckNorris
* Cat
* Code
* Coin
* Color
* Commerce
* Company
* Crypto
* DateAndTime
* Demographic
* Disease
* Dog
* DragonBall
* Dune
* Educator
* Esports
* EnglandFootBall
* File
* Finance
* Food
* Friends
* FunnyName
* GameOfThrones
* Gender
* Hacker
* HarryPotter
* Hipster
* HitchhikersGuideToTheGalaxy
* Hobbit
* HowIMetYourMother
* IdNumber
* Internet
* Job
* Kaamelott
* LeagueOfLegends
* Lebowski
* LordOfTheRings
* Lorem
* Matz
* Music
* Name
* Nation
* Number
* Options
* Overwatch
* PhoneNumber
* Photography
* Pokemon
* Princess Bride
* Relationship Terms
* RickAndMorty
* Robin
* RockBand
* Shakespeare
* Sip
* SlackEmoji
* Space
* StarCraft
* StarTrek
* Stock
* Superhero
* Team
* TwinPeaks
* University
* Weather
* Witcher
* Yoda
* Zelda

Usage with Locales
-----

```java
Faker faker = new Faker(new Locale("YOUR_LOCALE"));
```

Supported Locales
-----
* bg
* ca
* ca-CAT
* da-DK
* de
* de-AT
* de-CH
* en
* en-AU
* en-au-ocker
* en-BORK
* en-CA
* en-GB
* en-IND
* en-MS
* en-NEP
* en-NG
* en-NZ
* en-PAK
* en-SG
* en-UG
* en-US
* en-ZA
* es
* es-MX
* fa
* fi-FI
* fr
* he
* hu
* in-ID
* it
* ja
* ko
* nb-NO
* nl
* pl
* pt
* pt-BR
* ru
* sk
* sv
* sv-SE
* tr
* uk
* vi
* zh-CN
* zh-TW

LICENSE
-------
Copyright (c) 2025 milbmr. See the LICENSE file for license rights and limitations.
