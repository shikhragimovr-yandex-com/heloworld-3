public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("привет мир!");
        byte apples = 5;
        short nuts = 200;
        int rubles = 10000;
        long toys = 1000000;
        float weight = 2.7f;
        double size = 1.9;
        System.out.println("яблоки " + apples + " кг");
        System.out.println("орехи " + nuts + " кг");
        System.out.println("рублей " + rubles);
        System.out.println("вес " + toys + " кг");
        System.out.println("масса " + weight + " грамм");
        System.out.println("размер " + size + " сантиметром");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short allTogether = 480;
        int totalStudents = ludmila + anna + ekaterina;
        System.out.println("всего учеников " + totalStudents);
        byte scoolChildren = 80;
        int sheets = allTogether / scoolChildren;
        System.out.println("каждому ученику достанется "+ sheets + " листов");

        byte efficiency = 16;
        short minutes = 2;
        int bottles = efficiency / minutes;
        System.out.println("за минуту " + bottles + " шт бутылок");
        byte car = 8;
        byte inMinutes = 20;
        short day = 1440;
        short freeDya = 4320;
        int monts = 43200;
        int efficiencyCar = car * inMinutes;
        System.out.println("за 20 минут машина произвела " + efficiencyCar + " шт бутылок");
        int inDay = car * day;
        System.out.println("за сутки машина произвела " + inDay + " шт бутылок");
        int inFreeDay = car * freeDya;
        System.out.println("за 3 дня машина произвела " + inFreeDay + " шт бутылок");
        int inMonts = car * monts;
        System.out.println("за месяц машина произвела " + inMonts + " шт бутылок");

        byte whitePaint = 2;
        byte brownPaint = 4;
        byte need = 120;
        int oneClass = whitePaint + brownPaint;
        System.out.println("на один класс нужно " + oneClass + " банок краски");
        byte cans = 6;
        int totalClass = need / cans;
        System.out.println("нужно покрасить " + totalClass + " классов");
        byte total = 20;
        int paintWhite = total * whitePaint;
        int paintBrown = total * brownPaint;
        System.out.println("в школе где " + total + " классов " + "нужно " + paintWhite + " банок белой краски " + paintBrown + " банок коричневой краски");

        byte bananes = 5;
        byte oneBananes = 80;
        float kilogram = 1000;
        int fiveBananes = bananes * oneBananes;
        System.out.println("5 бананов весят " + fiveBananes + " грамм");
        float gramBananes = 400;
        float kilogramBananes = gramBananes / 1000;
        System.out.println("400 грамм бананов равна " + kilogramBananes + " кг");
        short milk = 200;
        byte oneMilk = 105;
        byte milkMililitres = 100;
        int milkOne = milk / milkMililitres;
        System.out.println(milkOne);
        byte mililitresMilk = 2;
        int milkGramm = mililitresMilk * oneMilk;
        System.out.println(" в 200 мл молоке " + milkGramm + " грамм");
        float grammMilk = 210;
        float kilogramMilk = grammMilk / kilogram;
        System.out.println("в 200 мл молоке " + kilogramMilk + " килограмм");
        byte iceCream = 2;
        byte briguette = 100;
        int totalIce = iceCream * briguette;
        System.out.println("2 пломбира весят " + totalIce + " грамм");
        float iceGramm = 200;
        float iceKilogramm = iceGramm / kilogram;
        System.out.println("200 грамм мороженного равен " + iceKilogramm + "килограмм");
        byte eggs = 4;
        byte eggsOne = 70;
        int eggsGramm = eggs * eggsOne;
        System.out.println(" 4 яйца весяц " + eggsGramm + " грамм");
        float grammEggs = 280;
        float kilogrammEggs = grammEggs / kilogram;
        System.out.println("280 грамм яиц равен " + kilogrammEggs + " колограмм");
        byte weightKilogramm = 7;
        short deysGramm = 250;
        short grammdeys = 500;
        float gramm = weightKilogramm * kilogram;
        System.out.println("7 килограм равен " + gramm + " грамм");
        short diet = 7000;
        int countingDeys = diet / deysGramm;
        System.out.println("если в день терять по 250 грамм то понадобиться " + countingDeys + " дней");
        int deysCounting = diet / grammdeys;
        System.out.println("если в день терять по 500 грамм то понядобиться " + deysCounting + " дней");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        byte mother = 12;
        byte percent = 10;
        int heightMasha = masha / percent;
        System.out.println("зарплата маши выросла на " + heightMasha + " рублей");
        int heightDenis = denis / percent;
        System.out.println("зарплата дениса выросла на " + heightDenis + " рублей");
        int heightKristina = kristina / percent;
        System.out.println("зарплата кристины выросла на " + heightKristina + " рублей");
        short receivesMasha = 6776;
        short receivesDenis = 8369;
        short receivesKristina = 7623;
        int nowMasha = masha + receivesMasha;
        int mashaNow = mother * receivesMasha;
        System.out.println("теперь маша получает " + nowMasha + " рублей " + " годовой доход вырос на " + mashaNow + " рублей");
        int nowDenis = denis + receivesDenis;
        int denisNow = mother * receivesDenis;
        System.out.println("теперь денис получает " + nowDenis + " рублей " + "годовой доход вырос на " + denisNow + " рублей");
        int nowKristina = kristina + receivesKristina;
        int kristinaNow = mother * receivesKristina;
        System.out.println("теперь кристина получает" + nowKristina + " рублей" + " годовой доход вырос на " + kristinaNow + " рублей " );












    }
}