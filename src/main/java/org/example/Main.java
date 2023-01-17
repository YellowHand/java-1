package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      --- ZADANIA ---

//        String:
//        1. Stworzyć kod, gdzie użytkownik podaje swoje imię i nazwisko, a następnie obie te
//        wartości są wyświetlane w formacie:
//         “ Nazywasz się [imię] i masz na nazwisko [nazwisko] “.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj swoje imie: ");
//        String name = sc.nextLine();
//
//        Scanner sc2 = new Scanner(System.in);
//        System.out.print("Podaj swoje nazwisko: ");
//        String surname = sc2.nextLine();
//
//        System.out.printf("Nazywasz się %s i masz na nazwisko %s", name, surname);


//        3. Napisać program, który zwraca długość podanego imienia.


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj swoje imie: ");
//        String name = sc.nextLine();
//
//        System.out.println(name.length());

//        4. Napisać program, który wyciąga z hasła “Veni, Vidi, Vici” słowo “Vidi” i je wypisuje.

//        String str = "Veni, Vidi, Vici";
//        System.out.println(str.substring(6,10));

//        5. Napisać program, który zamieni hasło “si vis pacem para bellum” na zapis wielkimi
//        literami i je wypisze.

//        String str = "si vis pacem para bellum";
//        System.out.println(str.toUpperCase());


//        If:
//        1. Napisz program, który sprawdza czy liczba jest dodatnia czy ujemna.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj liczbe: ");
//        int liczba = sc.nextInt();
//
//
//        if (liczba == 0) {
//            System.out.println("Podana liczba jest zerem");
//        } else if (liczba >= 1) {
//            System.out.println("Liczba jest dodatnia");
//        } else {
//            System.out.println("Podana liczba jest ujemna");
//        }


//        2. Program, który pobiera od użytkownika jego wiek, a następnie wypisuje czy kto jest
//        młody, w średnim wieku, stary (przedział : 0-18,19-65, 65+ )

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj wiek: ");
//        int age = sc.nextInt();
//
//        if (age <= 18) {
//            System.out.println("Jesteś młody");
//        } else if (age <= 65) {
//            System.out.println("Jesteś w średnim wieku");
//        } else {
//            System.out.println("Jesteś stary");
//        }



//        3. Napisz program, który pobiera od użytkownika liczbę, a następnie informuje czy
//        liczba jest w przedziale od 39 do 55.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj liczbe: ");
//        int liczba = sc.nextInt();
//
//        if (liczba >= 39 && liczba <= 55) {
//            System.out.println("Liczba jest w przedziale od 39 do 55");
//        } else {
//            System.out.println("Liczba jest poza przedziałem");
//        }


//        Pętle for:
//        1. Wypisać liczby od 0 do 30. Każda liczba powinna być w nowej linii.

//        for (int i = 0; i < 31; i++) {
//            System.out.println(i);
//        }

//        2. Wypisać tylko liczby parzyste z przedziału od 3 do 35.  Każda liczba powinna być
//        zapisana po przecinku w formie ciągu.

//        for (int i = 3; i < 36; i++) {
//            if (i % 2 == 0)
//            System.out.print(i + ", ");
//        }

//        3. Wypisać liczby nieparzyste malejąco od 20 do -10. Każda liczba powinna być w
//        nowej linii.

//        for (int i = 20; i > -11; i--) {
//            if (i % 2 != 0)
//            System.out.println(i);
//        }

//        4. Wypisać co drugą liczbę od 0 do 50, ale tylko takie, które są podzielne przez 8.

//        for (int i = 0; i < 51; i++) {
//            if (i % 8 == 0)
//                System.out.println(i);
//        }

//        5. Stworzyć kwadrat za pomocą dowolnego znaku.
//******
//******
//******
//******
//******

//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

//        6. Stworzyć za pomocą dowolnego znaku trójkąt prostokątny.
//*
//**
//***
//****
//*****

//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//        7. Stworzyć choinkę za pomocą dowolnego znaku. DO ZROBIENIA!
//*
//***
//*****
//*


//        for (int i = 1; i <= 3; i++)
//        {
//            int n = 3;
//            for (int j = 1; j <= n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k = i; k >= 1; k--)
//            {
//                System.out.print("*");
//            }
//            for (int l = 2; l <= i; l++)
//            {
//                System.out.print("*");
//            }
//            for (int v = 3; v <= i; v++)
//            {
//                System.out.println();
//                for (int c = 0; c <= 1; c++){
//                    System.out.print(" ");
//                }
//                System.out.println("*");
//            }
//            System.out.println();
//        }



