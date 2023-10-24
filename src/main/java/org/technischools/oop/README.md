# Programowanie Obiektowe

* [Programowanie Obiektowe](#programowanie-obiektowe)
    * [Praca Domowa](#praca-domowa)

---

## Praca domowa

---

Zadanie 1.  
Zdefiniuj abstrakcyjną klasę modelującą zwierzę. Klasa powinna posiadać:
- prywatne pole typu int - wiek;
- prywatne pole typu boolean - płeć;
- potrzebne akcesory;
- potrzebne konstruktory;
- publiczną abstrakcyjną bezargumentową metodę `grow` typu boolean;

Następnie zaimplementuj dwie klasy pochodne reprezentujące:
- zające
- makaki

Obie klasy powinny posiadać implementację metody grow, zwiększającą wiek o 1
i zwracającą informacją czy zwierzę zmarło. Na potrzeby zadania przyjmijmy, że
zając żyje maksymalnie 5 lat, a makak 27.

Napisz klasę reprezentującą ekosystem. Klasa składa się z:
- prywatnej tablicy zwierząt;
- konstruktora, przyjmującego w argumencie powyższą tablicę;
- publicznej bezargumentowej metody `report` - wyświetlającą raport na temat
  obecnych zwierząt w ekosystemie (liczbę osobników każdej płci, z podziałem na gatunek)
- publicznej bezargumentowej metody `step` - wykonującej symulację jednego roku w ekosystemie.
  Należy zwiększyć wiek wszystkich zwierząt, usunąć umierające zwierzęta, a także sprawdzić
  czy nie narodziły się nowe, zgodnie z poniższymi zasadami;

Co tok zwierzęta tego samego gatunku łączą się w pary (za każdym razem nowe). Każda para
w kolejnym roku urodzi odpowiednią ilość młodych losowej płci. Przyjmijmy dane założenia:
- zające łączą się w pary, jeżeli mają co najmniej rok. Każda para rodzi dwa młode.
- makaki łączą się w pary, jeżeli mają co najmniej trzy lata. Jeden samiec może zapłodnić
  2 samice, tak jakby był w dwóch parach. Każda zapłodniona samica rodzi jedno młode.

Np.  
Stan początkowy:
- zające - 5 płodnych samców i 4 płodne samice
- makaki - 2 płodne samce i 3 płodne samice

Po 1 roku urodzi się 8 nowych zająców (bo powstaną 4 pary) i 3 nowe makaki (bo jest wystarczająco
samców żeby zaspokoić każdą samicę).

Do losowania płci można wykorzystać klasę `Random`, np:

```java
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random(); // tworzenie generatora
        boolean rd = random.nextBoolean(); // wygenerowanie boola
    }
}
```

---

Zadanie 2.  
Stwórz klasę `User`, reprezentującą użytkownika. Klasa powinna
zawierać:
- prywatne pole typu String - `login`;
- prywatne pole typu String - `email`;
- prywatne pole typu String - `phoneNumber`;
- prywatne pole typu boolean - `isEmailNotificationsOn`;
- prywatne pole typu boolean - `isSMSNotificationsOn`;
- odpowiedni konstruktor, akcesory i mutatory (gettery i settery);

Dany jest interfejs `NotificationProvider`, posiadający
metodę `send`, przyjmującą w argumentach wiadomość i 
użytkownika do którego tę wiadomość wysłać.

Stwórz klasy implementujące dany interfejs, kolejno:
- `EmailProvider` - do wysyłania powiadomień email
- `SMSProvider` - do wysyłania powiadomień sms

Odpowiednie implementacje metody `send` powinny wyświetlać
na konsoli typ powiadomienia, wiadomość i adresata, jeżeli
użytkownik ma włączony dany typ powiadomień, np:  
`Wysyłam SMS o treści: "Cześć" do użytkownika user123 na 
numer 123456789`

`Wysyłam maila o treści: "Cześć" do użytkownika user123 na
adres user@mail.com`

Stwórz klasę `NotificationService`, która będzie posiadać:
- prywatną tablicę typu `NotificationProvider`
- bezargumentowy konstruktor, tworzący powyższą tablicę
zawierającą po jednej instancji `EmailProvider` i 
`SMSProvider`
- publiczną metodę `notify`, przyjmującą w argumencie wiadomość i
  użytkownika, którego należy powiadomić. Metoda w zależności 
od preferencji użytkownika wyśle odpowiednie rodzaje powiadomień.