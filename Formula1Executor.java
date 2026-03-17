class Formula1Executor {
    public static void main(String[] args) {
        Franchise fr1 = new Franchise(101, "Ferrari Racing", "Ferrari Group", "Maranello", "Italy", 1947, 16, 240, 100, "Monza", 100000, "Red", "Shell", 500, 1200, "Fred", "F1", "Active", 1, "Italy");
        Formula1 f1 = new Formula1(1, "Ferrari", "Italy", "Leclerc", 16, 16, 240, 780, 230, 260, 9000, "Ferrari", "Fred Vasseur", 1950, "Maranello", "Red", 500, 1200, "Shell", "Active", fr1);
        f1.displayDetails();

        Franchise fr2 = new Franchise(102, "Mercedes GP", "Mercedes Group", "Brackley", "UK", 1954, 8, 220, 90, "Silverstone", 150000, "Silver", "Petronas", 600, 1300, "Toto", "F1", "Active", 2, "UK");
        Formula1 f2 = new Formula1(2, "Mercedes", "Germany", "Hamilton", 44, 8, 220, 700, 200, 210, 8500, "Mercedes", "Toto Wolff", 1954, "Brackley", "Silver", 600, 1300, "Petronas", "Active", fr2);
        f2.displayDetails();

        Franchise fr3 = new Franchise(103, "RedBull Racing", "RedBull Group", "Milton Keynes", "UK", 2005, 6, 180, 80, "Austria GP", 90000, "Blue", "Oracle", 550, 1100, "Christian", "F1", "Active", 3, "UK");
        Formula1 f3 = new Formula1(3, "RedBull", "Austria", "Verstappen", 1, 6, 180, 500, 150, 160, 7000, "Honda", "Christian Horner", 2005, "Milton Keynes", "Blue", 550, 1100, "Oracle", "Active", fr3);
        f3.displayDetails();

        Franchise fr4 = new Franchise(104, "McLaren Racing", "McLaren Group", "Woking", "UK", 1963, 8, 183, 120, "Silverstone", 120000, "Orange", "Chrome", 480, 1000, "Andrea", "F1", "Active", 4, "UK");
        Formula1 f4 = new Formula1(4, "McLaren", "UK", "Lando Norris", 4, 8, 183, 485, 155, 160, 6500, "Mercedes", "Andrea Stella", 1963, "Woking", "Orange", 480, 1000, "Chrome", "Active", fr4);
        f4.displayDetails();

        Franchise fr5 = new Franchise(105, "Alpine F1", "Renault Group", "Enstone", "UK", 1977, 2, 21, 150, "France GP", 80000, "Pink", "BWT", 300, 700, "Bruno", "F1", "Active", 5, "France");
        Formula1 f5 = new Formula1(5, "Alpine", "France", "Gasly", 10, 2, 21, 80, 20, 18, 2000, "Renault", "Bruno Famin", 1977, "Enstone", "Pink", 300, 700, "BWT", "Active", fr5);
        f5.displayDetails();

        Franchise fr6 = new Franchise(106, "Aston Martin Racing", "Aston Martin Group", "Silverstone", "UK", 2021, 2, 32, 120, "Silverstone", 140000, "Green", "Aramco", 420, 850, "Mike", "F1", "Active", 6, "UK");
        Formula1 f6 = new Formula1(6, "Aston Martin", "UK", "Fernando Alonso", 14, 2, 32, 98, 22, 23, 1800, "Mercedes", "Mike Krack", 2021, "Silverstone", "Green", 420, 850, "Aramco", "Active", fr6);
        f6.displayDetails();

        Franchise fr7 = new Franchise(107, "Williams Racing", "Dorilton Capital", "Grove", "UK", 1977, 9, 114, 150, "Silverstone", 120000, "Blue", "Duracell", 350, 700, "James", "F1", "Active", 7, "UK");
        Formula1 f7 = new Formula1(7, "Williams", "UK", "Alex Albon", 23, 9, 114, 313, 128, 133, 5000, "Mercedes", "James Vowles", 1977, "Grove", "Blue", 350, 700, "Duracell", "Active", fr7);
        f7.displayDetails();

        Franchise fr8 = new Franchise(108, "AlphaTauri Racing", "RedBull Group", "Faenza", "Italy", 2006, 1, 3, 50, "Imola", 80000, "White", "AlphaTauri", 200, 500, "Franz", "F1", "Active", 8, "Italy");
        Formula1 f8 = new Formula1(8, "AlphaTauri", "Italy", "Yuki Tsunoda", 22, 1, 3, 10, 2, 3, 500, "Honda", "Franz Tost", 2006, "Faenza", "White", 200, 500, "AlphaTauri", "Active", fr8);
        f8.displayDetails();

        Franchise fr9 = new Franchise(109, "Haas F1", "Gene Haas", "Kannapolis", "USA", 2016, 0, 0, 60, "Austin", 120000, "Black", "MoneyGram", 180, 400, "Guenther", "F1", "Active", 9, "USA");
        Formula1 f9 = new Formula1(9, "Haas", "USA", "Kevin Magnussen", 20, 0, 0, 1, 0, 2, 300, "Ferrari", "Guenther Steiner", 2016, "Kannapolis", "Black", 180, 400, "MoneyGram", "Active", fr9);
        f9.displayDetails();

        Franchise fr10 = new Franchise(110, "Sauber Motorsport", "Audi Group", "Hinwil", "Switzerland", 1993, 0, 0, 80, "Monza", 90000, "Red", "Stake", 220, 450, "Alessandro", "F1", "Active", 10, "Switzerland");
        Formula1 f10 = new Formula1(10, "Sauber", "Switzerland", "Valtteri Bottas", 77, 0, 0, 27, 1, 3, 900, "Ferrari", "Alessandro Alunni", 1993, "Hinwil", "Red", 220, 450, "Stake", "Active", fr10);
        f10.displayDetails();

        Franchise fr11 = new Franchise(111, "Lotus Racing", "Lotus Group", "Norfolk", "UK", 1958, 1, 81, 120, "Silverstone", 100000, "Black", "Total", 250, 600, "Eric", "F1", "Inactive", 11, "UK");
        Formula1 f11 = new Formula1(11, "Lotus", "UK", "Kimi Raikkonen", 7, 1, 81, 150, 18, 46, 3000, "Renault", "Eric Boullier", 1958, "Norfolk", "Black", 250, 600, "Total", "Inactive", fr11);
        f11.displayDetails();

        Franchise fr12 = new Franchise(112, "Force India Racing", "UB Group", "Silverstone", "UK", 2008, 0, 0, 60, "Silverstone", 100000, "Pink", "Kingfisher", 180, 450, "Vijay", "F1", "Inactive", 12, "UK");
        Formula1 f12 = new Formula1(12, "Force India", "India", "Sergio Perez", 11, 0, 0, 5, 0, 2, 450, "Mercedes", "Vijay Mallya", 2008, "Silverstone", "Pink", 180, 450, "Kingfisher", "Inactive", fr12);
        f12.displayDetails();

        Franchise fr13 = new Franchise(113, "Toro Rosso Racing", "RedBull Group", "Faenza", "Italy", 2006, 0, 1, 70, "Monza", 90000, "Blue", "RedBull", 160, 400, "Franz", "F1", "Inactive", 13, "Italy");
        Formula1 f13 = new Formula1(13, "Toro Rosso", "Italy", "Daniel Ricciardo", 3, 0, 1, 3, 1, 1, 350, "Ferrari", "Franz Tost", 2006, "Faenza", "Blue", 160, 400, "RedBull", "Inactive", fr13);
        f13.displayDetails();

        Franchise fr14 = new Franchise(114, "Jordan Grand Prix", "Jordan Group", "Silverstone", "UK", 1991, 0, 4, 70, "Silverstone", 100000, "Yellow", "Benson & Hedges", 150, 350, "Eddie", "F1", "Inactive", 14, "UK");
        Formula1 f14 = new Formula1(14, "Jordan", "Ireland", "Rubens Barrichello", 9, 0, 4, 19, 2, 3, 400, "Ford", "Eddie Jordan", 1991, "Silverstone", "Yellow", 150, 350, "Benson & Hedges", "Inactive", fr14);
        f14.displayDetails();

        Franchise fr15 = new Franchise(115, "Brawn Racing", "Ross Brawn", "Brackley", "UK", 2009, 1, 8, 10, "Silverstone", 120000, "White", "Virgin", 200, 450, "Ross", "F1", "Inactive", 15, "UK");
        Formula1 f15 = new Formula1(15, "Brawn GP", "UK", "Jenson Button", 22, 1, 8, 15, 5, 4, 172, "Mercedes", "Ross Brawn", 2009, "Brackley", "White", 200, 450, "Virgin", "Inactive", fr15);
        f15.displayDetails();

        Franchise fr16 = new Franchise(116, "Benetton Formula", "Benetton Group", "Enstone", "UK", 1986, 2, 27, 80, "Monza", 95000, "Blue", "Mild Seven", 220, 500, "Flavio", "F1", "Inactive", 16, "UK");
        Formula1 f16 = new Formula1(16, "Benetton", "Italy", "Michael Schumacher", 5, 2, 27, 50, 15, 20, 900, "Renault", "Flavio Briatore", 1986, "Enstone", "Blue", 220, 500, "Mild Seven", "Inactive", fr16);
        f16.displayDetails();

        Franchise fr17 = new Franchise(117, "Toyota Racing", "Toyota Group", "Cologne", "Germany", 2002, 0, 0, 60, "Suzuka", 120000, "White", "Panasonic", 300, 700, "Tadashi", "F1", "Inactive", 17, "Japan");
        Formula1 f17 = new Formula1(17, "Toyota", "Japan", "Jarno Trulli", 11, 0, 0, 13, 3, 3, 278, "Toyota", "Tadashi Yamashina", 2002, "Cologne", "White", 300, 700, "Panasonic", "Inactive", fr17);
        f17.displayDetails();

        Franchise fr18 = new Franchise(118, "Jaguar Racing", "Ford", "Milton Keynes", "UK", 2000, 0, 0, 50, "Silverstone", 100000, "Green", "HSBC", 180, 400, "Tony", "F1", "Inactive", 18, "UK");
        Formula1 f18 = new Formula1(18, "Jaguar", "UK", "Mark Webber", 6, 0, 0, 2, 0, 1, 100, "Cosworth", "Tony Purnell", 2000, "Milton Keynes", "Green", 180, 400, "HSBC", "Inactive", fr18);
        f18.displayDetails();

        Franchise fr19 = new Franchise(119, "Minardi Racing", "Minardi Group", "Faenza", "Italy", 1985, 0, 0, 90, "Imola", 80000, "Black", "Telefonica", 120, 250, "Paul", "F1", "Inactive", 19, "Italy");
        Formula1 f19 = new Formula1(19, "Minardi", "Italy", "Giancarlo Fisichella", 12, 0, 0, 0, 0, 0, 38, "Ford", "Paul Stoddart", 1985, "Faenza", "Black", 120, 250, "Telefonica", "Inactive", fr19);
        f19.displayDetails();

        Franchise fr20 = new Franchise(120, "Arrows Racing", "TWR Group", "Leafield", "UK", 1978, 0, 0, 70, "Silverstone", 90000, "Orange", "Orange", 140, 300, "Tom", "F1", "Inactive", 20, "UK");
        Formula1 f20 = new Formula1(20, "Arrows", "UK", "Jos Verstappen", 20, 0, 0, 9, 0, 2, 156, "Supertec", "Tom Walkinshaw", 1978, "Leafield", "Orange", 140, 300, "Orange", "Inactive", fr20);
        f20.displayDetails();
    }
}
