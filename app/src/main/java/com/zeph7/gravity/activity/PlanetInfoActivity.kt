package com.zeph7.gravity.activity

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.zeph7.gravity.R
import com.zeph7.gravity.data.Planet
import kotlinx.android.synthetic.main.activity_planet_info.*

class PlanetInfoActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        overridePendingTransition(
            R.anim.fade_in_transition,
            R.anim.fade_out_transition
        )
        setContentView(R.layout.activity_planet_info)

        var planet = intent.getSerializableExtra("planet") as Planet
        planetImageInfoId.setImageDrawable(application.getDrawable(planet.Image))
        planetNameInfoId.text = planet.Name
        planetInfoId.text = planetInfo(planet.Name)

        var anim = AnimationUtils.loadAnimation(applicationContext, R.anim.clockwise)
        planetImageInfoId.startAnimation(anim)

        planetImageInfoId.setOnClickListener {
            anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            planetImageInfoId.startAnimation(anim)
        }
    }

    fun planetInfo(planetName: String): String? {
        when (planetName) {
            "Mercury" -> {
                return "Mass:\t\t330,104,000,000,000 billion kg (0.055 x Earth)\n\n" +
                        "Equatorial Diameter:\t\t4,879 km\n\n" +
                        "Polar Diameter:\t\t4,879 km\n\n" +
                        "Equatorial Circumference:\t\t15,329 km\n\n" +
                        "Known Moons:\t\tNone\n\n" +
                        "Notable Moons:\t\tNone\n\n" +
                        "Orbit Distance:\t\t57,909,227 km (0.39 AU)\n\n" +
                        "Orbit Period:\t\t87.97 Earth days\n\n" +
                        "Surface Temperature:\t\t-173 to 427°C\n\n" +
                        "Mercury is the closest planet to the Sun and is also the smallest of the eight planets in our solar system. For every 2 orbits of the Sun, which takes around 88 Earth days, Mercury completes three rotations of its axis. It is gravitationally locked and this rotation is unique to the solar system."
            }
            "Venus" -> {
                return "Mass:\t\t4,867,320,000,000,000 billion kg (0.815 x Earth)\n\n" +
                        "Equatorial Diameter:\t\t12,104 km\n\n" +
                        "Polar Diameter:\t\t12,104 km\n\n" +
                        "Equatorial Circumference:\t\t38,025 km\n\n" +
                        "Known Moons:\t\tNone\n\n" +
                        "Notable Moons:\t\tNone\n\n" +
                        "Orbit Distance:\t\t108,209,475 km (0.73 AU)\n\n" +
                        "Orbit Period:\t\t224.70 Earth days\n\n" +
                        "Surface Temperature:\t\t462° C\n\n" +
                        "Venus is the second planet from the Sun and the third brightest object in Earth's sky after the Sun and Moon. It is sometimes referred to as the sister planet to Earth, because their size and mass are so similar. Venus is also the closest planet to Earth. The surface of Venus is hidden by an opaque layer of clouds which are formed from sulphuric acid.\n\n" +
                        "The planet is named for Venus, the Roman goddess of love and beauty and is the second largest terrestrial planet."
            }
            "Earth" -> {
                return "Mass:\t\t5,972,190,000,000,000 billion kg\n\n" +
                        "Equatorial Diameter:\t\t12,756 km\n\n" +
                        "Polar Diameter:\t\t12,714 km\n\n" +
                        "Equatorial Circumference:\t\t40,030 km\n\n" +
                        "Known Moons:\t\t1\n\n" +
                        "Notable Moons:\t\tThe Moon\n\n" +
                        "Orbit Distance:\t\t149,598,262 km (1 AU)\n\n" +
                        "Orbit Period:\t\t365.26 Earth days\n\n" +
                        "Surface Temperature:\t\t-88 to 58° C\n\n" +
                        "Earth is the third planet from the Sun and largest of the terrestrial planets. Surprisingly, while it is only the fifth largest planet in terms of size and mass, it is the densest (5,513 kg/m3) of all the planets. Earth is the only planet in the solar system not named after a mythological being. Instead, its name is derived from the Old English word \"ertha\" and the Anglo-Saxon word \"erda\" which means ground or soil.\n\n" +
                        "Earth was formed somewhere around 4.54 billion years ago and is currently the only known planet to support life - and lots of it."
            }
            "Mars" -> {
                return "Mass:\t\t641,693,000,000,000 billion kg (0.107 x Earth)\n\n" +
                        "Equatorial Diameter:\t\t6,805 km\n\n" +
                        "Polar Diameter:\t\t6,755 km\n\n" +
                        "Equatorial Circumference:\t\t21,297 km\n\n" +
                        "Known Moons:\t\t2\n\n" +
                        "Notable Moons:\t\tPhobos & Deimos\n\n" +
                        "Orbit Distance:\t\t227,943,824 km (1.38 AU)\n\n" +
                        "Orbit Period:\t\t686.98 Earth days (1.88 Earth years)\n\n" +
                        "Surface Temperature:\t\t-87 to -5 °C\n\n" +
                        "Mars is the fourth planet from the Sun and last of the terrestrial planets. Like the rest of the planets in the solar system (except Earth), Mars is named after a mythological figure - the Roman god of war. In addition to its official name, Mars is sometimes called the Red Planet because of the brownish-red color of its surface. Mars is the second smallest planet in the solar system behind Mercury."
            }
            "Jupiter" -> {
                return "Mass:\t\t1,898,130,000,000,000,000 billion kg (317.83 x Earth)\n\n" +
                        "Equatorial Diameter:\t\t142,984 km\n\n" +
                        "Polar Diameter:\t\t133,709 km\n\n" +
                        "Equatorial Circumference:\t\t439,264 km\n\n" +
                        "Known Moons:\t\t67\n\n" +
                        "Notable Moons:\t\tIo, Europa, Ganymede, & Callisto\n\n" +
                        "Known Rings:\t\t4\n\n" +
                        "Orbit Distance:\t\t778,340,821 km (5.20 AU)\n\n" +
                        "Orbit Period:\t\t4,332.82 Earth days (11.86 Earth years)\n\n" +
                        "Surface Temperature:\t\t-108°C\n\n" +
                        "Named after the Roman king of the gods, Jupiter is fitting of its name. With a mass of 1.90 x 1027 kg and a mean diameter of 139,822 km, Jupiter is easily the largest and most massive planet in the Solar System. To put this in perspective, it would take 11 Earths lined up next to each other to stretch from one side of Jupiter to the other and it would take 317 Earths to equal the mass of Jupiter."
            }
            "Saturn" -> {
                return "Mass:\t\t568,319,000,000,000,000 billion kg (95.16 x Earth)\n\n" +
                        "Equatorial Diameter:\t\t120,536 km\n\n" +
                        "Polar Diameter:\t\t108,728 km\n\n" +
                        "Equatorial Circumference:\t\t365,882 km\n\n" +
                        "Known Moons:\t\t62\n\n" +
                        "Notable Moons:\t\tTitan, Rhea & Enceladus\n\n" +
                        "Known Rings:\t\t30+ (7 Groups)\n\n" +
                        "Orbit Distance:\t\t1,426,666,422 km (9.58 AU)\n\n" +
                        "Orbit Period:\t\t10,755.70 Earth days (29.45 Earth years)\n\n" +
                        "Surface Temperature:\t\t-139 °C\n\n" +
                        "Saturn is the sixth planet from the Sun and second largest planet of the Solar System in terms of diameter and mass. If compared, it is easy to see why Saturn and Jupiter have been designated as relatives. From atmospheric composition to rotation, these two planets are extremely similar. Because of these factors, Saturn was named after the father of the god Jupiter in Roman mythology."
            }
            "Uranus" -> {
                return "Mass:\t\t86,810,300,000,000,000 billion kg (14.536 x Earth)\n\n" +
                        "Equatorial Diameter:\t\t51,118 km\n\n" +
                        "Polar Diameter:\t\t49,946 km\n\n" +
                        "Equatorial Circumference:\t\t159,354 km\n\n" +
                        "Known Moons:\t\t27\n\n" +
                        "Notable Moons:\t\tOberon, Titania, Miranda, Ariel & Umbriel\n\n" +
                        "Known Rings:\t\t13\n\n" +
                        "Orbit Distance:\t\t2,870,658,186 km (19.22 AU)\n\n" +
                        "Orbit Period:\t\t30,687.15 Earth days (84.02 Earth years)\n\n" +
                        "Surface Temperature:\t\t-197 °C\n\n" +
                        "Uranus, named after the the father of the Roman god Saturn, is the seventh planet in the Solar System and third of the gas giants. It is the third largest planet by diameter, yet fourth most massive."
            }
            "Neptune" -> {
                return "Mass:\t\t102,410,000,000,000,000 billion kg (17.15x Earth)\n\n" +
                        "Equatorial Diameter:\t\t49,528 km\n\n" +
                        "Polar Diameter:\t\t48,682 km\n\n" +
                        "Equatorial Circumference:\t\t155,600 km\n\n" +
                        "Known Moons:\t\t14\n\n" +
                        "Notable Moons:\t\tTriton\n\n" +
                        "Known Rings:\t\t5\n\n" +
                        "Orbit Distance:\t\t4,498,396,441 km (30.10 AU)\n\n" +
                        "Orbit Period:\t\t60,190.03 Earth days (164.79 Earth years)\n\n" +
                        "Surface Temperature:\t\t-201 °C\n\n" +
                        "Neptune is the eighth planet from the Sun and last of the known planets. While it is the third largest planet with respect to mass, it is only the fourth largest in terms of diameter. Due to its blue coloration, Neptune was named after the Roman god of the Sea."
            }
            "Sun" -> {
                return "Age:\t\t4.6 Billion Years\n\n" +
                        "Type:\t\tYellow Dwarf (G2V)\n\n" +
                        "Mass:\t1,989,100,000,000,000,000, 000 billion kg (333,060 x Earth)\n\n" +
                        "Diameter:\t\t1,392,684 km\n\n" +
                        "Circumference at Equator:\t\t4,370,005.6 km\n\n" +
                        "Surface Temperature:\t\t5500 °C" +
                        "The Sun is what is known as a main sequence star; that is, a sphere composed primarily of the two gases hydrogen and helium such that certain conditions are met. The first condition is that it must have a mass falling within a certain range. Though debated, this range is generally accepted to be between approximately 1.4 x 1029 kg and 3.0 x 1032 kg. (This range is often describe as at least 75 times the mass of Jupiter and no more than 150 times the mass of the Sun itself.) The second and most important condition is that nuclear fusion must be present. Nuclear fusion is the process whereby two lighter atomic nuclei join or “fuse” together to produce a heavier atomic nucleus. In the context of stars, hydrogen is the lighter and helium the heavier."
            }
            "Space" -> {
                return "Facts About Space :- \n\n" +
                        "    Space is completely silent.\n" +
                        "\n" +
                        "    There is no atmosphere in space, which means that sound has no medium or way to travel to be heard. Astronauts use radios to stay in communication while in space, since radio waves can still be sent and received.\n" +
                        "    The hottest planet in our solar system is 450° C.\n" +
                        "\n" +
                        "    Venus is the hottest planet in the solar system and has an average surface temperature of around 450° C. Interestingly, Venus is not the closest planet to the Sun – Mercury is closer but because Mercury has no atmosphere to regulate temperature it has a very large temperature fluctuation.\n" +
                        "    There may be life on Mars.\n" +
                        "\n" +
                        "    Of all the planets in our solar system (apart from Earth), Mars is the one most likely to be hospitable to life. In 1986, NASA found what they thought may be fossils of microscopic living things in a rock recovered from Mars.\n" +
                        "    Nobody knows how many stars are in space.\n" +
                        "\n" +
                        "    The sheer size of space makes it impossible to accurately predict just how many stars we have. Right now, scientists and astronomers use the number of stars only within our galaxy, The Milky Way, to estimate. That number is between 200-400 billion stars and there are estimated to be billions of galaxies so the stars in space really are completely uncountable.\n" +
                        "    Halleys Comet won’t orbit past Earth again until 2061.\n" +
                        "\n" +
                        "    Discovered in 1705 by Edmond Halley, the famous comet was last seen in 1986 and is only seen once every 75 to 76 years.\n" +
                        "    A full NASA space suit costs \$12,000,000.\n" +
                        "\n" +
                        "    While the entire suit costs a cool \$12m, 70% of that cost is for the backpack and control module.\n" +
                        "    Neutron stars can spin 600 times per second.\n" +
                        "\n" +
                        "    Neutron stars are the densest and tiniest stars in the known universe and although they only have a radius of about 10 km (6 mi), they may have a mass of a few times that of the Sun. They can rotate at up to 60 times per second after they are born from a core-collapse supernova star explosion and have been known to spin as fast as 600-712 times per second because of their physics.\n" +
                        "    There may be a planet made out of diamonds.\n" +
                        "\n" +
                        "    As space facts go, this is pretty impressive. Research by Yale University scientists suggests that a rocky planet called 55 Cancri e — which has a radius twice Earth’s, and a mass eight times greater – may have a surface made up of graphite and diamond. It’s 40 light years away but visible to the naked eye in the constellation of Cancer.\n" +
                        "    The footprints on the Moon will be there for 100 million years.\n" +
                        "\n" +
                        "    The Moon has no atmosphere, which means there is no wind to erode the surface and no water to wash the footprints away. This means the footprints of the Apollo astronauts, along with spacecraft prints, rover-prints and discarded material, will be there for millions of years.\n" +
                        "    One day on Venus is longer than one year.\n" +
                        "\n" +
                        "    Venus has a slow axis rotation which takes 243 Earth days to complete its day. The orbit of Venus around the Sun is 225 Earth days, making a year on Venus 18 days less than a day on Venus.\n" +
                        "    In 3.75 billion years the Milky Way and Andromeda galaxies will collide.\n" +
                        "\n" +
                        "    The Andromeda Galaxy is approaching the Milky Way – where our solar system is – at rate of around 110 kilometres per second (68 mi/s) and eventually the two will collide to form a giant elliptical galaxy.\n" +
                        "    If two pieces of the same type of metal touch in space they will permanently bond.\n" +
                        "\n" +
                        "    This incredible fact is also known as cold welding and it happens because the atoms of two pieces of metal have no way of knowing they are separate. This doesn’t happen on Earth because of the air and water found between the pieces.\n" +
                        "    There is floating water in space.\n" +
                        "\n" +
                        "    Astronomers have found a massive water vapor cloud which holds 140 trillion times the mass of water in the Earth’s oceans somewhere around 10 billion light years away – making it the largest discovery of water ever found.\n" +
                        "    The largest known asteroid is 965 km (600 mi) wide.\n" +
                        "\n" +
                        "    Discovered by Italian astronomer Giuseppe Piazzi in 1801, the dwarf planet Ceres was the first, and largest, object to be considered an asteroid. It is located in the Asteroid Belt between the orbits of Mars and Jupiter and accounts for 33% of the entire belt’s mass.\n" +
                        "    The Moon was once a piece of the Earth.\n" +
                        "\n" +
                        "    The theory is that when Earth was a relatively young planet, it was struck by a giant object and this collision broke a piece of the Earth away to create the moon. This piece then began to orbit the Earth as a result of its gravitational pull.\n" +
                        "    The Sun’s mass takes up 99.86% of the solar system.\n" +
                        "\n" +
                        "    Made of three quarters hydrogen and helium for most of its remaining mass, the Sun accounts for 99.86% of the mass in our solar system with a mass of around 330,000 times that of Earth.\n" +
                        "    There is a volcano on Mars three times the size of Everest.\n" +
                        "\n" +
                        "    At 600 km wide and 21 km high, Olympus Mons is a volcano on Mars that may still be active, according to scientists. It is the tallest peak of any planet. However, the Rheasilvia central peak on the asteroid Vesta is taller at 22 km.\n" +
                        "\n"
            }
        }
        return null
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
    }
}