//        8. Stworzyć piramidę za pomocą dowolnego znaku.
//*
//***
//*****
//*******
//*********

//        for (int i = 0; i < 9; i += 2) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }


//        9. (!)  Napisać kod, który tworzy trójkąt pascala.
//                https://pl.wikipedia.org/wiki/Tr%C3%B3jk%C4%85t_Pascala


//        for (int i = 0; i < 6; i++) {
//            int x = 1;
//            System.out.printf("%" + (6 - i) * 2 + "s", "");
//            for (int j = 0; j <= i; j++) {
//                System.out.printf("%4d", x);
//                x = x * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }



//        10. (!) Napisać kod, który wypiszę literę alfabetu A (za pomocą gwiazdek)


//        for (int i = 0; i <= 8; i++)
//        {
//            for (int j = 0; j <= 8 / 2; j++)
//            {
//                if ((j == 0 || j == 8 / 2) && i != 0 || i == 0 || i == 8 / 2) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }





//        Pętla While

//        1. Wypisać liczby od 15 do 75. Każda liczba powinna być w nowej linii.

//        int i = 0;
//        while (i <= 75) {
//            if (i > 14) {
//            System.out.println(i);
//            }
//            i++;
//        }

//        2. Użytkownik musi podać liczbę w przedzial od 1 do 10. Jeśli użytkownik poda liczbę
//        spoza zakresu, program trwa dalej, informując, że jest się poniżej lub powyżej
//        danego zakresu.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj liczbę: ");
//        int liczba = sc.nextInt();
//
//        while (true) {
//            if (liczba >= 1 && liczba <= 10) {
//                System.out.println("Liczba miesci sie w zakresie " + liczba);
//                break;
//            } else if (liczba > 10) {
//                System.out.println("Podana liczba jest powyżej zakresu!");
//                System.out.print("Podaj liczbę: ");
//                liczba = sc.nextInt();
//            } else {
//                System.out.println("Podana liczba jest poniżej zakresu!");
//                System.out.print("Podaj liczbę: ");
//                liczba = sc.nextInt();
//            }
//        }




//        3. Zamienic poniższy kod:
//        int x = 5, y = 10, n =5;
//        while (n>=1)
//        {
//            System.out.println(x+y);
//            n-- ;
//        }
//        na pętlę for.

//        int n = 5;
//        int x = 5, y = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.println(x + y);
//        }


//        4. Napisać program, który dodaje liczby co trzy począwszy od 0 aż wartość osiągnie 99.

//        int liczba = 0;
//        while (liczba >= 0) {
//            liczba += 3;
//            if (liczba > 100) {
//                break;
//            }
//            System.out.println(liczba);
//        }


//        5. Zgaduj, zgadula - gra losuję liczbę z dowolnego przedziału (od 0 do 10 będzie
//        optymalne) i użytkownik odpowiada na wylosowaną liczbę tak długo aż trafi.

//        Random rng = new Random();
//        int liczba = rng.nextInt(0,11);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj szukaną liczbe: ");
//        int x = sc.nextInt();
//
//        while (true) {
//            if ( liczba == x) {
//                System.out.println("Zgadleś szukaną liczbę: " + liczba);
//                break;
//            } else if (x > 10 || x < 0) {
//                System.out.println("Liczba jest poza zakresem!");
//                System.out.print("Podaj szukana liczbę: ");
//                x = sc.nextInt();
//            } else {
//                System.out.print("Podaj szukana liczbę: ");
//                x = sc.nextInt();
//            }
//        }






//        Pętla Do-While
//        1. Wypisać liczby od 0 do 10. Każda liczba powinna być w nowej linii.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);


//        2. Zamienić poniższy kod:
//        for(int i=1, value = 10; i<=10; i++) {
//            value = value * 3;
//            System.out.println(value);
//        }

//        int i = 1;
//        int value = 10;
//        do {
//            i++;
//            value *= 3;
//            System.out.println(value);
//
//        } while (i <= 10);


