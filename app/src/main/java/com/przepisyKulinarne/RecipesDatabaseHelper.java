package com.przepisyKulinarne;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

class RecipesDatabaseHelper extends SQLiteOpenHelper {
    RecipesDatabaseHelper(Context context) {
        super(context, "bprzepisy", null, 1);

       context.deleteDatabase(getDatabaseName());
      dodajPrzepis(new Przepisy("Schabowe poduszeczki z brokułem",
                "Połączenie schabu z brokułem było strzałem w dziesiątkę. Poduszeczki wyszły bardzo smaczne.To doskonała propozycja na niedzielny obiad dla całej rodziny. Poduszeczki podajemy z ziemniakami i surówką.",
                "3-4 osoby", "Średnia kaloryczność", "Schab 0,5kg\nbrokuł 0,5 szt\njajka 2szt\nbułka tarta 2szkl\nsól i pieprz\nolej do smażenia", "1. Brokuła gotuję na półtwardo w osolonej wodzie. Wyjmuję, studzę i dzielę na różyczki.\n" +
                "2. Schab kroję na porcje i cienko rozbijam tłuczkiem. Oprószam solą i pieprzem. Na każdy płat mięsa kładę po kilka różyczek brokuła. Mięso składam na pół. Brzegi dociskam tłuczkiem.\n" +
                "3. Schabowe poduszeczki maczam w rozkłóconych jajkach i obtaczam w bułce tartej. Mięso układam na patelni z rozgrzanym olejem. Smażę na rumiano z każdej strony. Podaję z ziemniakami i surówką.",
                "Polska", R.drawable.schabowe_brokul));

       dodajPrzepis(new Przepisy("Karkówka pieczona z papryką",
                "Karkówka przygotowana w ten sposób jest bardzo mięciutka, wprost rozpływa się w ustach, Takie mięsko to świetna propozycja na niedzielny, czy świąteczny obiad. Polecam!",
                "5+ osób", "Średnia kaloryczność", "karkówka 1,5 kg\npapryka czerwona 0,5 strąka\nolej 50ml\nczosnek granulowany 0,5 łyżeczki\npapryka słodka mielona 1 łyżeczka\nsól 0,5 łyżeczki\npieprz 0,5 łyżeczki",
                "1. Papryki kroję w grubsze paski. Karkówkę nacinam z boku, tworząc jeden duży płat mięsa. Mięso rozbijam lekko tłuczkiem. Na środek kładę kawałki papryki. Mięso zwijam w roladę. Odwiązuję do około nicią.\n" +
                        "2. Olej mieszam z czosnkiem, papryką, solą oraz pieprzem. Do marynaty wkładam karkówkę. Nacieram i odstawiam na 2 godziny w chłodne miejsce.\n" +
                        "3. Mięso razem z marynatą przekładam do rękawa do pieczenia. Rękaw związuję i układam na blaszce. Mięso piekę około 2 godzin w temperaturze 180 stopni. Po upieczeniu usuwam nici. Mięso kroję na porcję.",
                "Polska", R.drawable.karkowka_z_papryka));

        dodajPrzepis(new Przepisy("Spaghetti z sosem pomidorowym i brokułami", "Wspaniały pomysł na pyszny obiad, zwłaszcza dla wegetarian :-)", "1-2 osób", "Średnia kaloryczność", "\nSOS:\npomidor 3 szt\ncebula pół szt\nczosnek 1 ząbek\nkoncentrat pomidorowy 2 łyżki\nsos sojowy pół łyzki\n" +
                "bazylia otarta Prymat do smaku\nsól i pieprz do smaku\nolej do smażenia\n\nDODATKOWO:\nbrokuł 150g\nmakaron spaghetti 100g", "Pomidory sparzamy wrzątkiem, delikatnie obieramy ze skórki i kroimy na mniejsze kawałki. Cebulę obieramy, siekamy i podsmażamy na oleju. Dodajemy pomidory i dusimy na małym ogniu pod przykryciem. Gdy pomidory się całkiem rozpadną to dodajemy przyprawy, koncentrat pomidorowy i wyciśnięty przez praskę czosnek. Przez chwilę sos jeszcze gotujemy, a następnie ściągamy z ognia i miksujemy na gładko. Brokuła zalewamy osolonym wrzątkiem i gotujemy do miękkości. Następnie odcedzamy, kroimy na małe różyczki i dodajemy do sosu pomidorowego.\n" +
                "Makaron gotujemy według przepisu na opakowaniu i podajemy z sosem.", "Włoska", R.drawable.spaghettizsosempombrok));

        dodajPrzepis(new Przepisy("Penne z pomidorami i kurczakiem", "Obiad o włoskim charakterze w dosłownie kilka minut.", "1-2 osób", "Niska kaloryczność", "Pomidory krojone z puszki\npierś z kurczaka\ncebula 1 szt\noliwa z oliwek 2 łyżki\nbazylia świeża\npomidory suszone Smak 3 szt\nząbki czosnku 2 szt\noregano\nzioła prowansalskie\nsól do smaku\nmakaron penne 300g",
                "Pierś kurczaka umyć osuszyć i pokroić na drobne kawałki, posypać solą i pieprzem.Cebulę obrać i drobniutko pokroić Na patelni rozgrzać oliwę i zeszklić cebulę, a następnie dodać mięso i obsmażyć na złoto. Do mięsa z cebulą dodać pomidory z puszki, przeciśnięte przez praskę ząbki czosnku i zioła. Dodać również pokrojone suszone pomidory, dusić pod przykryciem 15 minut.\n" +
                        "Makaron ugotować al'dente, odcedzić i jeszcze gorący wymieszać z sosem. Podawać z liskami świeżej bazylii. Smacznego!", "Włoska", R.drawable.penne));


        dodajPrzepis(new Przepisy("Quesadillas z pieczoną piersią z kurczaka i serem cheddar", "Quesadillas jest jednym z najpopularniejszych dań kuchni meksykańskiej. Jest to połączenie kilku popularnych składników, a samo przygotowanie jest bardzo proste.",
                "3-4 osoby", "Średnia kaloryczność", "piersi z kurczaka 2 szt\nguacamole 4 łyżki\npapryka czerwona 1/2 szt\ncebula czerwona 1 szt\nkolendra 1 pęczek\nolej do smażenia\n\nMARYNATA:\nolej 1 łyżka\nczosnek 2 ząbki\npasta Sambal Oelek 1 łyżeczka\nsól\nkolendra do smaku\ncheddar 100g\ntortilla 8(pszenna)",
                "Kurczaka dokładnie natrzeć marynatą, upiec w piekarniku lub na grillu, a następnie wystudzić i pokroić w plastry. Na patelni skropionej oliwą położyć placek pszenny posmarowany guacamole, równomiernie ułożyć na nim plastry upieczonej wcześniej piersi kurczaka, posypać pokrojoną w paski papryką, posiekaną czerwoną cebulą oraz tartym serem wymieszanym z kolendrą. Przykryć drugim plackiem i smażyć, w trakcie lekko dociskając, przez około 5 minut z każdej strony. Gotowe danie pokroić na kawałki i podawać z ulubionymi sosami np. salsą pomidorową i salsą serową.",
                "Meksykańska", R.drawable.quesadillas));

        dodajPrzepis(new Przepisy("Pizza z boczkiem cebulą kaparami", "Pizza dla osób lubiących kapary i smakowe wyzwania kulinarne.", "1-2 osób", "Średnia kaloryczność", "drożdze 10g\nwoda letnia 1/2 szkl\nmąka 1. 1/2 szkl\nsól\nprzyprawa do pizzy\noliwa 2 łyżki\n\nFARSZ:\nsos pomidorowy 4 łyżki\nboczek 5 plastrów\npieczarki 4szt\ncebula czerwona 1 szt\nser żółty 100g\noliwki 4 szt\nkapary 10 szt",
                "Wodę podgrzewamy by była letnia wlewamy do miski dodajemy drożdże,zioła ,sól ,mąkę i olej wyrabiamy ciasto ,ma być niezbyt twarde ,dzięki temu będzie miękkie po upieczeniu .\n" +
                        "Rozwałkowywujemy na okrągłej tacy od tortownicy .Zostawiamy na 30 min do podrośnięcia .\n" +
                        "Smarujemy sosem pomidorowym do pizzy,ja użyłam gotowego .\n" +
                        "Cebulę kroimy w piórka i wykładamy na ciasto ,następnie poszatkowane w plastry pieczarki , oliwki i boczek .Kapary zostawiłam w całości i takie dałam ,posypujemy przyprawą do pizzy i zapiekamy bez sera 20 min w tem 180st ,po tym czasie posypujemy startym serem i jeszcze z 5-7 min pieczemy.",
                "Włoska", R.drawable.pizza_kapary));

        dodajPrzepis(new Przepisy("Sałatka z kurczakiem, winogronami i pestkami dyni", "Przepis na lekką i dietetyczną sałatkę", "1-2 osób", "Niska kaloryczność", "sałata masłowa 5 liści\nwinogrona czerwone 1 mała kiść\nwinogrona białe 1 mała kiść\nfilet z kurczaka 1 szt (pojedynczy)\npomidor malinowy 1 szt\nogórek 1 szt\npestki dyni 3 łyżki\noliwa z oliwek 2 łyżki\nsok z cytryny 1 łyżeczka\ncukier\nsól i pieprz",
                "1.Filet z kurczaka gotuję do miękkości w osolonej wodzie. Studzę i kroję na mniejsze kawałki. Winogrona obieram z kiści. Pomidor malinowy kroję w ósemki. Ogórek obieram i kroję w kostkę. Pestki dyni prażę na suchej patelni.\n" +
                        "\n" +
                        "2.Sałaty płuczę i rozdrabniam. Dodaję filet z kurczaka, winogrona, pomidora, ogórka i pestki dyni. Delikatnie mieszam.\n" +
                        "\n" +
                        "3.Oliwię z oliwek mieszam z cukrem, sokiem z cytryny, solą i pierzem. Przygotowanym dresingiem polewam sałatkę.", "Polska", R.drawable.salatkakurczakwinogronad));

        dodajPrzepis(new Przepisy("Sałatka ziemniaczana z rzodkiewką", "Lekka i smaczna sałatka!", "3-4 osoby", "Niska kaloryczność", "ziemniaki 6 sztuk\nrzodkiewki 1 pęczek\nogórek kiszony 2 sztuki\nolej lniany 2 łyżki\ncebula szalotka 1 sztuka\nsok z cytryny 2 łyżki\nczosnek 1 ząbek\nkoperek 1/2 pęczka\nsól i pieprz 1/2 łyżeczki",
                "Ziemniaki ugotuj w mundurkach na parze. Rzodkiewki, cebulę i ogórka potnij w plasterki. Wymieszaj. Olej, sok z cytryny i ząbek czosnku wymieszaj do konsystencji sosu. Polej sałatkę, dopraw solą i pieprzem oraz koperkiem lub natką pietruszki.",
                "Polska", R.drawable.salziemzrzodk));

        dodajPrzepis(new Przepisy("Tortilla z kurczakiem na szybko", "Zrób w domu pyszne, meksykańskie danie!", "3-4 osoby", "Średnia kaloryczność", "tortilla 4 placki\nfilet z kurczaka 350g\nolej 1 łyżka\nprzyprawy 1 łyżka kebab-gyros\nkukurydza w puszcze 1 mała puszka\npomidor\nkapusta pekińska 150g\nkiełki 1 opakowanie ulubionych\n\nSOS:\njogurt naturalny 150g\nmajonez 1 łyżka\nczosnek 2 ząbki\nsól do smaku\nzioła prowansalskie 1 łyżeczka",
                "1. Kurczaka umyć, osuszyć, pokroić w paski, obsypać przyprawą i odstawić do lodówki na pół godziny.\n" +
                        "Kukurydzę osączyć z zalewy, pomidora umyć, pokroić w półplasterki.\n" +
                        "2. Jogurt wymieszać z majonezem, przeciśniętym przez praskę czosnkiem, doprawić do smaku solą i ziołami.\n" +
                        "3. Placki tortilli ogrzać na suchej patelni lub w mikrofali, posmarować sosem, wyłożyć po porcji kapusty pekińskiej, kurczaka, pomidora, kukurydzy i kiełków, zwinąć, można spiąć wykałaczką i gotowe.",
                "Hiszpańska", R.drawable.tortillakurczak));

        dodajPrzepis(new Przepisy("Zupa pomidorowa na ostro", "Ostra i ziołowa odmiana tradycyjnej pomidorowej", "3-4 osoby", "Niska kaloryczność", "bulion drobiowy 1,5 litra\npomidory krojone z puszki 1 puszka\nczosnek w oleju z ziołami 3 ząbki\nsłodka papryka Prymat 1/2 łyżeczki\nchili pieprz cayenne\nmakaron\nmajeranek Prymat\nser żółty 100g\nsól i pieprz",
                "Makaron gotujemy wg przepisu z opakowania, taką ilość jak lubimy do zupy.\nDo garnka wrzucamy pomidory i czosnek(pokrojony w plasterki),chwilę dusimy, następnie dolewamy bulion, dodajemy sól, pieprz, chilli i paprykę.\nGotujemy 15 minut, po tym czasie ściagamy z ognia i miksujemy na krem.\nNa talerz wykladamy makaron, wlewamy zupę, posypujemy ją majerankiem do smaku i żółtym tartym serem.\nSmacznego!",
                "Hiszpańska", R.drawable.zupapomostra));


        dodajPrzepis(new Przepisy("Ryba po grecku","Klasyczna ryba w greckim stylu, smaczna i prosta w wykonaniu","5+ osób","Średnia kaloryczność","filet z miruny 1 kg\nmarchewka 5 szt\npietruszka 4 szt\nseler 1/2 szt\nkawałek pora (biała część)\ncebula 2 szt\nwoda gorąca 2,5 szkl\nziele angielskie całe 5 ziarenek\nliście laurowe Prymat 2\nsól i pieprz\nbazylia otarta Prymat\nprzyprawa uniwersalna Kucharek do smaku\nkoncentrat pomidorowy 1 słoik\njajka 4 szt\nprzyprawa do ryb 1 łyżeczka\nmąka pszenna\nolej do smażenia",
                "Rybę po rozmrożeniu dokładnie osuszyć a następnie pokroić na mniejsze kawałki\nOprószyć lekko solą i pieprzem, jajka rozbełtać dodając przyprawę do ryb\nDo rozbełtanych jajek włożyć kawałki ryby i odstawić na 15 - 20 minut w chłodne miejsce.\nPo tym czasie rybę wyjmować po kawałku i panierować w mące a następnie smażyć na rozgrzanym oleju z obu stron na złoty kolor.\nJarzyny obrać , opłukać a następnie zetrzeć na tarce o grubych oczkach\nWłożyć do garnka, zalać gorącą wodą i gotować około 10 minut dodając do gotowania liście laurowe i ziele angielskie.\nNa gorącym oleju podsmażyć pokrojoną cebule, pod koniec smalenia dodać pokrojony por.\nDo podsmażonej cebuli dodać ugotowane jarzyny wraz z wywarem, dodać przyprawy a następnie rozmieszany z odrobiną gorącej wody koncentrat pomidorowy.\nSmacznego!",
                "Polska",R.drawable.rybapogrecku));

        dodajPrzepis(new Przepisy("Krem z borowików","Krem na bazie warzyw oraz grzybów, ciekawa alternatywa w daniach z grzybami","5+ osób","Średnia kaloryczność","marchew 1 szt\npietruszka 1 szt\nnatka pietruszki\npor (biała część) 1/2 szt\nseler korzeniowy 1/4 szt\nborowiki 250 g\nśmietana kremówka 1/2 szkl\nsól do smaku\npieprz\nmasło 1 łyżka",
                "1. Jarzyny obrać, pokroić w mniejsze części, zalać wodą i zagotować. Doprawić do smaku.\n2. Borowiki (u mnie mrożone) usmażyć na maśle.\n3. Do wywaru przełożyć usmażone grzyby i gotować ok. 2 min. Ostudzić.\n4. Następnie całość dokładnie zmiksować.\n5.  Zupę zagotować, dodać kremówkę.\n6.  Podawać np. z groszkiem ptysiowym.\nSmacznego!",
                "Polska",R.drawable.kremgrzybowy));

        dodajPrzepis(new Przepisy("Chilli Con Carne","Dobrze znana meksykańska potrawa o ostrym i wyrazistym smaku, poczuj smak meksyku w swoim domu","5+ osób","Średnia kaloryczność","mięso mielone wołowe 600 g\npomidory krojone 2 puszki\npapryka czerwona 1\npapryczka chilli 3\nczosnek 3 ząbki\ncebula 1\nkoncentrat pomidorowy 3-4 łyżki\nczekolada gorzka 2 kostki (75-80%)\npapryka słodka mielona 2 łyżeczki\npapryka ostra mielona 1/2 łyżeczki\ntabasco 1 łyżka\nkumin 1 łyżeczka\noregano 1 łyżeczka\ncukier 2 szczypty\noliwa\npieprz czarny mielony\nsól",
                "Cebulę i czosnek obieramy, drobno siekamy. Papryczki chili kroimy w drobną kostkę. W rondelku rozgrzewamy trochę oliwy i na małym ogniu podsmażamy cebulę. Kiedy cebulka lekko się zeszkli dodajemy papryczki chili i smażymy około 1 minuty. Dodajemy mięso mielone i podsmażamy na średnim ogniu, mieszając. Kiedy mięso straci swój surowy kolor, dodajemy pomidory, koncentrat pomidorowy i wszystkie przyprawy. Doprowadzamy do wrzenia, zmniejszamy ogień i gotujemy bez przykrycia około 25-30 minut.\nW tym czasie paprykę myjemy, oczyszczamy z gniazda nasiennego i kroimy w niewielką kostkę. Fasolę odsączamy na sicie i płuczemy pod bieżącą wodą. Do mięsa dodajemy paprykę, fasolę i czekoladę. Mieszamy i gotujemy jeszcze około 10 minut, aby smaki się połączyły. Danie serwujemy ze świeżym pieczywem lub opiekanymi tortillami",
                "Meksykańska",R.drawable.chilli));

        dodajPrzepis(new Przepisy("Caldo Verde","Caldo verde – popularna zupa tradycyjnej kuchni portugalskiej. Potrawa wywodzi się ze znajdującego się w północnej Portugalii regionu Minho, a z uwagi prostotę i lekkość podawana jest przed lub już po głównym daniu.",
                "5+ osób","Średnia kaloryczność","ziemniaki 1 kg\nchorizo 200 g\njarmuż 250 g\nbulion warzywny 3 l\ncebula 1\nkoncentrat pomidorowy 2-3 łyżki\npor 1\nczosnek 2-3 ząbki\nchilli pieprz cayanne\nsól do smaku\npieprz czarny mielony\noliwa z oliwek\nkoper świeży 1/2 pęczka","Chorizo kroimy w półplasterki.Cebulę, czosnek obieramy i drobno siekamy.W garnku rozgrzewamy oliwę, dodajemy chorizo i smażymy do momentu, aż kiełbasa się wysmaży. Pod koniec smażenia dodajemy cebule, czosnek i drobno pokrojonego pora. Mieszamy i chwilę podsmażamy. Następnie dodajemy ziemniaki i smażymy przez 2 minuty, mieszając.Całość zalewamy bulionem i gotujemy. Kiedy ziemniaki będą miękkie dodajemy koncentrat pomidorowy i pokrojone na mniejsze kawałki liście jarmużu. Doprawiamy do smaku pieprzem, solą. Pamiętajmy jednak, że chorizo jest kiełbaską mocno przyprawioną, szczególnie dominuje w niej ostra papryka, więc należy uważać z przyprawami. Gotujemy przez 4-5 minuty, aż jarmuż zmięknie, a smaki się połączą. Zupę podajemy skropioną oliwą z oliwek.",
                "Meksykańska",R.drawable.caldoverde));

        dodajPrzepis(new Przepisy("Zupa z fasolą,papryką i mięsem mielonym","Przepis na zupę meksykańską z mięsem mielonym to sposób na danie w sam raz na chłodne jesienne i zimowe wieczory - taka zupa jest pysznie rozgrzewająca i wyjątkowo sycąca.","3-4 osoby","Średnia kaloryczność","mięso mielone 500 g\npapryka czerwona 2 szt\npapryczka chilli 1 szt\nfasola czerwona z puszki 1 op\nfasola biała z puszki 1 op\nkukurydza w puszcze 1 op\npomidory 4 szt\ncebula 2 szt\nryż 100 g\nkoncentrat pomidorowy 4 łyzeczki\nposiekany koper 3 łyżeczki\nsól\npieprz\npapryka słodka mielona\npapryka ostra mielona\nbazyla\noregano\nolej do smażenia",
                "Paprykę oczyścić i pokroić w kostkę, papryczkę chili drobno posiekać, cebulę obrać i posiekać, fasolę czerwoną i białą odcedzić i opłukać, kukurydzę odsączyć z zalewy, pomidory obrać ze skórki i pokroić w kostkę. Paprykę, papryczkę chili, pomidory, fasolę białą oraz czerwoną i kukurydzę przełożyć do garnka i zalać około 1,5 l wody, zagotować. Na patelni, na oleju podsmażyć cebulę, następnie dodać mięso mielone i je obsmażyć. Całość przełożyć do garnka. Dodać ryż, koncentrat pomidorowy i gotować około 15 minut. Na koniec doprawić do smaku solą, pieprzem, papryką, bazylią i oregano.\nZupę podawać posypaną posiekanym koperkiem.",
                "Meksykańska",R.drawable.zupfasolowa));

        dodajPrzepis(new Przepisy("Smażone kulki z ziemniaków"," Takie kulki to doskonały dodatek do drugiego dania, można podać je z mięsnym sosem i ulubioną surówką. Będzie to miłe urozmaicenie od zwykłych ziemniaków. Można nimi zaskoczyć gości. Dodam że, można je również podjadać bez żadnych dodatków. Z wierzchu jest chrupiąca skorupka, a środek mięciutki. Jeżeli macie dość tradycyjnych tłuczonych ziemniaków to bardzo polecam Wam takie kulki. Zapewniam, że będzie pysznie. Zapraszam :)","5+ osób","Wysoka kaloryczność","ziemniaki 1 kg\nmaka pszenna półtora szklanki\nmąka ziemniaczana 2 lekko kopiaste łyżki\njajka 2 szt\nsól do smaku\nolej do smażenia\nbułka tarta kilka łyżek\n",
                "Ziemniaki obieramy, dokładnie myjemy i gotujemy do miękkości w osolonej wodzie. Miękkie odcedzamy i przeciskamy przez praskę do ziemniaków, dokładnie studzimy, do zimnych ziemniaków wbijamy jajka, dodajemy obie mąki i zagniatamy ciasto. Gdy ciasto będzie jeszcze luźne dosypujemy odrobinę mąki pszennej.\n\n2. Z ciasta toczymy niewielkie kuleczki i obtaczamy w bułce tartej.\n\n3. W garnku rozgrzewamy olej, partiami wrzucamy kulki ziemniaczane i smażymy po kilka minut do zrumienienia często je obracając. Usmażone wyjmujemy łyżką cedzakową na papierowy ręcznik, żeby odsączyć z nadmiaru tłuszczu.\n\n 4. Podajemy i smacznego. ",
                "Polska",R.drawable.kulkiziemniaczane ));

        dodajPrzepis(new Przepisy("Surówka z pekińskiej kapusty","Szybka surówka, która urozmaici każde danie, doskonale smakuje również sama","5+ osób","Średnia kaloryczność","kapusta pekińska 1/2 szt\nmarchewki 2 szt\ncebula 1 szt\nnatka pietruszki 1/2 pęczka\nsól i pieprz do smaku\nmajonez 3 łyżki\nśmietana 18% 3 łyżki\njogurt grecki 2 łyżki",
                "Kapustę obrać z wierzchnich liści przeciąć na pół a następnie na ćwiartki. Każdą ćwiartkę drobno pokroić a następnie sparzyć gorącą wodą i odsączyć na sicie. Marchewkę obrać, opłukać zetrzeć na tarce grube oczka. Cebule obrać, a następnie pokroić w pół księżyce. Wszystkie składniki połączyć razem dodać opłukaną posiekaną natkę pietruszki, sól i pieprz do smaku.Śmietanę wymieszać z majonezem oraz jogurtem naturalnym (gęstym) wlać do surówki i delikatnie wymieszać do połączenia składników.","Polska",
                R.drawable.salatkapekin));

        dodajPrzepis(new Przepisy("Cebularze","Wywodzący się z kuchni żydowskiej pszenny placek, o średnicy od 15 do 20 centymetrów, pokryty pokrojoną w kostkę cebulą","5+ osób","Średnia kaloryczność","maka pszenna 4 szkl\nmleko 1,5 szkl\ndrożdże 4 dkg\nmasło 2 łyżki\nolej 3 łyżki\ncukier 1 łyżka\nsól 1 łyżeczka\ncebula 1 kg\nolej do smażenia\nsól do smaku\nczarny pieprz\njajko do posmarowania",
                "Do garnuszka dajemy rozkruszone drożdże, zasypujemy cukrem, dolewamy pół szklanki letniego mleka, mieszamy, dodajemy 3 łyżki maki, mieszamy aby nie było grudek i odstawiamy rozczyn na około 20 minut w ciepłe miejsce.\n\n Łączymy ze sobą pozostałe składniki na ciasto, dodajemy wyrośnięty rozczyn i zagniatamy ciasto i odstawiamy w ciepłe miejsce do wyrośnięcia.\n\n Kroimy cebulę,podsmażamy na oleju i doprawiamy do smaku pieprzem i solą.\n\n Bierzemy po trochę wyrośniętego ciasta, rozwałkowujemy, wycinamy większe kółka, na środku robimy dołek i dajemy w niego podsmażoną cebulę. Naokoło smarujemy cebulaki rozkłóconym jajkiem.\n\n Pieczemy około 30-40 minut w temp. 200 stopni, aż do zarumienienia. ",
                "Polska",R.drawable.cebularzexd));

        dodajPrzepis(new Przepisy("Zupa z soczewicy","Ciekawy sposób na ugotowanie wysokobiałkowego posiłku z soczewicy","5+ osób","Średnia kaloryczność","soczewica 200 g\npomidory pelati 200 g\npomidory suszone 3 łyżki\ncebula 2 szt\nżabki czosnku 2 szt\noliwa 2 łyżki\nrosół z kury 1l\nkolendra cała 1 pęczek\npestki słonecznika 2 łyżki\nkwaśna śmietana 4 łyżki\njabłuszka kaparowe\nsól morska\nkmin rzymski\nimbir zielony",
                "Soczewicę płuczemy i gotujemy do miękkości, przez 15-20 min. Cebulę i czosnek siekamy.Podsmażamy w garnku na rozgrzanej oliwie. Do garnka dodajemy ugotowaną soczewicę. Doprawiamy do smaku kminem rzymskim. Następnie dodajemy pomidory pelati, pokrojone suszone pomidory. Doprawiamy do smaku imbirem i mieszamy. Zalewamy rosołem z kury doprawiamy solą morską i gotujemy około 10 min. Kolendrę siekamy. Nasiona słonecznika prażymy na suchej patelni. Zupę blendujemy. Przelewamy do talerzy. Każdą porcję posypujemy posiekaną kolendrą, kładziemy łyżkę śmietany i posypujemy prażonym słonecznikiem. Dekorujemy jabłuszkami kaparowymi.",
                "Polska",R.drawable.soczewicazupa));

        dodajPrzepis(new Przepisy("Spaghetti z pesto z rukoli, kawiorem i kozim serem","Szpinakowy makaron spaghetti otulony wyrazistym pesto z rukoli, drobnym kawiorem z gromadników oraz kozim serem. Ta kompozycja smaków i aromatów cudownie rozpieści nasze kubki smakowe. Gorąco Wam ją polecam :)","3-4 osoby","Średnia kaloryczność","makaron sphagetti\nkawior (z gromadników)\nser kozi\nrukola 130 g\nser kozi 50 g\norzechy włoskie 50 g\nczosnek 2 ząbki\noliwa z oliwek około 1/2 szklanki\nsól i pieprz","KROK 1. Listki rukoli przekładamy do rozdrabniacza wraz z czosnkiem oraz częścią oliwy z oliwek i miksujemy dla delikatnego rozdrobnienia. Następnie dodajemy rozbite w moździerzu lub zmielone orzechy włoskie, starty ser kozi, pozostałą część oliwy z oliwek i ponownie miksujemy dla odpowiedniego połączenia. Całość doprawiamy do smaku solą i świeżo zmielonym pieprzem. \n\nKROK 2. Makaron spaghetti gotujemy al dente w lekko osolonej wodzie, odcedzamy i mieszamy z wcześniej przygotowanym pesto oraz kawiorem z gromadników. Całość posypujemy dodatkową ilością startego koziego sera.\n\nKawior z ikry gromadników jest bardzo intensywny w smaku, ale jest pozbawiony rybnego zapachu. Jest cenny w wartości odżywcze tj. nienasycone kwasy tłuszczowe, fosfor, witaminę A i E oraz aminokwasy. Życzę smacznego! :) ",
                "Włoska",R.drawable.sphagettizpesto));

        dodajPrzepis(new Przepisy("Kurczak pieczony na soli","Ciekawy sposób na przyrządzenie całego kurczaka","5+ osób","Średnia kaloryczność","kurczak (cały) 1,5 kg\nczosnek 3 ząbki\nmajeranek 1 łyżeczka\ntymianek 1 łyżeczka\npapryka słodka mielona 3/4 łyżeczki\npapryka ostra mielona 3/4 łyżeczki\ncurry 1/2 łyżeczki\npieprz\nsól 1 kg","Kurczaka umyć, dokładnie osuszyć, a następnie porządnie natrzeć (również środku) posiekanym czosnkiem oraz mieszanką przypraw. Całość odstawić do lodówki minimum na kilka godzin, a najlepiej na całą noc.Po tym czasie na dnie naczynia żaroodpornego należy równomiernie rozsypać sól, a nogi kurczaka związać sznurkiem.Kurczaka ułożyć na soli piersiami do góry i wstawić do rozgrzanego piekarnika.(Nie należy już go przesuwać, aby w skórę nie wetrzeć soli.)Piec 1,5 godziny (1 kg = 1 h) w 180 stopniach - bez przykrycia.(Kurczak się nie wysuszy, ponieważ sól zatrzymuje wodę",
                "Polska",R.drawable.kurczaksol));

        dodajPrzepis(new Przepisy("Racuszki z zsiadłym mlekiem","Klasyczny przepis na znane i lubiane racuszki","3-4 osoby","Średnie"," zsiadłe mleko 250 ml\n mąka pszenna 200 gram\njajka 2 szt\nsól 1 szczypta\ncukier puder 1 łyżka","Żółtka utrzyj z cukrem pudrem, a następnie dodaj zsiadłe mleko i połącz. Dodaj mąkę wraz z solą i białka ubite na sztywną pianę. Wymieszaj.Na rozgrzanej patelni smaż racuszki z obu stron na złoty kolor","Polska",R.drawable.racuszki));

        dodajPrzepis(new Przepisy("Półfrancuskie paluchy z serem żółtym i ketchupem","Doskonale sprawdzą się na różnych imprezach czy tak po prostu na przekąskę. Smakują na gorąco zaraz po upieczeniu jak na zimno. Jeżeli będą podawane na zimno to można je przygotować nawet dzień wcześniej.","5+ osób","Wysoka kaloryczność","mąka pszenna 2 szklanki\n masło lub margaryna 20 dag\n jajko 1 sztuka\n śmietana 18 proc gęsta pół szklanki\n mąka pszenna do posypania stolnicy\n ser żółty 15 dag\n ketchup łagodny według uznania","1. Z podanych składników zagniatamy ciasto, formujemy kulę i wkładamy do lodówki do schłodzenia na co najmniej pół godziny.\n\n 2. Następnie ciasto wałkujemy na posypanej mąką stolnicy, kroimy w dość szerokie pasy, na każdy wyciskamy ketchup i lekko go rozsmarowujemy, posypujemy serem żółtym startym na tarce o drobnych oczkach i zwijamy formując świderki.\n\n 3. Tak wykonane paluchy układamy na blasze wyłożonej papierem do pieczenia i pieczemy do zrumienienia w temperaturze 180 stopni przez około 25-30 minut.\n\n 4. Tak upieczone są gotowe do podania. Smacznego życzę.",
                "Polska",R.drawable.paluchy));

        dodajPrzepis(new Przepisy("Zapiekanka ziemniaczana z wołowiną","Bardzo dobry pomysł na szybki obiad w postaci zapiekanki z wołowiną, szybki w wykonaniu i bardzo smaczny","3-4 osoby","Średnia kaloryczność"," ziemniaki 600 gram\n wołowina 300 gram\n cebula 1 szt\n pieczarki 200 gram\n Pomidory krojone z puszki 1 puszka\n ser żółty 100 gram\n śmietana 3 łyżki\n gałka muszkatołowa Prymat mielona 1/4 łyżeczki\n oliwa z oliwek 4 łyżki\n masło 1 łyżka\nsól\npieprz\n papryka słodka mielona 1 łyżka\n tymianek Prymat 1 łyżka\n papryka ostra mielona 1 szczypta\n wędzona papryka w proszku 1 łyżka",
                "Wołowinę umyć, osuszyć i zmielić w maszynce. Dodać paprykę wędzoną, 2 łyżki oliwy i pół łyżeczki soli. Wymieszać i wstawić na noc do lodówki.Ziemniaki obrać i gotować przez 13 minut w osolonej wodzie, licząc od momentu wrzenia. Następnie pokroić w plasterki.Cebulę pokroić w kostkę i zeszklić na pozostałej oliwie. Dodać mięso, smażyć aż straci swój czerwony kolor. Dodać pomidory w puszce, pieprz, sól, tymianek, paprykę słodką i ostrą. Wymieszać i dusić kilka minut.Pieczarki oczyścić, pokroić na plasterki i podsmażyć na maśle, posolić.Naczynie żaroodporne posmarować tłuszczem i układać warstwy zapiekanki: ziemniaki, mięso, pieczarki, ziemniaki, mięso, pieczarki, ziemniaki.Ser żółty zetrzeć na tarce o dużych oczkach, wymieszać ze śmietaną i gałką muszkatołową. Posmarować wierzch zapiekanki.Piec pod przykryciem przez 10 minut w piekarniku nagrzanym to temperatury 180 stopni. Odkryć naczynie i piec jeszcze 20 minut.Smacznego :) ","Polska",R.drawable.zapieksa));

        dodajPrzepis(new Przepisy("Naleśniki z proszkiem budyniowym","Proszek budyniowy nadaje im ciekawego smaku oraz delikatności. Ciasto jest elastyczne i posiada kuszący aromat","5+ osób","Niska kaloryczność"," jajka 2 sztuki\n mleko 1 szklanka\n woda gazowana 3/4 szklanki\n mąka pszenna 1,5 szklanki\n cukier waniliowy 1 łyżka\n budyń 1/2 opakowania\n sól 1 szczypta\n olej 2 łyżki",
                "Jajka należy ubić i wymieszać z wodą, mlekiem oraz szczyptą soli.Następnie wsypać mąkę z cukrem i proszek budyniowy.\n\nPo ponownym rozmieszaniu wlać olej i delikatnie rozprowadzić go za pomocą łyżki (placki nie będą przywierały do patelni).(Ciasto powinno spływać po łyżce zostawiając jednolitą smugę.)\n\nNa rozgrzanej patelni (*) szybkim ruchem rozprowadzić cienką warstwę ciasta.Każdy placek smażyć z obu stron do zrumienienia się.\n\n(*) Nie używam oleju do smażenia, ponieważ mam idealną patelnię do naleśników.Po za tym olej w cieście sprawia, że placki nie przywierają. Jeśli macie problemy przyklejaniem się naleśników - możecie powierzchnię patelni delikatnie natłuścić.","Polska",R.drawable.nalesnikizproszkiem));

        dodajPrzepis(new Przepisy("Udka w marynacie jogurtowej","Bardzo smaczny i prosty sposón na kurczaka w nietypowej marynacie, jeżeli potrzebujemy szybko cos pysznego na obiad","3-4 osoby","Średnia kaloryczność"," udka kurczaka 6 szt.\n jogurt naturalny 90 g\n przyprawa do kurczaka - ziołowa 2 łyżeczki\n sól 1/2 łyżeczki\n","Kurczaka myję i osuszam ręcznikiem papierowym.Składniki marynaty łączę, dokładnie nacieram mięso, odkładam do lodówki. Piekę pod przykryciem 80 minut w 180 stopniach, następnie 10-15 minut bez pokrywki do momentu przyrumienienia się mięsa","Polska",R.drawable.kurczakmarynata));

        dodajPrzepis(new Przepisy("Sałatka z makaronem z zupek chińskich i kurczakiem","Smaczna i szybka sałatka, ma swój wyjątkowy i niepowtarzalny smak","5+ osób","Średnia kaloryczność","makaron z zupek chińskich, 2 opakowania\npierś z kurczaka większa\n przyprawa kebab - gyros Prymat\npor średniej wielkości\npapryka czerwona duża\nkukurydza w puszce puszka\n sól i pieprz\n olej łyżka\n majonez","Makaron kruszę, zalewam wrzątkiem, przykrywam i odstawiam. Kurczaka kroję w kostkę, podsmażam na oleju z dodatkiem przyprawy gyros - krótko na dużym ogniu, często mieszam (ma być zarumieniony, ale soczysty w środku). Wykładam na ręcznik papierowy.Pora przekrawam wzdłuż, następnie kroję w cienkie paseczki. Paprykę kroję w kostkę. Kukurydzę osączam z zalewy Makaron odcedzam, łączę z kurczakiem, warzywami i majonezem. Doprawiam do smaku solą i pieprzem","Polska",R.drawable.salatkazmakaronemchinskim));

        dodajPrzepis(new Przepisy("Domowa Shoarma z kurczaka","Domowy przepis na bliskowschodnią potrawe w postaci skrawków mięsa.","3-4 osoby","Średnia kaloryczność"," filet z kurczaka podwójny, duży  \n olej 6 łyżek  \n papryka słodka mielona 2 łyżeczki  \n kmin rzymski 2 łyżeczki  \n czosnek granulowany łyżeczka  \n sól 1 i 1/2 łyżeczki  \n chili pieprz cayenne 1/2 łyżeczki  \n kurkuma łyżeczka  \n cynamon szczypta","Mięso oczyszczam, każdą pierś przekrawam wzdłuż na połówki i kroję w cienkie plasterki.Z podanych składników przygotowuję marynatę, mieszam z mięsem i odkładam do lodówki. Podsmażam przez kilka minut na rozgrzanej patelni na średnim ogniu - często mieszam. Podaję z ulubioną surówką i frytkami lub pieczonymi ziemniakami.","Polska",R.drawable.shoarma));

        dodajPrzepis(new Przepisy("Tortilla z młodych warzyw","Czysto wegetariańska wersja na smaczną tortille","3-4 osoby","Średnia kaloryczność"," ziemniaki młode 400 g\n kalarepka młoda 1 szt\n cebula 1 mała\n marchew młoda 150 g\n rzodkiewki 4 szt\n oliwa z oliwek 4 łyżki\n groszek cukrowy 100 g\n jajka 4 szt\n natka pietruszki\n sól i pieprz",
                "Ziemniaki, kalarepę, marchew i rzodkiewkę umyłem, obrałem, pokroiłem w cienkie plasterki. Na patelni rozgrzałem 2 łyżki oliwy. Plasterki ziemniaków smażyłem przez 10 minut, stale je obracałem. Cebulę pokroiłem w kostkę. Groszek umyłem, oczyściłem. Oba składniki dodałem do ziemniaków razem z kalarepą, marchwią i pozostałą oliwą, smażyłem razem na średnim ogniu przez kolejne 10 minut. Posoliłem, popieprzyłem.","Hiszpańska",R.drawable.tortillazmlodychwarzyw));

        dodajPrzepis(new Przepisy("Sos Romesco","Pomysł na sos w hiszpańskim stylu, idealny dodatek do tortilli.","5+ osób","Średnia kalorczyność"," papryka czerwona 5 szt\n pomidory 3-4 szt\n migdały 3/4 szkl\n chleb czerstwy 2 kromki\n ząbki czosnku 10 szt\n papryczka chili 1 mała\n oliwa z oliwek 1/2-3/4 szkl\n ocet winny 3-4 łyżki\n papryka słodka mielona 1,5 łyżeczki\n sól i pieprz\n koncentrat pomidorowy 1 łyżka","Migdały zalać gorącą wodą, obrać ze skórki a następnie podprażyć na patelni na lekko złoto.Papryki i pomidory przekroić na pół, z papryk usunąć nasiona i wyłożyć warzywa na blachę do pieczenia, dołożyć do nich 6 ząbków czosnku, skropić oliwą oprószyć solą i pieprzem i piec aż skórka się zaczerni w nagrzanym do 200-220 st. piekarniku. Po tym czasie paprykę włożyć do woreczka, zamknąć szczelnie i po ok. 5 minutach usunąć skórkę, wraz z pozostałymi składnikami-oprócz chleba-włożyć do robota kuchennego. Chleb podpiec na patelni na mocny złoty kolor, może się nawet lekko przypalić, pokroić go w kostkę i włożyć do blendera.Zmiksować, spróbować i ew. dodać do smaku soli i pieprzu. Podawać na chlebie razowym albo jaka pasta/ sos/ salsa do grillowanych mięs. Doskonale smakuje z gorąca ciabatą",
                "Hiszpańska",R.drawable.sosromesco));

        dodajPrzepis(new Przepisy("Pieczone jabłka z pomarańczą, cynamonem, miodem","Aromatyczne jabłka pieczone rozgrzeją każdego i dodadzą finezji na stole. Najpyszniejsze jabłuszka pieczone na deser, na kolację, są bardzo zdrowe, lekkostrawne, bardzo aromatyczne, smakują na ciepło i na zimno.","1-2 osoby","Średnia kaloryczność","jabłka 12 szt\npomarańcze 3 szt\ncynamon wg uznania\nmiód lipowy wg uznania","Jabłka raczej o jednakowej wielkości dobrze umyć, wydrążarką do jabłek usunąć gniazdka nasienne\nStawiać je w blaszce, do każdego jabłka włożyć cząstkę pomarańczy, posypać cynamonem, ponownie pomarańczę i po łyżeczce miodu., na koniec posypać tartą bułką\n piekarnik nagrzany na 210C, grzanie góra/Dół, jabłka piec około 40-50 minut\n po wyjęciu z piekarnika puszczonym sokiem z dna formy mocno polać każde jabłko.SMACZNEGO!!! ","Deser",R.drawable.jablkapieczone));

        dodajPrzepis(new Przepisy("Muffiny z porem i mozzarellą","Ciekawa alternatywa dla słodkich babeczek, idealne jako przystawka","5+osób","Średnia kaloryczność"," mozarella 100 gram\n por 60 gram\n jajko 1 sztuka\n mleko 100 ml\n olej 100 ml\n mąka pszenna 130 gram\n proszek do pieczenia 1 łyżeczka\n sól morska 1/2 łyżeczki\n papryka ostra mielona 1/3 łyżeczki\n gałka muszkatołowa mielona 2 szczypty\npapryka słodka mielona","Ser zetrzeć na tarce (o dużych i średnich oczkach) - odrobinę zostawić do posypania wierzchu.Pora pokroić w półplasterki.W pierwszej misce wymieszać mąkę, proszek do pieczenia, sól, paprykę i gałkę muszkatołową.W drugiej zmiksować jajko, olej i wodę.Suche składniki połączyć z mokrymi i następnie zmieszać z porem oraz mozzarellą.(Masę należy mieszać ręcznie - widelcem i do połączenia się całości, nie dłużej.)Formę do muffinek wyłożyć papilotkami i wypełnić ciastem (do 4/5 wysokości papilotek).Babeczki posypać resztą sera i delikatnie oprószyć przyprawami.Piec przez około 25 minut (do tzw. \"suchego patyczka\") w temperaturze 180 stopni.Ciastka wyjąć z blachy i ostudzić na kratce.Przechowywać pod przykryciem - w temperaturze pokojowej.","Polska",R.drawable.slonebabeczki));

        dodajPrzepis(new Przepisy("Sernik z masłem orzechowym i kajmakiem","Bardzo dobra alternatywa dla klasycznego sernika","5+ osób","Wysoka kaloryczność"," herbatniki 220 g\n masło 120 g\n ser biały 1kg 30 dag\n masło orzechowe 12 łyżek\n jajka 4 szt\n żółtka 2 szt\n śmietana 18 proc 200 ml\n cukier 1 szklanka\n skórka pomarańczowa 1 łyżeczka\n masa kajmakowa pół puszki\n orzechy włoskie do posypania ciasta","Spód: Herbatniki kruszymy na piasek, masło rozpuszczamy, studzimy i łączymy z ciastkami. Blaszkę wykładamy papierem do pieczenia. Ciastka wykładamy na papier, dociskamy do dna blaszki i wkładamy do lodówki na 30 min.\n\n Masa serowa: Ser mielimy dwukrotnie. Jeśli używamy sera z wiaderka to nie trzeba go mielić. Do garnka wkładamy wszystkie składniki na masę serową i miksujemy do połączenia składników. Masy nie należy zbyt długo miksować, ponieważ nie potrzebnie ją napowietrzymy. Na ciasteczkowy spód wylewamy masę serową. Piekarnik rozgrzewamy. Na dno piekarnika wstawiamy blaszkę z wodą. Ciasto wstawiamy do piekarnika i pieczemy w 170 st. C przez 60-75 min. Następnie sernik studzimy przy uchylonych drzwiczkach piekarnika. Gdy sernik wystygnie, smarujemy go masą kajmakową. Orzechy włoskie drobno siekamy i posypujemy nimi wierzch ciasta.","Deser",R.drawable.sernikzmaslemorzech));

        dodajPrzepis(new Przepisy("Trójczekoladowe ciasto z serka mascarpone"," Ciasto jest przepyszne i u mnie zawsze znika ekspresowo. Przeważnie robię je na bazie serka mascarpone, dzięki czemu przypomina delikatny i kremowy deser.","5+ osób","Średnia kaloryczność"," serek mascarpone 500 gram\n śmietana kremówka 300 gram\n żelatyna 3 łyżeczki\n woda gorąca 6 łyżek\n czekolada gorzka 100 gram\n czekolada mleczna 100 gram\n biała czekolada 100 gram\n cukier 100 gram\n cukier waniliowy 2 łyżki\n herbatniki 10 sztuk","Żelatynę rozpuścić w gorącej wodzie i lekko ostudzić.\n Ser mascarpone utrzeć z cukrem i cukrem waniliowym, a następnie połączyć z żelatyną.\n (Uprzednio wymieszaną z 2 łyżkami masy.)\n Masę podzielić na 3 części.\n\n Czekolady osobno roztopić w kąpieli wodnej.\n\n Kremówkę ubić na sztywno i również podzielić na 3 porcje.\n\n Każdą część masy serkowej wymieszać z jedną czekoladą, a na końcu delikatnie połączyć z kremówką.\n\n Formę wyłożyć papierem do pieczenia i do jej środka kolejno wlewać masę z gorzką czekoladą, z mleczną i na koniec z białą.\n Na górze ułożyć herbatniki.\n Ciasto schłodzić w lodówce - najlepiej przez całą noc.\n\n Po tym czasie serniczek wyjąć z formy, odwracając go do góry dnem i ściągnąć z niego papier.\n Całość udekorować według uznania.","Deser",R.drawable.ciastomascarpone));

        dodajPrzepis(new Przepisy("Zupa ogórkowa z papryką","Dodaj pikanterii do swojej pomidorowej","3-4 osoby","Niska kaloryczność","ćwiartki z kurczaka 2 szt\n indycza szyjka 1 duża szt\n papryka czerwona 1 szt\n ziemniaki 4 szt\n marchew 2 szt\n pietruszka 1 szt\n seler korzeniowy 1/4 szt\n ogórki kiszone 400 gram\n liście laurowe Prymat 3 szt\n ziele angielskie całe kilka ziarenek\nsól\npieprz"," Mięso umyć i zalać zimną wodą. Dodać ziele angielskie, liście laurowe i sól. Gotować wywar do momentu, aż mięso będzie miękkie. Następnie wyjąć mięso z zupy, a wywar przecedzić przez sito.\n Paprykę i ziemniaki pokroić w kostkę. Marchewkę, pietruszkę i selera zetrzeć na tarce o dużych oczkach.\n Dodać warzywa do przecedzonego wywaru. Gotować 20 minut od momentu wrzenia.\n Dodać starte na tarce ogórki i gotować jeszcze 5 minut. \n Przyprawić zupę do smaku dużą ilością świeżo zmielonego pieprzu. \n Smacznego :)","Polska",R.drawable.ogorkowazpapryka));

        dodajPrzepis(new Przepisy("Kotlety mięsno - ryżowe"," Bardzo smaczne, soczyste kotlety mielone na niedzielny obiad.","5+ osób","Średnia kaloryczność"," mięso mielone 400 g\n ryż 3/4 szkl\n cebula 1 szt\n papryka czerwona 1/2 szt\n czosnek ząbki 2\n jajko 1\n majeranek Prymat 1/2 łyżeczki\n zioła prowansalskie 1 łyżeczka\n natka pietruszki suszona 1  łyżeczka\n sól i pieprz do smaku\n przyprawa un. Kucharek do smaku\n przyprawa do zup i potraw w płynie do smaku"," Mięso mielone przekładamy do dużej miski. Dodajemy obraną i pokrojoną w kostkę cebule, obrany i pokrojony drobno czosnek oraz oczyszczoną z gniazd nasiennych, umytą i pokrojoną w kostkę paprykę czerwoną a także przyprawy.\n Ryż gotujemy na sypko. Po ugotowaniu i odsączeniu dodajemy go do masy mięsnej. Do masy mięsnej dodajemy jajko, całość dokładnie mieszamy do połączenia składników.\n Z masy formujemy kotleciki, które panierujemy w bułce tartej, a następnie smażymy na gorącym oleju z każdej strony na złoty kolor.\n Podajemy z ziemniaczkami oraz ulubioną surówką.","Polska",R.drawable.kotletyryzowe));

        dodajPrzepis(new Przepisy("Szybkie ciasto ucierane z mrożonymi truskawkami","Szybki sposób na smaczny deser","5+ osób","Średnia kaloryczność"," mąka pszenna 3 szklanki\n cukier 1 szklanka\n proszek do pieczenia 2 łyżeczki\n jajka 5 szt\n olej 3/4 szklanki\n olejek wanilinowy 1 łyżeczka\n skórka pomarańczowa 1 łyżeczka\n mąka pszenna 1 szklanka\n margaryna 0,5 kostki\n cukier puder 0,5 szklanki\n truskawki mrożone 600 g\n cukier puder\n bułka tarta"," Jajka ucieramy z cukrem, następnie stopniowo dodajemy olej i olejek waniliowy. W oddzielnej misce łączymy przesianą mąkę pszenną, proszek do pieczenia oraz startą skórkę z pomarańczy. Suche składniki dodajemy do masy jajecznej i delikatnie mieszamy do połączenia składników. Blaszkę wykładamy papierem do pieczenia. Ciasto wylewamy na blaszkę, delikatnie posypujemy bułką tartą, następnie układamy na cieście truskawki. Składniki kruszonki łączymy opuszkami palców i posypujemy nią wierzch ciasta. Piekarnik rozgrzewamy. Ciasto pieczemy w 180 st. C przez 1 h. aż włożony w środek ciasta patyczek będzie suchy. Upieczone i ostygnięte ciasto posypujemy cukrem pudrem.","Deser",R.drawable.szybkieciasto));





    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL
                ("CREATE TABLE przepisy(" +
                        "_id integer primary key autoincrement,"
                        + "nazwa TEXT, "
                        + "opis TEXT,"
                        + "porcje INTEGER,"
                        + "kalorie TEXT,"
                        + "skladniki TEXT,"
                        + "przygotowanie TEXT,"
                        + "kategoria TEXT,"
                        + "id_zdjecia INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS przepisy");
        onCreate(db);


    }

