class UniverseExecutor {
    public static void main(String[] args) {
        Earth e1 = new Earth(3, "Earth", "Terrestrial", 6371, 5.97, 9.8, 7, 5, 195, 8000000000,
                "Nitrogen Oxygen", "15C", "24 Hours", "365 Days", "Moon", "Blue",
                "Yes", "Planet", "Habitable", "Home of Humans");
        Universe u1 = new Universe(1, "Observable Universe", "Cosmic", 2000000000L, 1000000000000L, 1000000000000L,
                "Edwin Hubble", 1929, "Big Bang", "13.8 Billion Years", "Accelerating", "Black", "3D",
                "Cosmic Web", "Astronomy", "Big Bang", "2.7K", "Expanding", "Telescopes", "Vast cosmic space", e1);

        Earth e2 = new Earth(4, "Mars", "Terrestrial", 3389, 0.64, 3.71, 0, 0, 0, 0,
                "Carbon Dioxide", "-60C", "24.6 Hours", "687 Days", "Phobos, Deimos", "Red",
                "Microbial?", "Planet", "Potentially Habitable", "Red Planet");
        Universe u2 = new Universe(2, "Milky Way Universe", "Galactic", 1L, 400000000000L, 800000000000L,
                "William Herschel", 1785, "Dark Matter Dominated", "13.6 Billion Years", "Rotating",
                "Milky White", "3D", "Spiral Arms", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Radio Telescopes", "Our home galaxy universe", e2);

        Earth e3 = new Earth(5, "Venus", "Terrestrial", 6052, 4.87, 8.87, 0, 0, 0, 0,
                "Carbon Dioxide", "464C", "243 Days", "225 Days", "None", "Yellowish White",
                "No", "Planet", "Unhabitable", "Hottest Planet");
        Universe u3 = new Universe(3, "Andromeda Universe", "Galactic", 1L, 1000000000000L, 2000000000000L,
                "Charles Messier", 1764, "Spiral Galaxy", "10 Billion Years", "Approaching",
                "Silvery", "3D", "Barred Spiral", "Astronomy", "Big Bang", "2.7K", "Colliding",
                "Optical Telescopes", "Nearest spiral galaxy", e3);

        Earth e4 = new Earth(6, "Mercury", "Terrestrial", 2439, 0.33, 3.7, 0, 0, 0, 0,
                "Thin Exosphere", "427C Day", "58.6 Days", "88 Days", "None", "Grey",
                "No", "Planet", "Unhabitable", "Closest to Sun");
        Universe u4 = new Universe(4, "Triangulum Universe", "Galactic", 1L, 40000000000L, 80000000000L,
                "Charles Messier", 1764, "Scutum-Centaurus Arm", "10 Billion Years", "Receding",
                "Blue-White", "3D", "Spiral", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Infrared Telescopes", "Third largest galaxy", e4);

        Earth e5 = new Earth(7, "Jupiter", "Gas Giant", 69911, 317.8, 24.79, 0, 0, 0, 0,
                "Hydrogen Helium", "-145C", "9.9 Hours", "11.9 Years", "95 Moons", "Orange Brown",
                "No", "Planet", "Unhabitable", "Largest Planet");
        Universe u5 = new Universe(5, "Centaurus A Universe", "Elliptical", 1L, 100000000000L, 200000000000L,
                "James Dunlop", 1826, "Active Galactic Nucleus", "12 Billion Years", "Jet Emission",
                "Radio Bright", "3D", "Elliptical", "Astronomy", "Big Bang", "2.7K", "Active",
                "Radio Astronomy", "Radio Galaxy", e5);

        Earth e6 = new Earth(8, "Saturn", "Gas Giant", 58232, 95.2, 10.44, 0, 0, 0, 0,
                "Hydrogen Helium", "-185C", "10.7 Hours", "29.5 Years", "146 Moons", "Golden",
                "No", "Planet", "Unhabitable", "Ringed Planet");
        Universe u6 = new Universe(6, "Sombrero Galaxy Universe", "Spiral", 1L, 80000000000L, 160000000000L,
                "Pierre Méchain", 1783, "Dust Ring Galaxy", "11 Billion Years", "Stable",
                "White", "3D", "Spiral Sa", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Hubble Space Telescope", "Hat-shaped galaxy", e6);

        Earth e7 = new Earth(9, "Uranus", "Ice Giant", 25362, 14.5, 8.69, 0, 0, 0, 0,
                "Hydrogen Methane", "-224C", "17.2 Hours", "84 Years", "27 Moons", "Light Blue",
                "No", "Planet", "Unhabitable", "Sideways Planet");
        Universe u7 = new Universe(7, "Whirlpool Galaxy Universe", "Grand Design Spiral", 1L, 200000000000L, 400000000000L,
                "Charles Messier", 1773, "Gravitational Interaction", "400 Million Years", "Interacting",
                "Blue-White", "3D", "Spiral", "Astronomy", "Big Bang", "2.7K", "Interacting",
                "Deep Space Imaging", "Perfect spiral galaxy", e7);

        Earth e8 = new Earth(10, "Neptune", "Ice Giant", 24622, 17.1, 11.15, 0, 0, 0, 0,
                "Hydrogen Helium Methane", "-218C", "16.1 Hours", "164.8 Years", "14 Moons", "Deep Blue",
                "No", "Planet", "Unhabitable", "Windy Planet");
        Universe u8 = new Universe(8, "Pinwheel Galaxy Universe", "Grand Design Spiral", 1L, 100000000000L, 200000000000L,
                "Pierre Méchain", 1781, "Face-on Spiral", "9 Billion Years", "Receding",
                "Bright White", "3D", "Spiral Sc", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Amateur Telescopes", "Face-on beauty", e8);

        Earth e9 = new Earth(11, "Pluto", "Dwarf Planet", 1188, 0.002, 0.62, 0, 0, 0, 0,
                "Thin Nitrogen", "-229C", "6.4 Days", "248 Years", "5 Moons", "Icy White",
                "No", "Dwarf Planet", "Frozen", "Former Planet");
        Universe u9 = new Universe(9, "Black Eye Galaxy Universe", "Spiral", 1L, 50000000000L, 100000000000L,
                "Charles Messier", 1780, "Dust Lane Galaxy", "11 Billion Years", "Stable",
                "Yellow Core", "3D", "Spiral Sb", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Deep Sky Imaging", "Dark dust lane galaxy", e9);

        Earth e10 = new Earth(12, "Europa", "Icy Moon", 1560, 0.008, 1.31, 0, 0, 0, 0,
                "Thin Oxygen", "-171C", "3.5 Days", "3.5 Days", "None", "White Ice",
                "Possible Oceanic", "Moon", "Potentially Habitable", "Jupiter's icy moon");
        Universe u10 = new Universe(10, "Large Magellanic Cloud", "Dwarf Irregular", 1L, 10000000000L, 20000000000L,
                "Ferdinand Magellan", 1519, "Satellite Galaxy", "13 Billion Years", "Orbiting",
                "Blue Irregular", "3D", "Irregular", "Astronomy", "Big Bang", "2.7K", "Orbiting Milky Way",
                "Southern Hemisphere", "Nearest satellite galaxy", e10);

                Earth e11 = new Earth(13, "Enceladus", "Icy Moon", 252, 0.00011, 0.11, 0, 0, 0, 0,
                "Water Vapor", "-198C", "1.4 Days", "1.4 Days", "None", "Bright White",
                "Possible Hydrothermal", "Moon", "Potentially Habitable", "Saturn's geyser moon");
        Universe u11 = new Universe(11, "Small Magellanic Cloud Universe", "Dwarf Irregular", 1L, 3000000000L, 6000000000L,
                "Yves Tholot", 1752, "Satellite Galaxy", "13 Billion Years", "Orbiting",
                "Blue Irregular", "3D", "Irregular", "Astronomy", "Big Bang", "2.7K", "Orbiting Milky Way",
                "Southern Sky", "Smaller satellite galaxy", e11);

        Earth e12 = new Earth(14, "Titan", "Icy Moon", 2575, 0.0225, 1.35, 0, 0, 0, 0,
                "Nitrogen Methane", "-179C", "15.9 Days", "15.9 Days", "None", "Orange Haze",
                "Possible Methane Life", "Moon", "Potentially Habitable", "Saturn's largest moon");
        Universe u12 = new Universe(12, "Bode's Galaxy Universe", "Spiral", 1L, 80000000000L, 160000000000L,
                "Johann Elert Bode", 1774, "Classic Spiral", "10 Billion Years", "Receding",
                "White Arms", "3D", "Spiral Sb", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Northern Hemisphere", "Beautiful spiral galaxy", e12);

        Earth e13 = new Earth(15, "Ganymede", "Icy Moon", 2631, 0.025, 1.43, 0, 0, 0, 0,
                "Thin Oxygen", "-163C", "7.2 Days", "7.2 Days", "None", "Grey Ice",
                "Possible Subsurface", "Moon", "Potentially Habitable", "Largest moon in solar system");
        Universe u13 = new Universe(13, "Sunflower Galaxy Universe", "Grand Design Spiral", 1L, 300000000000L, 600000000000L,
                "Pierre Méchain", 1781, "Perfect Spiral Arms", "9 Billion Years", "Receding",
                "Bright Blue-White", "3D", "Spiral Sc", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Deep Sky Photography", "Classic spiral beauty", e13);

        Earth e14 = new Earth(16, "Callisto", "Icy Moon", 2410, 0.018, 1.24, 0, 0, 0, 0,
                "Carbon Dioxide", "-140C", "16.7 Days", "16.7 Days", "None", "Dark Grey",
                "Possible Subsurface", "Moon", "Ancient Cratered", "Jupiter's outermost moon");
        Universe u14 = new Universe(14, "Cartwheel Galaxy Universe", "Ring Galaxy", 1L, 50000000000L, 100000000000L,
                "Fritz Zwicky", 1941, "Galactic Collision", "500 Million Years", "Expanding Ring",
                "Bright Ring", "3D", "Ring", "Astronomy", "Big Bang", "2.7K", "Post-Collision",
                "Hubble Space Telescope", "Stunning ring galaxy", e14);

        Earth e15 = new Earth(17, "Io", "Volcanic Moon", 1821, 0.015, 1.8, 0, 0, 0, 0,
                "Sulfur Dioxide", "-143C", "1.8 Days", "1.8 Days", "None", "Yellow Sulfur",
                "No", "Moon", "Volcanically Active", "Most volcanic body");
        Universe u15 = new Universe(15, "NGC 1300 Universe", "Barred Spiral", 1L, 100000000000L, 200000000000L,
                "John Herschel", 1836, "Barred Spiral Structure", "12 Billion Years", "Stable",
                "Golden Arms", "3D", "Barred Spiral", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Hubble Imaging", "Perfect barred spiral", e15);

        Earth e16 = new Earth(18, "Triton", "Icy Moon", 1353, 0.0036, 0.78, 0, 0, 0, 0,
                "Nitrogen", "-235C", "5.9 Days", "5.9 Days", "None", "Pink Ice",
                "Possible Subsurface", "Moon", "Retrograde Orbit", "Neptune's largest moon");
        Universe u16 = new Universe(16, "Hoag's Object Universe", "Ring Galaxy", 1L, 100000000000L, 200000000000L,
                "Arthur Hoag", 1950, "Perfect Ring", "10 Billion Years", "Stable Ring",
                "Yellow Ring", "3D", "Ring", "Astronomy", "Big Bang", "2.7K", "Stable",
                "Palomar Observatory", "Most perfect ring galaxy", e16);

        Earth e17 = new Earth(19, "Titania", "Icy Moon", 788, 0.0005, 0.38, 0, 0, 0, 0,
                "None", "-203C", "8.7 Days", "8.7 Days", "None", "Grey Ice",
                "No", "Moon", "Uranus' Largest Moon", "Uranus' biggest moon");
        Universe u17 = new Universe(17, "Messier 87 Universe", "Elliptical Giant", 1L, 1000000000000L, 2000000000000L,
                "Charles Messier", 1781, "Supermassive Black Hole", "12 Billion Years", "Jet Active",
                "Jet Bright", "3D", "Elliptical E0", "Astronomy", "Big Bang", "2.7K", "Active Nucleus",
                "Event Horizon Telescope", "First black hole image galaxy", e17);

        Earth e18 = new Earth(20, "Rhea", "Icy Moon", 764, 0.0004, 0.27, 0, 0, 0, 0,
                "Thin Oxygen", "-174C", "4.5 Days", "4.5 Days", "None", "Bright Ice",
                "No", "Moon", "Saturn's Second Largest", "Saturn's icy moon");
        Universe u18 = new Universe(18, "Tadpole Galaxy Universe", "Interacting Spiral", 2L, 100000000000L, 200000000000L,
                "Halton Arp", 1966, "Tidal Interaction", "500 Million Years", "Tadpole Tail",
                "Long Blue Tail", "3D", "Tidal Tail", "Astronomy", "Big Bang", "2.7K", "Interacting",
                "Hubble Deep Field", "Dramatic tadpole shape", e18);

        Earth e19 = new Earth(21, "Iapetus", "Icy Moon", 735, 0.0003, 0.22, 0, 0, 0, 0,
                "None", "-183C", "79 Days", "79 Days", "None", "Two-Toned",
                "No", "Moon", "Walnut Moon", "Saturn's two-faced moon");
        Universe u19 = new Universe(19, "Antennae Galaxies Universe", "Merging Spirals", 2L, 200000000000L, 400000000000L,
                "William Herschel", 1790, "Starburst Galaxy", "100 Million Years", "Merging",
                "Bright Starburst", "3D", "Merging Spirals", "Astronomy", "Big Bang", "2.7K", "Starburst Phase",
                "Infrared & UV", "Violent galactic merger", e19);

        Earth e20 = new Earth(22, "Charon", "Dwarf Moon", 606, 0.0002, 0.29, 0, 0, 0, 0,
                "Thin Nitrogen", "-220C", "6.4 Days", "6.4 Days", "None", "Grey Ice",
                "Possible Subsurface", "Moon", "Pluto's Companion", "Largest moon of Pluto");
        Universe u20 = new Universe(20, "Mice Galaxies Universe", "Interacting Spirals", 2L, 150000000000L, 300000000000L,
                "Fritz Zwicky", 1933, "Galactic Collision", "500 Million Years", "Long Tails",
                "Blue Tidal Tails", "3D", "Tidal Interaction", "Astronomy", "Big Bang", "2.7K", "Colliding",
                "Hubble Space Telescope", "Dramatic collision with tails", e20);

        u1.displayDetails();
        u2.displayDetails();
        u3.displayDetails();
        u4.displayDetails();
        u5.displayDetails();
        u6.displayDetails();
        u7.displayDetails();
        u8.displayDetails();
        u9.displayDetails();
        u10.displayDetails();
        u11.displayDetails();
        u12.displayDetails();
        u13.displayDetails();
        u14.displayDetails();
        u15.displayDetails();
        u16.displayDetails();
        u17.displayDetails();
        u18.displayDetails();
        u19.displayDetails();
        u20.displayDetails();
    }
}