//        3. (!) Napisać kod, który będzie symulował stacje paliw. Użytkownik podaje liczbę od 0
//        do 50, które będą udawały litry paliwa. Gdy licznik pętli osiągnie właściwą, podaną
//        liczbę, program ma się zakończyć. Program powinien wypisywać aktualne litry paliwa
//        (dla zaokrąglenia przyjmijmy, że zawsze wpada do baku 1 litr) oraz aktualną kwotę
//        do zapłaty (przyjmijmy 6,50 za litr)

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj liczbę litrow od 0 do 50: ");
//        int litry = sc.nextInt();
//        double cena = 6.50;
//        int licznik = 0;
//
//
//        do {
//
//            if (litry == 0 ) {
//                System.out.println("Nie zalewasz paliwa!");
//                break;
//            } else if (litry > 50) {
//                System.out.println("Przelales paliwo!");
//                break;
//            }
//            licznik++;
//            System.out.println("Cena paliwa " + licznik * cena);
//
//        } while (licznik <= litry);


//      --- Powtórzenie ---





//        1. Zadeklaruj i zainicjalizuj zmienną typu int z wartością 5;

//        int q = 5;

//        2. Zadeklaruj i zainicjalizuj zmienną typu float z wartością 5.0;

//        float w = 5.0f;

//        3. Zadeklaruj i zainicjalizuj zmienną typu boolean z wartością true;

//        boolean e = true;

//        4. Zadeklaruj i zainicjalizuj zmienną typu String z wartością “TEST”;

//        String r = "TEST";

//        5. Zadeklaruj i zainicjalizuj zmienną typu double z wartością 10.0;

//        double t = 10.0;

//        6. Zadeklaruj i zainicjalizuj zmienną typu short z wartością 30000;

//        short y = 30000;

//        7. Zadeklaruj i zainicjalizuj zmienną typu byte z wartością 120;

//        byte u = 120;

//        8. Zadeklaruj i zainicjalizuj zmienną typu long z wartością 1000000;

//        long i = 1000000L;

//        9. Zadeklaruj i zainicjalizuj zmienną typu char z wartością ‘c’;

//        char o = 'c';

//        10. Wypisać wszystkie powyższe zmienne (9 razy pewna komenda).

//        System.out.println(w);
//        System.out.println(e);
//        System.out.println(r);
//        System.out.println(t);
//        System.out.println(y);
//        System.out.println(u);
//        System.out.println(i);
//        System.out.println(o);

//        11. Pobierz daną od użytkownika i wyświetl ją na ekranie.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj liczbe: ");
//        int z = sc.nextInt();
//        System.out.println("Twoja liczba: " + z);

//        12. Stwórz zmienną int z wartością 5, a następnie wyrażenie “if”, które wypisze tą
//        wartość na ekranie, gdy zmienna jest równa 5.

//        int x = 5;
//        if (x == 5) {
//            System.out.println(x);
//        }

//        13. Stwórz zmienną int z wartością 5, a następnie wyrażenie “if”, które wypisze tą
//        wartość na ekranie, gdy zmienna jest większa od 4, a wypisze “lipa”, gdy wartość jest
//                mniejsza

//        int x = 5;
//        if (x > 4) {
//            System.out.println(x);
//        } else {
//            System.out.println("Lipa");
//        }

//        14. Zadeklarować dwie zmienne typu int z wartościami 10 oraz 20, a następnie wykonać
//        operację dodawania i wyświetlić wynik.

//        int x = 10, y = 20;
//        System.out.println(x + y);

//        15. Zadeklarować dwie zmienne typu int z wartościami 10 oraz 20, a następnie wykonać
//        operację mnożeniai wyświetlić wynik.

//        int x = 10, y = 20;
//        System.out.println(x * y);

//        16. Zadeklarować dwie zmienne typu int z wartościami 10 oraz 20, a następnie wykonać
//        operację odejmowania i wyświetlić wynik.

//        int x = 10, y = 20;
//        System.out.println(x - y);

//        17. Zadeklarować dwie zmienne typu int z wartościami 10 oraz 20, a następnie wykonać
//        operację dzielenia i wyświetlić wynik.

//        int x = 10, y = 20;
//        System.out.println(x / y);

//        18. Napisać dwie zmienne dowolnego typu z wartościami 5 i 10, a następnie wypisać
//        rezultat “Czy a jest większe od b”.

//        int a = 5, b = 10;
//        System.out.println(a > b);

//        19. Napisać dwie zmienne dowolnego typu z wartościami 5 i 10, a następnie wypisać
//        rezultat “Czy a jest mniejsze od b”.

//        int a = 5, b = 10;
//        System.out.println(a < b);

//        20. Napisać dwie zmienne dowolnego typu z wartościami 5 i 10, a następnie wypisać
//        rezultat “Czy a jest większe bądź równe od b”.

//        int a = 5, b = 10;
//        System.out.println(a >= b);