    void dodajPrzepis(Przepisy przepisy) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("nazwa", przepisy.getNazwa());
        values.put("opis", przepisy.getOpis());
        values.put("porcje", przepisy.getPorcje());
        values.put("kalorie", przepisy.getKalorie());
        values.put("skladniki", przepisy.getSkladniki());
        values.put("przygotowanie", przepisy.getPrzygotowanie());
        values.put("kategoria", przepisy.getKategoria());
        values.put("id_zdjecia", przepisy.getResourceID());
        db.insert("przepisy", null, values);
        db.close();


    }


    public void kasujPrzepis(int id) {
        SQLiteDatabase db = getReadableDatabase();
        String[] argumenty = {"" + id};
        db.delete("przepisy", "nr=?", argumenty);
    }

    public void aktualizujPrzepis(Przepisy przepisy) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues recipesValues = new ContentValues();
        recipesValues.put("nazwa", przepisy.getNazwa());
        recipesValues.put("opis", przepisy.getOpis());
        recipesValues.put("porcje", przepisy.getPorcje());
        recipesValues.put("kalorie", przepisy.getKalorie());
        recipesValues.put("skladniki", przepisy.getSkladniki());
        recipesValues.put("przygotowanie", przepisy.getPrzygotowanie());
        recipesValues.put("kategoria", przepisy.getKategoria());
        recipesValues.put("id_zdjecia", przepisy.getResourceID());
        String args[] = {przepisy.getNr() + ""};
        db.update("przepisy", recipesValues, "nr=?", args);
    }


    public Przepisy dajPrzepisy(int nr) {
        Przepisy przepisy = new Przepisy();
        SQLiteDatabase db = getReadableDatabase();
        String[] kolumny = {"nr", "nazwa", "opis", "porcje", "kalorie", "skladniki", "przygotowanie", "kategoria", "resourceID"};
        String args[] = {nr + ""};
        Cursor kursor = db.query("przepisy", kolumny, " nr=?", args, null, null, null, null);
        if (kursor != null) {
            kursor.moveToFirst();
            przepisy.setNr(kursor.getLong(0));
            przepisy.setNazwa(kursor.getString(1));
            przepisy.setOpis(kursor.getString(2));
            przepisy.setPorcje(kursor.getString(3));
            przepisy.setKalorie(kursor.getString(4));
            przepisy.setSkladniki(kursor.getString(5));
            przepisy.setKategoria(kursor.getString(6));
            przepisy.setResourceID(kursor.getInt(7));
        }
        return przepisy;

    }


    public ArrayList<Przepisy> getAllRecipesData(String sql) {
       ArrayList<Przepisy> recipesList = new ArrayList<>();
       // String sql = "SELECT * FROM przepisy";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            do {
                Przepisy przepisy = new Przepisy();
                przepisy.setNazwa(cursor.getString(1));
                przepisy.setOpis(cursor.getString(2));;
                przepisy.setPorcje(cursor.getString(3));
                przepisy.setKalorie(cursor.getString(4));
                przepisy.setSkladniki(cursor.getString(5));;
                przepisy.setPrzygotowanie(cursor.getString(6));
                przepisy.setKategoria(cursor.getString(7));
                przepisy.setResourceID(cursor.getInt(8));
                recipesList.add(przepisy);
            } while (cursor.moveToNext());
            cursor.close();
            db.close();
        }
        return recipesList;
    }
    /*public Cursor readAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        String[] columns = new String[]{"_id","nazwa", "opis", "porcje", "kalorie", "skladniki", "przygotowanie", "kategoria", "id_zdjecia"};
        Cursor c = db.query("przepisy", columns, null, null, null, null, "_id" + " desc");
        if (c != null) {
            c.moveToFirst();
        }
        return c;
    }

        public Przepisy sortuj(){
            Przepisy przepisy = new Przepisy();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM 'przepisy' ORDER BY 'nazwa' DESC ", null);
        if (c.moveToFirst()){
            do {

                przepisy.setNazwa(c.getString(1));

            } while(c.moveToNext());
        }
        c.close();
        db.close();
    return przepisy;
    }
    */




}





