МАГАЗІН МАГАЗІН ВІДЕОІГОР

Варіанти назви: OktenGames (O.G.)

Технології: Spring Boot or Tomcat, Maven, Spring Security, MySQL, MongoDB (чисто попробувати), Angular, Java 8

Товар: ігри на приставки, приставки (пс5, пс4, пс3, бокс360, бокс х), геймпади, оренда ігор, предзакази

_______________________________________________________

ENTITIES:
_______________________________________________________

public class Game {

int id;
String title;
double price;
String imgUrl;
double score;
String[] screenShotsImgUrl;
String description;
Genre[] genres;
Device[] devices or Platform[] platforms // TODO: create OneToMany relation with devices or just put Platform enum value
String releaseDate; // TODO: probably replace String type with some special Date or Time Java classes
String company;
Game[] additionalContent // if exists

}

public class Device{

int id;
String title;
double price;
Platform platform;
String[] imgUrl;
Capacity capacity;
Color color;
Condition condition;
Game[] extraGames;
Gamepad[] gamepads;

}

public class Gamepad {

int id;
String title;
double price;
Color color;
Platform platform;

}

public class User {

int id;
String username;
String password;
double balance;
Role role;
Product[] shoppingCart // TODO: create base class or interface Product to implement user's shop cart
Product[] wishList

}
_______________________________________________________

ENUMS:
_______________________________________________________

public enum Platform {

PS5, PS4, PS3, X360, XONE

}

public enum Color{

BLACK, WHITE, RED, BLUE, YELLOW, GREY

}

public enum Capacity {

500GB, 750GB, 1TB, 2TB

}

public enum Condition {

NEW, USED

}

public enum Role{

ADMIN, USER

}