//        21. Napisać dwie zmienne dowolnego typu z wartościami 5 i 10, a następnie wypisać
//        rezultat “Czy a jest mniejsze bądź równe od b”.

//        int a = 5, b = 10;
//        System.out.println(a <= b);

//        22. Napisać dwie zmienne dowolnego typu z wartościami 5 i 10, a następnie wypisać
//        rezultat “Czy a jest równe b”.

//        int a = 5, b = 10;
//        System.out.println(a == b);

//        23. Napisać dwie zmienne dowolnego typu z wartościami 5 i 10, a następnie wypisać
//        rezultat “Czy a jest różne b”

//        int a = 5, b = 10;
//        System.out.println(a != b);

//        24. Napisać wyrażenie if, które wypisze “Czerwone”, gdy zmienna auto ma wartoś 5 i
//        zmienna prędkość ma wartość 50.0 (zmienna prędkość jest stała, zmienna auto
//        pobierana od użytkownika)

//        double predkosc = 50.0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj wartosc auta: ");
//        int auto = sc.nextInt();
//        if (auto == 5 && predkosc == 50.0) {
//            System.out.println("Czerwone");
//        }

//        25. Napisać wyrażenie if, które wypisze “Zielone”, gdy zmienna auto ma wartoś 3 lub
//        zmienna prędkość ma wartość 100.0. (zmienna prędkość jest stała, zmienna auto
//        pobierana od użytkownika)

//        double predkosc = 100.0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj wartosc auta: ");
//        int auto = sc.nextInt();
//        if (auto == 3 || predkosc == 100.0) {
//            System.out.println("Zielone");
//        }

//        26. Napisać pętle for, która wypisze wartość licznika od 0 do 15.

//        for (int i = 0; i < 16; i++) {
//            System.out.println(i);
//        }

//        27. Napisać pętle for, która wypisze wartość licznika od 0 do 15, ale pominie krok 7.

//        for (int i = 0; i <16 ; i++) {
//            if (i == 7) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        28. Napisać pętle for, która wypisze wartość licznika od 0 do 15, ale przerwie się po 8
//        powtórzeniach.

//        for (int i = 0; i < 16; i++) {
//            if (i == 8) {
//                break;
//            }
//            System.out.println(i);
//        }

//        29. Napisać pętle while, która wypisze licznik od 0 do 15.

//        int i = 0;
//        while (i < 16) {
//            System.out.println(i);
//            i++;
//        }

//        30. Napisać pętle do while, która wypisze licznik od 0 do 15.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 16);

//        31. Stworzyć stringa, “PrOgRaMoWaNiE JeSt SuPeR”, a następnie zamieni całość na
//        małe litery.

//        String x = "PrOgRaMoWaNiE JeSt SuPeR";
//        System.out.println(x.toLowerCase());

//        32. Stworzyć stringa, “PrOgRaMoWaNiE JeSt SuPeR”, a następnie zamieni całość na
//        male litery.

//        String x = "PrOgRaMoWaNiE JeSt SuPeR";
//        System.out.println(x.toLowerCase());

//        33. Stworzyć stringa, “PrOgRaMoWaNiE JeSt SuPeR”, a następnie wypisać co jest pod
//        indeksem 15.

//        String x = "PrOgRaMoWaNiE JeSt SuPeR";
//        System.out.println(x.charAt(15));

//        34. Stworzyć stringa, “PrOgRaMoWaNiE JeSt SuPeR”, a następnie połączy to z tekstem
//        “i ciekawe”

//        String x = "PrOgRaMoWaNiE JeSt SuPeR";
//        System.out.println(x.concat(" i ciekawe"));

//        35. Stworzyć stringa, “PrOgRaMoWaNiE JeSt SuPeR”, a następnie sprawdzić czy jest
//                puste

//        String x = "PrOgRaMoWaNiE JeSt SuPeR";
//        System.out.println(x.isEmpty());

//        36. Stworzyć stringa, “PrOgRaMoWaNiE JeSt SuPeR”, a następnie wyciąć słowo
//        “PROGRAMOWANIE”

//        String x = "PrOgRaMoWaNiE JeSt SuPeR";
//        System.out.println(x.substring(0,13));

//        37. Stworzyć stringa, “PrOgRaMoWaNiE JeSt SuPeR”, a następnie zamieni całość na
//        wielkie litery.

//        String x = "rOgRaMoWaNiE JeSt SuPeR";
//        System.out.println(x.toUpperCase());
    }
}